# 🏨 Hotel Room Booking System (Java)

A simple **console-based** Hotel Room Booking Management System built using **Java**. This program helps manage room bookings for guests by allowing them to view, book, cancel, and check available rooms. Ideal for learning object-oriented programming and basic Java concepts.

---

## ✨ Features

🔹 View all rooms and their current availability  
🔹 Book beds in a room for one or more guests  
🔹 Cancel booked beds from a room  
🔹 Check which rooms are available for a number of guests  
🔹 Simple text-based menu for interaction

---

## 🧠 Program Structure

- `Room` class: Represents each room with its number, type, total beds, and booked beds.
- `HotelRoomBookingSystem` class: Manages all booking operations and user interactions via a menu.

---

## 🛠️ Functions and What They Do

| Function | Description |
|---------|-------------|
| `showRooms()` | Displays a list of all rooms with their booking status. |
| `bookRoom(int roomNumber, int numberOfGuests)` | Books beds in a room if enough are available. |
| `cancelBooking(int roomNumber, int numberOfGuests)` | Cancels booked beds from a room if possible. |
| `checkAvailability(int numberOfGuests)` | Shows all rooms that can accommodate the specified number of guests. |

---

## 🧾 Example Menu Output

```text
--- Hotel Room Booking System ---
1. Show Rooms
2. Book Room
3. Cancel Booking
4. Check Availability for Guests
5. Exit
Enter choice: 
