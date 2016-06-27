package com.company;

/**
 * Created by administrator on 6/27/16.
 */
public class StopLight {

    private String mLightColor;

    public StopLight(String color){
        color = color.toLowerCase();
        if(!isValidColor(color)){
            mLightColor = "red";
        }
        else{
            mLightColor = color;
        }
    }

    private boolean isValidColor(String color){
        if(!(color.equals("red")||color.equals("green")||color.equals("yellow"))){
            return false;
        }
        return true;
    }

    public boolean isRed(){
        return mLightColor.equals("red");
    }

    public boolean isGreen(){
        return mLightColor.equals("green");
    }

    public boolean isYellow(){
        return mLightColor.equals("yellow");
    }

    public void setLightColor(String lightColor) {
        lightColor = lightColor.toLowerCase();
        if(!isValidColor(lightColor)){
            mLightColor = "red";
        }
        else{
            mLightColor = lightColor;
        }
    }

    public void setRandomLightColor(){
        int x = (int) (Math.random() * 10);
        if(x > 7)
            mLightColor = "red";
        else if(x > 3 && x <= 7)
            mLightColor = "green";
        else
            mLightColor = "yellow";
    }

    @Override
    public String toString(){
        return "The stoplight is " + mLightColor;
    }
}
