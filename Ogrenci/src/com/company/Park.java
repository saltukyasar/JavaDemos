package com.company;

import java.util.ArrayList;
import java.util.List;



public class Park {

    private int index;
    ArrayList<Car> carArrayList = new ArrayList<Car>(20);
    int carCounter;

    public Park() {
        for(int i=0;i<20;i++){
            carArrayList.add(null);
        }
        carCounter = 0;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayList<Car> getCarArrayList() {
        return carArrayList;
    }

    public void setCarArrayList(ArrayList<Car> carArrayList) {
        this.carArrayList = carArrayList;
    }

    public void AddCarToPark(Car car, int index){



        if( car!= null && carArrayList != null && carCounter<20 ) {
            System.out.println("This car index: " + car.getIndex());

            if(car.getIndex()<20 && carArrayList.get(car.getIndex()) == null){
                carArrayList.add(index, car);
                carCounter++;
            }
            else{
                System.out.println("Cannot park because index out of bound or park index is not empty");
            }

        } else {
            System.out.println("araba indisi : " + car.getIndex());
            System.out.println("park full dolu...");
        }

        if(carArrayList!= null && carCounter >= 5){

            for(int i =0 ;i<20;i++){

                if(carArrayList.get(i) == null){
                    System.out.println("indis bostur" + i);
                }
                if(carArrayList.get(i)!= null) {
                    System.out.println("bu indis doludur" + i);
                }
            }

        }


    }

}