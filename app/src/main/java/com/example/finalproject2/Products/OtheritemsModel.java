package com.example.finalproject2.Products;


public class OtheritemsModel {
    private String tvNamaItem,tvHarga;
    private int imgItem;

    public OtheritemsModel(String tvNamaItem, String tvHarga,int imgItem) {
        this.imgItem = imgItem;
        this.tvNamaItem = tvNamaItem;
        this.tvHarga = tvHarga;

    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }

    public String getTvNamaItem() {
        return tvNamaItem;
    }

    public void setTvNamaItem(String tvNamaItem) {
        this.tvNamaItem = tvNamaItem;
    }

    public String getTvHarga() {
        return tvHarga;
    }

    public void setTvHarga(String tvHarga) {
        this.tvHarga = tvHarga;
    }


}

