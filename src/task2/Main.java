package task2;

public class Main {

    public static void main(String[] args) {
        var cafe = new Cafe();
        cafe.loadMenuData();

        for (String item : cafe.getCoffeeMenu()) {
            System.out.println(item);
        }
    }
}
