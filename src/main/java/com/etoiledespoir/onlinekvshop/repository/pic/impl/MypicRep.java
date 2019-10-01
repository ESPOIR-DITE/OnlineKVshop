package com.etoiledespoir.onlinekvshop.repository.pic.impl;

import ch.qos.logback.core.util.FileUtil;
import com.etoiledespoir.onlinekvshop.domain.pic.Mypic;
import com.etoiledespoir.onlinekvshop.repository.pic.MypicInt;
import org.apache.commons.io.FileUtils;
import org.apache.tomcat.util.codec.binary.Base64;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MypicRep implements MypicInt {
    private static MypicRep mypicRep=null;

    private MypicRep() {
    }

    public static MypicRep getMypicRep(){
        if(mypicRep==null){
            mypicRep=new MypicRep();
        }return mypicRep;
    }

    @Override
    public Mypic creat(Mypic mypic) {
        return null;
    }

    @Override
    public Mypic delete(String id) {
        return null;
    }

    @Override
    public Mypic Update(Mypic mypic) {
        return null;
    }

    @Override
    public Mypic read(String id) {
        return null;
    }

    @Override
    public ArrayList<String> readAll() {
        return null;
    }

    @Override
    public String getPremier() {
        return null;
    }
    public String readFile(String id){
        BufferedImage bufferedImage=null;
        String imageDataString=null;
        File myfile=new File("C:\\Users\\ESPOIR\\IntelliJIDEAProjects\\onlinekvshop\\src\\main\\java\\com\\etoiledespoir\\onlinekvshop\\util\\MYPICTURES\\"+id+".png");
        try {
            //bufferedImage= ImageIO.read(myfile);
            byte[] fileContent= FileUtils.readFileToByteArray(myfile);
           // FileInputStream imageInFile = new FileInputStream(myfile);
           // byte imageData[] = new byte[(int) myfile.length()];
           // imageInFile.read(imageData);
            imageDataString = encodeImage(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageDataString;
    }
    public static String encodeImage(byte[] imageByteArray) {
         //Base64.encodeBase64URLSafeString(imageByteArray);
        String string= java.util.Base64.getEncoder().encodeToString(imageByteArray);
        return string;
    }

}
