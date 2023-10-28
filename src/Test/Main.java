/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controller.Manager;
import View.Display;
import java.util.List;
import Model.GarbageStation; 

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        List<GarbageStation> stations = Display.collectGarbageData();
        int totalCost = manager.calculateCost(stations);
        Display.display(totalCost);
    }
}