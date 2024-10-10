package task2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        this.coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("coffees.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                coffeeMenu.add(fileReader.nextLine());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
