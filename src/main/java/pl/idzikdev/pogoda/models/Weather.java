package pl.idzikdev.pogoda.models;

import lombok.Data;

@Data
public class Weather {
    private Main main;
    private String name;
    @Data
    public static class Main{
        private double temp;
        private int pressure;
        private int humidity;
    }
}
