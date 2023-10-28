/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.GarbageStation;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Manager {
    private final int MAX_GARBAGE = 10000; // 10 tons in kg
    private final int LOAD_TIME = 8; // minutes
    private final int DUMP_TIME = 30; // minutes
    private final int COST_PER_HOUR = 120000; // VND
    private final int DUMP_COST = 57000; // VND

    public int calculateCost(List<GarbageStation> stations) {
        int totalGarbage = 0;
        int totalTime = 0;
        int totalCost = 0;

        for (int i = 0; i < stations.size(); i++) {
            GarbageStation station = stations.get(i);
            totalGarbage += station.getGarbageAmount();
            totalTime += LOAD_TIME;

            while (totalGarbage >= MAX_GARBAGE) {
                totalGarbage -= MAX_GARBAGE;
                totalTime += DUMP_TIME;
                totalCost += DUMP_COST;
            }

            // Check if this is the last station and add return time
            if (i == stations.size() - 1) {
                totalTime += DUMP_TIME;
            }
        }
        // dump remaining garbage
        if (totalGarbage > 0) {
            totalTime += DUMP_TIME;
            totalCost += DUMP_COST;
        }

        totalCost += (totalTime / 60) * COST_PER_HOUR; // convert time to hours for cost calculation

        return totalCost;
    }
}
