package Hospital;

import java.util.ArrayList;

public class Room {
    private static int nextRoomNumber = 1;
    private int roomNumber;
    private int durationOfStay;
    private ArrayList<Treatment> treatments;

    public Room(int durationOfStay) {
        this.durationOfStay = durationOfStay;
        treatments = new ArrayList<>();
        this.roomNumber = nextRoomNumber++;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addTreatments(Treatment treatment) {
        treatments.add(treatment);
    }


    @Override
    public String toString() {
        return "Room{" +
                "nextRoomNumber=" + nextRoomNumber +
                ", roomNumber=" + roomNumber +
                ", durationOfStay=" + durationOfStay +
                ", treatments=" + treatments +
                '}';
    }
}
