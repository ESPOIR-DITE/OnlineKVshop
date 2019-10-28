package com.etoiledespoir.onlinekvshop.factory.domain.color;

import com.etoiledespoir.onlinekvshop.domain.color.Color;
import com.etoiledespoir.onlinekvshop.util.Igenerator;

public class ColorFactory {
    public static Color getColor( String color){
        return new Color.Builder(Igenerator.getSuffixFromClassName(ColorFactory.class)).buildColor(color).build();
    }
    public static Color updateColor(String id, String color){
        return new Color.Builder(id).buildColor(color).build();
    }
}
