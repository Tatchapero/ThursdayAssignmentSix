package task1;

import java.util.ArrayList;
import Utility.*;
import static java.util.UUID.randomUUID;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            customers.add(new Customer(Helper.getRandomName(), randomUUID().toString()));
        }

        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c.toString());
        }
    }
}