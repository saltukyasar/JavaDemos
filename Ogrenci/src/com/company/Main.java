package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
   //SORU 4
public class Main {

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static Car generateCar(int index){
        return new Car(index);
    }


    public static void main(String[] args) {
        List<Car> randomGenerateCarList = new ArrayList<>();
        Park park = new Park();


        List<Integer> range = IntStream.range(0, 25).boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Collections.shuffle(range);
        range.subList(0, 25).forEach(System.out::println);

        //With index
        for(int i =0;i<25;i++){
            randomGenerateCarList.add(generateCar(range.get(i)));
        }

        //With memory addresses
        //System.out.println(randomGenerateCarList);



        for(int i=0;i<25;i++){
            park.AddCarToPark(randomGenerateCarList.get(i),randomGenerateCarList.get(i).getIndex());

        }



    }
}