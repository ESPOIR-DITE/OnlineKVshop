package com.etoiledespoir.onlinekvshop.controller.color;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.factory.domain.color.ColorFactory;
import com.etoiledespoir.onlinekvshop.service.color.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("OKVS/color")
public class ColorsController implements Icontroller<Color,String> {
    @Autowired
    ColorService colorService;
    @PostMapping("/create")
    @Override
    public Color create(@RequestBody Color color) {
        System.out.println(color.toString());
        Color color1= ColorFactory.getColor(color.getColorName());
        return colorService.creat(color1);
    }

    @GetMapping("/read")
    @Override
    public Color read(@RequestParam ("id") String id) {
        return colorService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Color update(@RequestBody Color color) {
        return colorService.Update(color);
    }

    @GetMapping("/delete")
    @Override
    public Color delete(@RequestParam("id") String id) {
        return colorService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Color> readAll() {
        return colorService.readAll();
    }
}
