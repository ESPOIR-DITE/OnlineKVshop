package com.etoiledespoir.onlinekvshop.controller.picture.impl;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/picture")
public class PicController implements Icontroller<Mypic,String> {
    @Autowired
    PictureService pictureService;
    @PostMapping("/create")
    @Override
    public Mypic create(@RequestBody Mypic mypic) {
        return pictureService.creat(mypic);
    }
    @GetMapping("/read")
    @Override
    public Mypic read(@RequestParam("id") String id) {
        return pictureService.read(id);
    }
    @PostMapping("/update")
    @Override
    public Mypic update(@RequestBody Mypic mypic) {
        return pictureService.Update(mypic);
    }
    @GetMapping("delete")
    @Override
    public Mypic delete(@RequestParam("id")String id) {
        return pictureService.delete(id);
    }
    @GetMapping("/reads")
    @Override
    public List<Mypic> readAll() {
        return pictureService.readAll();
    }
}
