package task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            rooms.add(new Room(1, 2));
        }

        Building building = new Building(rooms, 1);
        System.out.println("Lamps: " + countLampsInBuilding(building));
        System.out.println("Windows: " + countWindowsInBuilding(building));
        System.out.println("Is normal?: " + isNormal(building));
    }

    private static int countLampsInBuilding(Building b) {
        int count = 0;

        for (Room room : b.getRooms()) {
            count += room.getNumberOfLamps();
        }

        return count;
    }

    private static int countWindowsInBuilding(Building b) {
        int count = 0;

        for (Room room : b.getRooms()) {
            count += room.getNumberOfWindows();
        }

        return count;
    }

    private static boolean isNormal(Building b) {
        return b.getNumberOfFloors() >= b.getRooms().size();
    }
}
