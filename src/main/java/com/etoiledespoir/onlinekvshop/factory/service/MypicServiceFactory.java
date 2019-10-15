package com.etoiledespoir.onlinekvshop.factory.service;

import com.etoiledespoir.onlinekvshop.service.mypic.impl.PictureService;

public class MypicServiceFactory {
    public static PictureService getMypic(){
        return PictureService.getPictureService();
    }
}
