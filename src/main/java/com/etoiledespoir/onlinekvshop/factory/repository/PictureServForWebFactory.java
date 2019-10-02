package com.etoiledespoir.onlinekvshop.factory.repository;

import com.etoiledespoir.onlinekvshop.repository.picture3.impl.PictureForWeb;
import com.etoiledespoir.onlinekvshop.service.picture3.PictureServForWebInt;
import com.etoiledespoir.onlinekvshop.service.picture3.impl.PictureServiceForWeb;

public class PictureServForWebFactory {
    public static PictureForWeb getPictureForWeb(){
        return PictureForWeb.getPictureRep();
    }
}
