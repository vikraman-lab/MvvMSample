package com.example.mvvmsample;

import android.os.Parcel;
import android.os.Parcelable;

public class NicePlaceModel implements Parcelable {
    private String name;
    private String area;


    protected NicePlaceModel(Parcel in) {
        name = in.readString();
        area = in.readString();
    }

    public NicePlaceModel() {

    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(area);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<NicePlaceModel> CREATOR = new Creator<NicePlaceModel>() {
        @Override
        public NicePlaceModel createFromParcel(Parcel in) {
            return new NicePlaceModel(in);
        }

        @Override
        public NicePlaceModel[] newArray(int size) {
            return new NicePlaceModel[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
