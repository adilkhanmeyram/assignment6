package com.company.task2;

import com.company.task2.logistics.Logistics;
import com.company.task2.logistics.RoadLogistics;
import com.company.task2.logistics.SeaLogistics;
import com.company.task2extra.Dialogs.WebDialog;
import com.company.task2extra.Dialogs.WindowsDialog;

import java.util.Scanner;

public class Application {
    public static Logistics logistic;
    static Scanner scanner = new Scanner(System.in);

    public static void create() throws Exception {
        System.out.println("Choose logistics:");
        System.out.println("1. Road logistics");
        System.out.println("2. Sea logistics");
        System.out.println("Enter option (1-2): ");
        int option = scanner.nextInt();
        if (option == 1) {
            logistic = new RoadLogistics();
        } else if (option == 2) {
            logistic = new SeaLogistics();
        }

    }

    public static void main(String[] args) throws Exception {
        create();
        logistic.planDelivery();
    }
}
