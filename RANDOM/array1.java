
import java.util.Scanner;

class Room {
    double width, height, breadth;

    Room(double w, double h, double b) {
        width = w;
        height = h;
        breadth = b;
    }

    double volume() {
        return width * height * breadth;
    }
}

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First room
        System.out.print("Enter width, height and breadth of Room 1: ");
        Room r1 = new Room(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        // Second room
        System.out.print("Enter width, height and breadth of Room 2: ");
        Room r2 = new Room(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

        System.out.println("Volume of Room 1: " + r1.volume());
        System.out.println("Volume of Room 2: " + r2.volume());
        
        sc.close();
    }
}
