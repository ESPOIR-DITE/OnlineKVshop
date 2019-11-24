package com.etoiledespoir.onlinekvshop.controller.pictures;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.pictures.Images;
import com.etoiledespoir.onlinekvshop.factory.domain.pictures.ImagesFactory;
import com.etoiledespoir.onlinekvshop.service.pictures.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("OKVS/image")
public class ImageController implements Icontroller<Images,String> {
    @Autowired
    private ImagesService imagesService;

    @PostMapping("/create")
    @Override
    public Images create(@RequestBody Images images) {
        Images images1= ImagesFactory.getImages(images.getImage());
        return imagesService.creat(images1);
    }

    @GetMapping("/read")
    @Override
    public Images read(@RequestParam("id") String id) {
        return imagesService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Images update(@RequestBody Images images) {
        return imagesService.Update(images);
    }

    @GetMapping("/delete")
    @Override
    public Images delete(@RequestParam("id") String id) {
        return imagesService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Images> readAll() {
        return imagesService.readAll();
    }
    @GetMapping("/readFor")
    public List<Images> readFor(@RequestParam("id") String id){
        return imagesService.readFiles(id);
    }
}
