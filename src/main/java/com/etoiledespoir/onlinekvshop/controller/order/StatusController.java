package com.etoiledespoir.onlinekvshop.controller.order;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.order.Status;
import com.etoiledespoir.onlinekvshop.factory.domain.order.StatusFactory;
import com.etoiledespoir.onlinekvshop.service.order.status.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/status")
public class StatusController implements Icontroller<Status,String> {
@Autowired
    StatusService statusService;

    @PostMapping("/create")
    @Override
    public Status create(@RequestBody Status status) {
        Status status1= StatusFactory.getStatus(status.getStat());
        return statusService.creat(status1);
    }

    @GetMapping("/read")
    @Override
    public Status read(@RequestParam("id") String id) {
        return statusService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Status update(@RequestBody Status status) {
        return statusService.Update(status);
    }

    @GetMapping("/delete")
    @Override
    public Status delete(@RequestParam("id") String id) {
        return statusService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Status> readAll() {
        return statusService.readAll();
    }

}
