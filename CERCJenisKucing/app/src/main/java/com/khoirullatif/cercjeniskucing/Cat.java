package com.khoirullatif.cercjeniskucing;

import android.os.Parcel;
import android.os.Parcelable;

class Cat implements Parcelable {
    private String jenis;
    private String detail;
    private int image;
    private String harga;

    protected Cat(Parcel in) {
        jenis = in.readString();
        detail = in.readString();
        image = in.readInt();
        harga = in.readString();
    }

    public static final Creator<Cat> CREATOR = new Creator<Cat>() {
        @Override
        public Cat createFromParcel(Parcel in) {
            return new Cat(in);
        }

        @Override
        public Cat[] newArray(int size) {
            return new Cat[size];
        }
    };

    public Cat() {

    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(jenis);
        parcel.writeString(detail);
        parcel.writeInt(image);
        parcel.writeString(harga);
    }
}
