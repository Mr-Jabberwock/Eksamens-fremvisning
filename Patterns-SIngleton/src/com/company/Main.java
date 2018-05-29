package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Singleton single = new Singleton();
        System.out.println("Nu gør jeg en ting");
        single.getInstance();

        System.out.println(" ");

        Singleton singelton = new Singleton();
        System.out.println("Det var sjovt, gør det igen");
        singelton.getInstance();



    }
}

