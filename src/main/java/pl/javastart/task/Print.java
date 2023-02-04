package pl.javastart.task;

public class Print {

    void roomIformation(Room room) {
        System.out.printf("wielkość pomieszczenia w m2: %.0f m2\n", room.getRoomSize());
        System.out.printf("temperatura pomieszczenia aktualna: %.1f*C\n\n", room.getRoomTemperature());
    }
}
