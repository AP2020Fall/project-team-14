package view;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Menu {
    protected static Scanner scanner;
    private static CommandProcessor commandProcessor;
    private String name;
    private Menu parentMenu;
    private HashMap<String, Menu> subMenus;
    /* private static ArrayList<Menu> allMenus; */

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
    }

    public String getName() {
        return name;
    }

    public static void setScanner(Scanner scanner) {
        Menu.scanner = scanner;
    }

    public void setSubMenus(HashMap<String, Menu> subMenus) {
        this.subMenus = subMenus;
    }

    public void show(){
        for (String menuName: subMenus.keySet()) {
            System.out.println(subMenus.get(menuName).getName());
        }
        if (this.parentMenu != null){
            System.out.println("Back");
        }
        else {
            System.out.println("Exit");
        }
    }

    public void execute(){
        Menu nextMenu = null;
        String input = scanner.nextLine().trim();
        if (input.equalsIgnoreCase("exit")){
            System.exit(1);
        }
        else if (input.equalsIgnoreCase("back")){
            nextMenu = this.parentMenu;
        }
        else {
            nextMenu = subMenus.get(input);
        }
        nextMenu.show();
        nextMenu.execute();
    }
}
