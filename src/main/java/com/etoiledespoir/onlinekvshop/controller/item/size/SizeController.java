package com.etoiledespoir.onlinekvshop.controller.item.size;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.size.Size;
import com.etoiledespoir.onlinekvshop.factory.domain.item.size.SizeFactory;
import com.etoiledespoir.onlinekvshop.service.item.size.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/size")
public class SizeController implements Icontroller<Size,String> {
    @Autowired
    SizeService sizeService;
    @PostMapping("/create")
    @Override
    public Size create(@RequestBody Size size) {
        Size mysSize= SizeFactory.getSize(size.getSizeNumber());
        return sizeService.creat(mysSize);
    }

    @GetMapping("/read")
    @Override
    public Size read(@RequestParam("id") String id) {
        return sizeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Size update(@RequestBody Size size) {
        return sizeService.Update(size);
    }

    @GetMapping("/delete")
    @Override
    public Size delete(@RequestParam("id") String id) {
        return sizeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Size> readAll() {
        return sizeService.readAll();
    }
}
