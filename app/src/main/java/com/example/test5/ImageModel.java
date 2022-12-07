package com.example.test5;

public class ImageModel {
    private String caption;
    private int idThumb;
    private int idBig;

    public ImageModel(String caption, int idThumb, int idBig) {
        this.caption = caption;
        this.idThumb = idThumb;
        this.idBig = idBig;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getIdThumb() {
        return idThumb;
    }

    public void setIdThumb(int idThumb) {
        this.idThumb = idThumb;
    }

    public int getIdBig() {
        return idBig;
    }

    public void setIdBig(int idBig) {
        this.idBig = idBig;
    }
}
