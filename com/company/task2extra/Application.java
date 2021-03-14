package com.company.task2extra;

import com.company.task2extra.Dialogs.Dialog;
import com.company.task2extra.Dialogs.WebDialog;
import com.company.task2extra.Dialogs.WindowsDialog;

import java.util.Scanner;

public class Application {
    public static Dialog dialog;
    static Scanner scanner = new Scanner(System.in);

    public static void initialize() throws Exception {
        String config = scanner.next();

        if (config.equals("Windows")) {
            dialog = new WindowsDialog();
        }
        else if (config.equals("Web")) {
            dialog = new WebDialog();
        }
        else
            throw new Exception("Error! Unknown operating system.");
    }

    public static void main(String[] args) throws Exception {
        initialize();
        dialog.render();
    }


}
