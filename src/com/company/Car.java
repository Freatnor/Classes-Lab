package com.company;

/**
 * Created by administrator on 6/27/16.
 */
public class Car {
    private String mBrand;
    private String mColor;
    private double mTopSpeed;

    public Car(){
        mBrand = "Default Brand";
        mColor = "Black";
        mTopSpeed = 140.0;
    }

    public Car(String brand, String color, double topSpeed) {
        mBrand = brand;
        mColor = color;
        mTopSpeed = topSpeed;
    }

    public String getBrand() {
        return mBrand;
    }

    public void setBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String mColor) {
        this.mColor = mColor;
    }

    public double getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(double mTopSpeed) {
        this.mTopSpeed = mTopSpeed;
    }

    public void go(){
        System.out.println(mBrand + " " + mColor + " car is going!");
    }

    public void slow(){
        System.out.println(mBrand + " " + mColor + " car is slowing!");
    }

    public void stop(){
        System.out.println(mBrand + " " + mColor + " car is stopping!");
    }

    public void runStopLight(){
        System.out.println(mBrand + " " + mColor + " car is running the light!!");

    }

    public boolean willRunStopLight(){
        int x = (int) (Math.random() * 10);
        if(x < 2)
            return true;
        return false;
    }
}
