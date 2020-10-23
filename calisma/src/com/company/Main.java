package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<>();

        groups.add("ahmet");
        groups.add("mehmet");
        groups.add("ayse");
        groups.add("fatma");

        System.out.println("0. index "+ groups.get(0)) ;
        System.out.println("4. index "+ groups.get(2));
        System.out.println("Arraylist uzunuluk" + groups.size());
        groups.remove("mehmet");

        System.out.println(groups.indexOf("ayse"));

        for (int i=0;i<groups.size();i++){
            System.out.println("eleman " + groups.get(i));

        }
        groups.remove("mehmet");

    }
}
