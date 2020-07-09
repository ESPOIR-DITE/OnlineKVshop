package com.etoiledespoir.onlinekvshop.controller.item.pictures;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.pictures.Images;
import com.etoiledespoir.onlinekvshop.factory.domain.item.pictures.ImagesFactory;
import com.etoiledespoir.onlinekvshop.service.item.pictures.ImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Base64;
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
        Images images1= ImagesFactory.updateImages(images.getId(),decoreder(images.getImage()));
        return imagesService.Update(images1);
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
    public byte[] decoreder(byte[] image) {
        String encodedString = Base64.getEncoder().encodeToString(image);
        byte[] byteArrray = encodedString.getBytes();
        return byteArrray;
    }
}
