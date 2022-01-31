package com.company;

public class SingletonPlanet {
    private static SingletonPlanet planet;
    public String value;

    private SingletonPlanet(String value) {
        this.value = value;
    }

    public static SingletonPlanet getPlanet(String value) {
        if (planet == null) {
            planet = new SingletonPlanet(value);
        }
        return planet;
    }

    @Override
    public String toString() {
        return "SingletonPlanet{" +
                "value='" + value + '\'' +
                '}';
    }
}
