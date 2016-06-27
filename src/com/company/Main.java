package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StopLight stopLight = new StopLight("red");
        Car car1 = new Car("Ford", "Blue", 120);
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 19; i++) {
            cars.add(new Car());
        }

        for (int i = 0; i < 30; i++) {
            System.out.println("Round " + i);
            System.out.println(stopLight.toString());
            processCar(stopLight, car1);
            for (int j = 0; j < cars.size(); j++) {
                processCar(stopLight, cars.get(j));
            }
            stopLight.setRandomLightColor();
            System.out.println();
        }

    }

    public static void processCar(StopLight stopLight, Car c){
        if(stopLight.isRed()) {
            if(c.willRunStopLight())
                c.runStopLight();
            else
                c.stop();
        }
        else if(stopLight.isGreen())
            c.go();
        else
            c.slow();
    }

}
