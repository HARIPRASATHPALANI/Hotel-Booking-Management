package hotelbooking;

import java.util.ArrayList;
import java.util.Scanner;

class Room {
    private int roomNumber;
    private String type; // Single, Double, Suite
    private int totalBeds;
    private int bookedBeds;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;

        if (type.equalsIgnoreCase("Single")) {
            this.totalBeds = 1;
        } else if (type.equalsIgnoreCase("Double")) {
            this.totalBeds = 2;
        } else { // Suite or other types
            this.totalBeds = 2; // Can be updated if suite has more beds
        }

        this.bookedBeds = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getType() {
        return type;
    }

    public int getAvailableBeds() {
        return totalBeds - bookedBeds;
    }

    public boolean bookBeds(int numberOfBeds) {
        if (getAvailableBeds() >= numberOfBeds) {
            bookedBeds += numberOfBeds;
            return true;
        }
        return false;
    }

    public boolean cancelBeds(int numberOfBeds) {
        if (bookedBeds >= numberOfBeds) {
            bookedBeds -= numberOfBeds;
            return true;
        }
        return false;
    }

    public boolean isFullyBooked() {
        return bookedBeds == totalBeds;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - " + 
               (isFullyBooked() ? "Fully Booked" : "Available (" + getAvailableBeds() + " bed(s) left)");
    }
}

public class HotelRoomBookingSystem {
    private ArrayList<Room> rooms = new ArrayList<>();

    public HotelRoomBookingSystem() {
        // Initialize rooms
        rooms.add(new Room(101, "Single"));
        rooms.add(new Room(102, "Single"));
        rooms.add(new Room(201, "Double"));
        rooms.add(new Room(202, "Double"));
        rooms.add(new Room(301, "Suite"));
    }

    public void showRooms() {
        System.out.println("\nRooms List:");
        for (Room r : rooms) {
            System.out.println(r);
        }
    }

    public boolean bookRoom(int roomNumber, int numberOfGuests) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNumber) {
                if (r.bookBeds(numberOfGuests)) {
                    System.out.println("Successfully booked " + numberOfGuests + " bed(s) in Room " + roomNumber);
                    return true;
                } else {
                    System.out.println("Not enough available beds in Room " + roomNumber);
                    return false;
                }
            }
        }
        System.out.println("Room not found!");
        return false;
    }

    public boolean cancelBooking(int roomNumber, int numberOfGuests) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == roomNumber) {
                if (r.cancelBeds(numberOfGuests)) {
                    System.out.println("Cancelled " + numberOfGuests + " bed(s) in Room " + roomNumber);
                    return true;
                } else {
                    System.out.println("Cannot cancel that many beds. Check current booking.");
                    return false;
                }
            }
        }
        System.out.println("Room not found!");
        return false;
    }

    public void checkAvailability(int numberOfGuests) {
        System.out.println("\nRooms available for " + numberOfGuests + " guest(s):");
        boolean found = false;
        for (Room r : rooms) {
            if (r.getAvailableBeds() >= numberOfGuests) {
                System.out.println(r);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No rooms available for that many guests.");
        }
    }

    public static void main(String[] args) {
        HotelRoomBookingSystem hotel = new HotelRoomBookingSystem();
        Scanner sc = new Scanner(System.in);
        int choice, roomNumber, numberOfGuests;

        do {
            System.out.println("\n--- Hotel Room Booking System ---");
            System.out.println("1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Check Availability for Guests");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    hotel.showRooms();
                    break;
                case 2:
                    System.out.print("Enter room number to book: ");
                    roomNumber = sc.nextInt();
                    System.out.print("Enter number of guests: ");
                    numberOfGuests = sc.nextInt();
                    hotel.bookRoom(roomNumber, numberOfGuests);
                    break;
                case 3:
                    System.out.print("Enter room number to cancel: ");
                    roomNumber = sc.nextInt();
                    System.out.print("Enter number of beds to cancel: ");
                    numberOfGuests = sc.nextInt();
                    hotel.cancelBooking(roomNumber, numberOfGuests);
                    break;
                case 4:
                    System.out.print("Enter number of guests: ");
                    numberOfGuests = sc.nextInt();
                    hotel.checkAvailability(numberOfGuests);
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}