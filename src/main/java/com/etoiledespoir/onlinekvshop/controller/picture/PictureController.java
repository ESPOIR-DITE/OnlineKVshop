package com.etoiledespoir.onlinekvshop.controller.picture;


import org.springframework.web.bind.annotation.*;
import java.awt.*;
import java.util.ArrayList;


@RestController
@RequestMapping(value = "")
public class PictureController{}/** implements Icontroller<Pictures2,String> {
    @Autowired
    PictureService pictureService;
    @Autowired
    PictureServiceForWeb pictureServiceForWeb;

    @PostMapping("/creat")
    @Override
    public Pictures2 create(@RequestBody Pictures2 pictures2) {


        return pictureService.creat(pictures2);
    }

    @GetMapping("/read")
    @Override
    public Pictures2 read(@RequestParam(value = "id") String id) {
        System.out.println("in reading picture");
        return pictureService.read(id);
    }

    @PostMapping("/update")
    @Override
    public Pictures2 update(@RequestBody Pictures2 pictures2) {
        return pictureService.Update(pictures2);
    }

    @GetMapping("/delete")
    @Override
    public Pictures2 delete(@RequestParam(value = "id") String id) {
        return pictureService.delete(id);
    }

    @Override
    public ArrayList<String> readAll() {
     return null;
    }
    @GetMapping("/readAll")
    public ArrayList<Pictures2> getAll(){
        return pictureService.getAll();
    }
    @GetMapping("/readpic")
    public String readIcon(@RequestParam(value = "id") String id){
        Pictures2 pictures2= pictureServiceForWeb.read(id);
        System.out.println("the object is: "+pictures2.toString());
        return pictures2.getWebImage();
    }

    /**public @ResponseBody Map<String, String> getImage(@PathVariable String id) throws IOException {

       // File file = new ClassPathResource(imagesPath + imageName).getFile();

        String encodeImage = Base64.getEncoder().withoutPadding().encodeToString(Files.readAllBytes(file.toPath()));

        Map<String, String> jsonMap = new HashMap<>();

        jsonMap.put("content", encodeImage);

        return jsonMap;
    }
}*/
