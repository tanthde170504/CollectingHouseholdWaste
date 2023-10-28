/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.GarbageStation;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Display {
    public static List<GarbageStation> collectGarbageData() {
        Scanner scanner = new Scanner(System.in);
        List<GarbageStation> stations = new ArrayList<>();

        System.out.println("Enter the amount of garbage at each station (end with any non-integer):");
        while (scanner.hasNextInt()) {
            stations.add(new GarbageStation(scanner.nextInt()));
        }

        return stations;
    }

    public static void display(int totalCost) {
        System.out.println("The total cost is " + totalCost + " VND");
    }
}
