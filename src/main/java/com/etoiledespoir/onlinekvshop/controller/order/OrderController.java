package com.etoiledespoir.onlinekvshop.controller.order;


import com.etoiledespoir.onlinekvshop.domain.accounting.Accounting;
import com.etoiledespoir.onlinekvshop.domain.item.Items;
import com.etoiledespoir.onlinekvshop.domain.order.card.Card;
import com.etoiledespoir.onlinekvshop.domain.OrderHelper;
import com.etoiledespoir.onlinekvshop.domain.order.OrderLine;
import com.etoiledespoir.onlinekvshop.domain.order.OrderStatus;
import com.etoiledespoir.onlinekvshop.domain.order.Orders;
import com.etoiledespoir.onlinekvshop.factory.domain.order.OrderFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.order.OrderLineFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.order.OrderStatusFactory;
import com.etoiledespoir.onlinekvshop.factory.domain.order.orderHelper.OrderHelperFactory;
import com.etoiledespoir.onlinekvshop.service.item.ItemService;
import com.etoiledespoir.onlinekvshop.service.order.card.CardService;
import com.etoiledespoir.onlinekvshop.service.accounting.AccountingServce;
import com.etoiledespoir.onlinekvshop.service.order.OrderService;
import com.etoiledespoir.onlinekvshop.service.order.status.OrderStatusService;
import com.etoiledespoir.onlinekvshop.service.order.orderline.OrderLineService;
import com.etoiledespoir.onlinekvshop.util.CurrentDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/OKVS/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderLineService orderLineService;
    @Autowired
    private CardService cardService;
    @Autowired
    private ItemService itemService;
    @Autowired
    private AccountingServce accountingServce;
    @Autowired
    private OrderStatusService orderStatusService;

    @PostMapping("/create")
    public Boolean create(@RequestBody Card card) {
        System.out.println(card.toString());
        Orders orders1 = OrderFactory.getOrders(card.getCustomerId(), CurrentDate.getCurrentTimeUsingDate());
        orderService.creat(orders1);
        if (orders1 != null) {
            //creating orderLine
            OrderLine line = OrderLineFactory.getLine(card.getItemId(), orders1.getId(), card.getQuantity());
            OrderLine orderLine = orderLineService.creat(line);
            //now we are going to delete the card
            if (orderLine != null) {
                OrderStatus orderStatus= OrderStatusFactory.getOrderstatus(orders1.getId(),"New Order",CurrentDate.getCurrentDateTime(),"System");
                orderStatusService.creat(orderStatus);
                cardService.delete(card.getId());
                //SendEmailSMTP.sendGrid(card.getCustomerId(), 002, orders1.getId());
                return true;
            }
        }
        return false;
    }

    @GetMapping("/read")
    public Orders read(@RequestParam(value = "id") String id) {
        return orderService.read(id);
    }

    @PostMapping("/update")

    public Orders update(@RequestBody Orders order) {
        System.out.println(order.toString());
        return orderService.Update(order);
    }

    @GetMapping("/delete")

    public Orders delete(@RequestParam(value = "id") String id) {
        return orderService.delete(id);
    }

    @GetMapping("/reads")

    public List<Orders> readAll() {
        return orderService.readAll();
    }

    public List<Orders> readWithCustomer(String customerId) {
        return orderService.readWithCust(customerId);
    }

    public void sendEmail(String email, String itemId) {
        // we will need to send an email to this user we will try to give descriptions
    }

    @GetMapping("/track")
    public OrderHelper trackOrder(@RequestParam(value = "id") String orderNumber) {
        Orders orders = orderService.read(orderNumber);
        if (orders != null) {
            OrderLine orderLine = orderLineService.readWithOrderNumber(orders.getId());
            if (orderLine != null) {
                Items items = itemService.read(orderLine.getItemNumber());
                if (items != null) {
                    Accounting accounting = accountingServce.read(items.getId());
                    if (accounting != null) {
                        OrderStatus orderStatus = orderStatusService.readWithOrderId(orders.getId());
                        OrderHelper orderHelper = OrderHelperFactory.getOrderHelper(orders.getId(), orders.getDate(), items.getName(), orderLine.getQuantity(), accounting.getPrice(), orderStatus.getStat());
                        if (orderHelper != null) {
                            return orderHelper;
                        }
                    }
                }
            }
        }
        return null;
    }

}
