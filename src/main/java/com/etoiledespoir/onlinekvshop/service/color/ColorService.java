package com.etoiledespoir.onlinekvshop.service.color;

import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.repository.color.ColorRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ColorService implements Iservice<Color,String> {
    @Autowired
    ColorRep colorRep;
    private static ColorService colorService=null;

    private ColorService() {
    }
    public static ColorService getColorService(){
        if(colorService==null){
            colorService=new ColorService();
        }return colorService;
    }

    @Override
    public Color creat(Color color) {
        return colorRep.save(color);
    }

    @Override
    public Color delete(String id) {
        Optional<Color>result=colorRep.findById(id);
        colorRep.deleteById(id);
        return result.orElse(null);
    }

    @Override
    public Color Update(Color color) {
        return colorRep.save(color);
    }

    @Override
    public Color read(String id) {
        Optional<Color>result=colorRep.findById(id);
        return result.orElse(null);
    }
    public Color readWithName(String colorName){
        List<Color>result=colorRep.findAll();
        for(Color color:result){
            if(color.getColorName().equals(colorName)){
                return color;
            }
        }
        return null;
    }

    @Override
    public List<Color> readAll() {
        return colorRep.findAll();
    }

    public List<Color>itemColors(ArrayList<String> list){
        List<Color>toreturn=new ArrayList<>();
        List<Color>result=colorRep.findAll();
        for(int i=0; i<list.size();i++){
            //readWithName(list.get(i))
            toreturn.add(read(list.get(i)));     // we are reading the entire list of color and send it to the readWithName to get the entire object of the specified color
        }
        return toreturn;
    }
}
