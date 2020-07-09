package com.etoiledespoir.onlinekvshop.controller.user.gender;
import com.etoiledespoir.onlinekvshop.controller.Icontroller;
import com.etoiledespoir.onlinekvshop.domain.users.gender.Gender;
import com.etoiledespoir.onlinekvshop.factory.domain.user.gender.GenderFactory;
import com.etoiledespoir.onlinekvshop.service.user.gender.GenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/OKVS/gender")
public class GenderController implements Icontroller<Gender, String> {
    @Autowired
    GenderService genderService;

    @PostMapping("/create")
    public Gender create(@RequestBody Gender gender) {
        System.out.println(gender.toString());
        Gender myGender= GenderFactory.getGender(gender.getGenderName());
        System.out.println(myGender.toString());
        return genderService.creat(myGender);
    }

    @GetMapping("/read")
    @Override
    public Gender read(@RequestParam("id") String id) {
        return genderService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Gender update(@RequestBody Gender gender) {
        return genderService.Update(gender);
    }

    @GetMapping("/delete")
    @Override
    public Gender delete(@RequestParam("id") String id) {
        return genderService.delete(id);
    }

    @GetMapping("/reads")
    @Override
    public List<Gender> readAll() {
        return genderService.readAll();
    }
    @GetMapping("/readWith")
    public Gender readWithGender(@RequestParam("id") String gender){
        return genderService.readWithGender(gender);
    }

}
