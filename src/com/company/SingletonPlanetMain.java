package com.company;

public class SingletonPlanetMain {

    public static void main(String[] args) {
        SingletonPlanet singletonPlanet = SingletonPlanet.getPlanet("Earth");
        SingletonPlanet singletonPlanet1 = SingletonPlanet.getPlanet("Mars");
        SingletonPlanet singletonPlanet2 = SingletonPlanet.getPlanet("Jupiter");
        System.out.println(singletonPlanet);
        System.out.println(singletonPlanet1);
        System.out.println(singletonPlanet2);
    }
}