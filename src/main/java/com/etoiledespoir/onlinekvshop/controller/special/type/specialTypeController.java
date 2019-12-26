package com.etoiledespoir.onlinekvshop.controller.special.type;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.specials.type.SpecialType;
import com.etoiledespoir.onlinekvshop.service.special.type.SpecialTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/specialType")
public class specialTypeController implements Icontroller<SpecialType,String> {
    @Autowired
    SpecialTypeService specialTypeService;

    @PostMapping("/create")
    @Override
    public SpecialType create(@RequestBody SpecialType specialType) {
        return specialTypeService.creat(specialType);
    }

    @GetMapping("/read")
    @Override
    public SpecialType read(@RequestParam("id") String id) {
        return specialTypeService.read(id);
    }

    @PostMapping("/update")
    @Override
    public SpecialType update(@RequestBody SpecialType specialType) {
        return specialTypeService.Update(specialType);
    }

    @GetMapping("/delete")
    @Override
    public SpecialType delete(@RequestParam("id") String id) {
        return specialTypeService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<SpecialType> readAll() {
        return specialTypeService.readAll();
    }
}
