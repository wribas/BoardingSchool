package main;

import application.Application;

import java.util.Locale;
import java.util.Scanner;
/*
* The owner of a boarding house has ten rooms for rent to students, these rooms being identified by the numbers 0 to 9.
*Make a program that starts with all ten rooms empty, and then reads an amount N representing the number of students
* who will rent rooms (N can be from 1 to 10). Then record the rent of the N students.
* For each rental record, inform the student's name and email, as well as which of the rooms he chose (from 0 to 9).
* Suppose a spare room is chosen. At the end, your program should print a report of all the boarding houses,
* in order of room, as in the example.
 */

public class BoardingSchool {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String name;
        String email;
        int room, rooms;

        System.out.print("How many rooms will be rented? ");
        rooms = scanner.nextInt();

        Application[] vector = new Application[10];
        for (int i = 1; i <= rooms; i++) {
            System.out.printf("Rent #%d:%n", i);
            scanner.nextLine();
            System.out.print("Name: ");
            name = scanner.nextLine();
            System.out.print("Email: ");
            email = scanner.next();
            System.out.print("Room: ");
            room = scanner.nextInt();
            vector[room] = new Application(name, email);
        }
        System.out.printf("%nBusy rooms:%n");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null){
                System.out.printf("%d: %s%n", i, vector[i]);
            }
        }
    }
}
