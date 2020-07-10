package com.etoiledespoir.onlinekvshop.controller.item.braind;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.item.braind.Brand;
import com.etoiledespoir.onlinekvshop.factory.domain.item.braind.BraindFactory;
import com.etoiledespoir.onlinekvshop.service.item.braind.BraindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/braind")
public class BraindController implements Icontroller<Brand,String> {
    @Autowired
    BraindService braindService;
    @PostMapping("/create")
    @Override
    public Brand create(@RequestBody Brand brand) {
        Brand brand1 = BraindFactory.getBraind(brand.getBrandName());
        return braindService.creat(brand1);
    }

    @GetMapping("/read")
    @Override
    public Brand read(@RequestParam("id") String id) {
        return braindService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Brand update(@RequestBody Brand brand) {
        return braindService.Update(brand);
    }

    @GetMapping("/delete")
    @Override
    public Brand delete(@RequestParam("id") String id) {
        return braindService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Brand> readAll() {
        return braindService.readAll();
    }
}
