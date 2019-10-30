package com.etoiledespoir.onlinekvshop.factory.domain.pic.pictureHelpReader;

import com.etoiledespoir.onlinekvshop.domain.pic.picHelper.MypicHelpRead;

import java.util.ArrayList;

public class MypicHelpReadFactory {
    public static MypicHelpRead getMypicture(String name,String braind,String gender,double price, ArrayList<String> image, String description) {
        return new MypicHelpRead.Builder(name)
                .buildDesc(description)
                .buildImage(image)
                .buildBraind(braind)
                .buildGender(gender)
                .buildPrice(price)
                .build();
    }
}
