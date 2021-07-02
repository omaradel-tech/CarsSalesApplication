/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalesapplication;

/**
 *
 * @author DELL
 */
public class CarForSearch {
    int YearOfPurch;
    String cost;
    String manufacturer;
    String color;
    String model;
    static int x;
    public CarForSearch(String manufacturer, String model, String color, int YearOfPurch, String cost) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.YearOfPurch = YearOfPurch;
        this.cost = cost;
    }
}
