package com.company;

public class Singleton {

    private static Singleton instance = null;

    protected Singleton(){
        //Eksisterer udelukkende for at undgå instansiering
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("All the single ladys");
        }

        return instance;
    }


}

