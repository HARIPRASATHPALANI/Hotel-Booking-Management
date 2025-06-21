# 🏨 Hotel Room Booking System (Java)

A simple **console-based** Hotel Room Booking Management System built using **Java**. This program helps manage room bookings for guests by allowing them to view, book, cancel, and check available rooms. Ideal for learning object-oriented programming and basic Java concepts.

---
## 🧾 About the Project

The **Hotel Room Booking System** is a basic hotel management solution developed in Java to simulate the process of booking and managing rooms in a hotel. This console-based system allows hotel staff or operators to manage guest reservations, including viewing available rooms, booking beds, canceling bookings, and checking room availability for specific group sizes. It demonstrates core programming principles such as object-oriented design, user input handling, and dynamic data structures (using ArrayLists). While simple in structure, this project represents the foundational functionality used in real-world hotel management software, and can be extended into a full-featured application with GUI, databases, and more.

This kind of system is commonly used in:
- Small hotels or hostels to manage room occupancy
- Educational projects to demonstrate Java and OOP principles
- Backend logic of a larger hotel reservation system
- Kiosk-based hotel self-check-in terminals

### 🎯 Why This Project Is Important

- Teaches core **Java programming concepts** (classes, methods, loops, conditionals, input/output)
- Demonstrates how to use **OOP (Object-Oriented Programming)** effectively in a real-world scenario
- Introduces practical **data validation and state management** (room availability, bed limits)
- Can be extended into larger applications (e.g., web-based or app-based hotel reservation systems)
- Builds foundational logic used in **inventory and resource booking systems**

Whether you're a beginner learning Java or a developer building small-scale utilities, this project helps you understand how to model and manage real-life systems through code.

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
