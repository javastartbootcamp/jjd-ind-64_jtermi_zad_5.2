package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(true, 34, 21, 20.5);
        Room room2 = new Room(false, 72, 25, 19.5);
        Room room3 = new Room(true, 15, 28, 18.0);

        Print print = new Print();

        print.roomIformation(room1);
        System.out.println("Czy udało się obniżyć temperaturę w pomieszczeniu?: " + room1.lowerTemperature());
        print.roomIformation(room1);

        print.roomIformation(room2);
        System.out.println("Czy udało się obniżyć temperaturę w pomieszczeniu?: " + room2.lowerTemperature());
        print.roomIformation(room2);

        print.roomIformation(room3);
        System.out.println("Czy udało się obniżyć temperaturę w pomieszczeniu?: " + room3.lowerTemperature());
        print.roomIformation(room3);
    }
}
