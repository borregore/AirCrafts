package com.flyingMachines.service;

import com.flyingMachines.model.flyingArtifacts.FlyingMachine;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classifier {

    public static void machineWithMaxWeight(List<FlyingMachine> list) {
        Collections.sort(list, Comparator.comparing(FlyingMachine::getFlyingMachineType).reversed().thenComparing(FlyingMachine::getRank));
    }

    public static void machineWithLowestWeight(List<FlyingMachine> list) {
    }

    public static void machineWithHighestFuelQuantity(List<FlyingMachine> list) {
    }

    public static void machineWithLowestFuelQuantity(List<FlyingMachine> list) {
    }

    public static void totalPrice(List<FlyingMachine> list) {
    }

    public static void airshipRank(List<FlyingMachine> list) {
        Collections.sort(list, Comparator.comparing(FlyingMachine::getRank));
        list.stream().forEach(x -> System.out.print(x + " "));
    }

    public static void airshipName(List<FlyingMachine> list) {
    }

    public static void quantityByType(List<FlyingMachine> list) {
    }

    public static void quantityByFuelType(List<FlyingMachine> list) {
    }

    public static void quantityByWings(List<FlyingMachine> list) {
    }

    public static void quantityByRockets(List<FlyingMachine> list) {
    }

    public static void quantityByCabin(List<FlyingMachine> list) {
    }

    public static void quantitiyByPropellers(List<FlyingMachine> list) {

    }
}
