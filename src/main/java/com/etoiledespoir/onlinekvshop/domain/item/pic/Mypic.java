package com.etoiledespoir.onlinekvshop.domain.item.pic;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mypic {
    @Id
    private String id;
    private String itemId;
    private String description;

    private Mypic() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "Mypic{" +
                "id='" + id + '\'' +
                ", itemId='" + itemId + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String itemId;
        private String description;


        public Builder(String id) {
            this.id = id;
        }

        /**public Builder buildImage(String image) {
            this.image = image;
            return this;
        }*/

        public Builder buildItemId(String itemId) {
            System.out.println(itemId+" in builder");
            this.itemId = itemId;
            return this;
        }
        public Builder buildDesc(String description){
            this.description=description;
            return this;
        }


        public Mypic build() {
            Mypic mypic = new Mypic();
            mypic.id = this.id;
            mypic.itemId = this.itemId;
            mypic.description=this.description;
            return mypic;
        }
    }
/**
    private static BufferedImage resize(BufferedImage img, int height, int width) {
        // System.out.println(img+"   in resize");
        Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    public static byte[] encodeImage(File inputString) {
        byte[] fileContent = new byte[0];
        try {
            fileContent = FileUtils.readFileToByteArray(inputString);
        } catch (IOException e) {
            e.printStackTrace();
        }


        return fileContent;
    }*/
}
