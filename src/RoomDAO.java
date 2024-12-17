import java.util.List;
import java.util.ArrayList;
public class RoomDAO {
    List<Room> rooms = new ArrayList<Room>();
    public List<Room> getAllRooms() {
        return rooms;
    }

//update room status
    public void updateRoomStatus(short roomNumber, boolean isBooked) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setIsBooked(isBooked);
                System.out.println("Room status updated successfully");
                return;
            }
        }
        System.out.println("Room not found");
    }

    //update availability date
    public void updateRoomAvailability(short roomNumber, int dateOfAvailability) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setDateOfAvailability(dateOfAvailability);
                System.out.println("Room availability date updated successfully");
                return;
            }
        }
        System.out.println("Room not found");
    }
}
