package com.etoiledespoir.onlinekvshop.factory.domain.item.pic.pictureHelpReader;

import com.etoiledespoir.onlinekvshop.domain.item.color.Color;
import com.etoiledespoir.onlinekvshop.domain.item.pic.picHelper.MypicHelpRead;
import com.etoiledespoir.onlinekvshop.domain.item.size.Size;

import java.util.ArrayList;

public class MypicHelpReadFactory {
    public static MypicHelpRead getMypicture(String name, String braind, String gender, double price, ArrayList<String> image, String description, ArrayList<Size> sizes, ArrayList<Color> colors,String itemType) {
        return new MypicHelpRead.Builder(name)
                .buildDesc(description)
                .buildImage(image)
                .buildBraind(braind)
                .buildGender(gender)
                .buildPrice(price)
                .buildColors(colors)
                .buildSize(sizes)
                .buildItemType(itemType)
                .build();
    }
}
