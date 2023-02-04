package pl.javastart.task;

public class Room {

    private boolean airConditioned;
    private double roomSize;
    private double roomTemperature;
    private double minTemperature;

    public Room(boolean airConditioned, double roomSize, double roomTemperature, double minTemperature) {
        this.airConditioned = airConditioned;
        this.roomSize = roomSize;
        this.roomTemperature = roomTemperature;
        this.minTemperature = minTemperature;
    }

    boolean lowerTemperature() {
        if (airConditioned && roomTemperature >= (minTemperature + 1)) {
            roomTemperature--;
            return true;
        } else if (airConditioned && roomTemperature > minTemperature) {
            roomTemperature = minTemperature;
            return true;
        }
        return false;
    }

    public boolean isAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(boolean airConditioned) {
        this.airConditioned = airConditioned;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public double getRoomTemperature() {
        return roomTemperature;
    }

    public void setRoomTemperature(double roomTemperature) {
        this.roomTemperature = roomTemperature;
    }
}