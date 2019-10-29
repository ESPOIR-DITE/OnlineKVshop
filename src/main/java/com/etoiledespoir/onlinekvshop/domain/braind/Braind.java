package com.etoiledespoir.onlinekvshop.domain.braind;

public class Braind {
    private String braindId;
    private String braind;

    private Braind() {
    }

    public String getBraindId() {
        return braindId;
    }

    public void setBraindId(String braindId) {
        this.braindId = braindId;
    }

    public String getBraind() {
        return braind;
    }

    public void setBraind(String braind) {
        this.braind = braind;
    }

    @Override
    public String toString() {
        return "Braind{" +
                "braindId='" + braindId + '\'' +
                ", braind='" + braind + '\'' +
                '}';
    }
    public static class Builder{
        private String braindId;
        private String braind;
        public Builder(String braindId){
            this.braindId=braindId;
        }
        public Builder buidBraind(String braind){
            this.braind=braind;
            return this;
        }
        public Braind build(){
            Braind b=new Braind();
            b.braind=this.braind;
            b.braindId=this.braindId;
            return b;
        }
    }
}
