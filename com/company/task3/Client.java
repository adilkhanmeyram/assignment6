package com.company.task3;

import com.company.task2.logistics.RoadLogistics;
import com.company.task2.logistics.SeaLogistics;
import com.company.task3.builders.Builder;
import com.company.task3.builders.IceHouseBuilder;
import com.company.task3.builders.SimpleHouseBuilder;
import com.company.task3.house.House;

import java.util.Scanner;

public class Client {
    static Scanner scanner;
    static Builder builder;
    static Director director;
    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);
        System.out.println("Choose house type");
        System.out.println("1. Wooden house");
        System.out.println("2. Ice house");
        System.out.println("Enter option (1-2): ");
        int option = scanner.nextInt();
        if (option == 1) {
            builder = new SimpleHouseBuilder();
            director = new Director(builder);
        } else if (option == 2) {
            builder = new IceHouseBuilder();
            director = new Director(builder);
        }

        director.constructHouse();
        House house = director.getHouse();

        System.out.println("House constructed: "+ house.toString());
    }
}
