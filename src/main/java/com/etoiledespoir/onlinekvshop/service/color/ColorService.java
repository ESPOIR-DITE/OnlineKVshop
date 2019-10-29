package com.etoiledespoir.onlinekvshop.service.color;

import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.repository.color.ColorRep;
import com.etoiledespoir.onlinekvshop.service.Iservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<Color> readAll() {
        return colorRep.findAll();
    }
    public List<String>itemColors(ArrayList<String> list){
        List<String>toreturn=new ArrayList<>();
        List<Color>result=colorRep.findAll();
        for(Color color: result){
            if(color.)
        }
    }*/
}
