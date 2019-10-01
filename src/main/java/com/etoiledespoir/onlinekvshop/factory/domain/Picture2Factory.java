package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Pictures2;

import java.awt.*;
import java.io.File;

public class Picture2Factory {
    public static Pictures2 getPicture( String id ,String name,String desciption, File file/**Image image*/){
        return new Pictures2.Builder(id)
                .buildDescription(desciption)
                .buildFile(file)
                //.buildImage(image)
                .buildName(name)
                .getPicture2();
    }
    public static Pictures2 getPictureForRep( String id ,String name,String url,String desciption){
        return new Pictures2.Builder(id)
                .buildDescription(desciption)
                .buildName(name)
                .buildUrl(url)
                .getPicture2();
    }
    public static Pictures2 getPictureForRead( String id ,String name,String url,String desciption,Image image){
        return new Pictures2.Builder(id)
                .buildDescription(desciption)
                //.buildFile(file)
                .buildImage(image)
                .buildName(name)
                .buildUrl(url)
                .getPicture2();
    }
    public static Pictures2 getPictureForWeb( String id ,String name,String url,String desciption,String image){
        return new Pictures2.Builder(id)
                .buildDescription(desciption)
                //.buildFile(file)
                //.buildImage(image)
                .buildImageString(image)
                .buildName(name)
                .buildUrl(url)
                .getPicture2();
    }
}
