package com.etoiledespoir.onlinekvshop.domain.pic.picHelper;

import javax.persistence.Column;
import java.io.File;

public class MypicHelper {
    private String itemId;
    private File image;
    private String description;

    public MypicHelper() {
    }


    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MypicHelper{" +
                ", itemId='" + itemId + '\'' +
                ", image=" + image +
                ", description='" + description + '\'' +
                '}';
    }
}
