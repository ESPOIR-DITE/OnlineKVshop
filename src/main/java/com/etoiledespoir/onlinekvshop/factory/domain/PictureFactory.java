package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Picture;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;

public class PictureFactory {
    public static Picture getPicture(int pictureId, String picDescription, String url, File imageIcon){
        return new Picture.Builder(pictureId).buildImageIcon(imageIcon).buildPicDescription(picDescription).buildUrl(url).getPicture();
    }
    public static Picture getPicture2(int pictureId, String picDescription, String url, ImageIcon image){
        return new Picture.Builder(pictureId).buildImage(image).buildPicDescription(picDescription).buildUrl(url).getPicture();
    }
}
