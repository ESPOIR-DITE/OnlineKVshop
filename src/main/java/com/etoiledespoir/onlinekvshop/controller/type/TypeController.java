package com.etoiledespoir.onlinekvshop.controller.type;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.itemType.Types;
import com.etoiledespoir.onlinekvshop.factory.domain.productType.TypeFactory;
import com.etoiledespoir.onlinekvshop.service.productType.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/type")
public class TypeController implements Icontroller<Types,String> {
    @Autowired
    TypesService typesService;
    @PostMapping("/create")
    @Override
    public Types create(@RequestBody Types types) {
        Types types1= TypeFactory.getType(types.getTypeName());
        return typesService.creat(types1);
    }

    @GetMapping("/read")
    @Override
    public Types read(@RequestParam("id")String id) {
        return typesService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Types update(@RequestBody Types types) {
        return typesService.Update(types);
    }

    @GetMapping("/delete")
    @Override
    public Types delete(@RequestParam("id") String id) {
        return typesService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Types> readAll() {
        return typesService.readAll();
    }
}
