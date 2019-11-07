package com.etoiledespoir.onlinekvshop.controller.braind;

import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.braind.Braind;
import com.etoiledespoir.onlinekvshop.factory.domain.braind.BraindFactory;
import com.etoiledespoir.onlinekvshop.service.braind.BraindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/OKVS/braind")
public class BraindController implements Icontroller<Braind,String> {
    @Autowired
    BraindService braindService;
    @PostMapping("/create")
    @Override
    public Braind create(@RequestBody Braind braind) {
        Braind braind1= BraindFactory.getBraind(braind.getBraind());
        return braindService.creat(braind1);
    }

    @GetMapping("/read")
    @Override
    public Braind read(@RequestParam("id") String id) {
        return braindService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Braind update(@RequestBody Braind braind) {
        return braindService.Update(braind);
    }

    @GetMapping("/delete")
    @Override
    public Braind delete(@RequestParam("id") String id) {
        return braindService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Braind> readAll() {
        return braindService.readAll();
    }
}
