package view;

import java.util.Scanner;

public class CommandProcessor {
    Scanner scanner = new Scanner(System.in);
    public void runMenus(){
        Menu.setScanner(scanner);
    }
}
