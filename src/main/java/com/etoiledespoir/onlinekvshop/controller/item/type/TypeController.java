package com.etoiledespoir.onlinekvshop.controller.item.type;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.itemType.TypeOfItem;
import com.etoiledespoir.onlinekvshop.factory.domain.item.type.TypeFactory;
import com.etoiledespoir.onlinekvshop.service.item.type.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/type")
public class TypeController implements Icontroller<TypeOfItem,String> {
    @Autowired
    TypesService typesService;
    @PostMapping("/create")
    @Override
    public TypeOfItem create(@RequestBody TypeOfItem typeOfItem) {
        TypeOfItem typeOfItem1 = TypeFactory.getType(typeOfItem.getTypeName());
        return typesService.creat(typeOfItem1);
    }

    @GetMapping("/read")
    @Override
    public TypeOfItem read(@RequestParam("id")String id) {
        return typesService.read(id);
    }

    @PostMapping("/update")
    @Override
    public TypeOfItem update(@RequestBody TypeOfItem typeOfItem) {
        return typesService.Update(typeOfItem);
    }

    @GetMapping("/delete")
    @Override
    public TypeOfItem delete(@RequestParam("id") String id) {
        return typesService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<TypeOfItem> readAll() {
        return typesService.readAll();
    }
}
