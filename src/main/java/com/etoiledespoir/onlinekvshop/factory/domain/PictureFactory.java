package com.etoiledespoir.onlinekvshop.factory.domain;

import com.etoiledespoir.onlinekvshop.domain.Picture;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PictureFactory {
    public static Picture getPicture(int pictureId, String picDescription, String url, File imageIcon ){
        return new Picture.Builder(pictureId).buildImageIcon(imageIcon).buildPicDescription(picDescription).buildUrl(url).getPicture();
    }
}
