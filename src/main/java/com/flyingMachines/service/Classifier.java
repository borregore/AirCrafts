package com.flyingMachines.service;

import com.flyingMachines.model.flyingArtifacts.FlyingMachine;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Classifier {

    public static void machineWithMaxWeight(List<FlyingMachine> list) {
        System.out.println("Sorted by max weight.");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getTotalWeight).reversed());
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + ": " + x.getTotalWeight()));
        System.out.println();
    }

    public static void machineWithLowestWeight(List<FlyingMachine> list) {
        System.out.println("Sorted by lowest weight.");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getTotalWeight));
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + ": " + x.getTotalWeight()));
    }

    public static void machineWithHighestFuelQuantity(List<FlyingMachine> list) {
        System.out.println("Sorted by fuel quantity high");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getFuelCuantity).reversed());
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + ": " + x.getFuelCuantity()));
        System.out.println();
    }

    public static void machineWithLowestFuelQuantity(List<FlyingMachine> list) {
        System.out.println("Sorted by fuel quantity low");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getFuelCuantity));
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + ": " + x.getFuelCuantity()));
        System.out.println();
    }

    public static void totalPrice(List<FlyingMachine> list) {
        System.out.println("Sorted by price");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getTotalPrice));
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + ": " + x.getTotalPrice()));
        System.out.println();
    }

    public static void airshipRank(List<FlyingMachine> list) {
        System.out.println("Airships sorted by rank:");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getRank).reversed());
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + " rank: " + x.getRank()));
        System.out.println();
    }

    public static void airshipName(List<FlyingMachine> list) {
        System.out.println("Sorted by name");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getFlyingMachineType));
        list.stream().forEach(x -> x.getFlyingMachineType());
        System.out.println();
    }

    public static void quantityByType(List<FlyingMachine> list) {
        System.out.println("Sorted by quantity by type");
        System.out.println();
    }

    public static void quantityByFuelType(List<FlyingMachine> list) {
        System.out.println("Sortedby fuel type.");
        Collections.sort(list, Comparator.comparing(FlyingMachine::getFuelType));
        list.stream().forEach(x -> System.out.println(x.getFlyingMachineType() + ": " + x.getFuelType()));
        System.out.println();
    }

    public static void quantityByWings(List<FlyingMachine> list) {
        System.out.println("Sorted by wing quantity.");
        System.out.println();
    }

    public static void quantityByRockets(List<FlyingMachine> list) {
        System.out.println("Sorted by rocket queantity.");
        System.out.println();
    }

    public static void quantityByCabin(List<FlyingMachine> list) {
        System.out.println("Sorted by cabin Quantity");
        System.out.println();
    }

    public static void quantitiyByPropellers(List<FlyingMachine> list) {
        System.out.println("Sorted by propeller quantity.");
        System.out.println();
    }
}
