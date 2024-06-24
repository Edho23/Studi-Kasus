/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kalkulator;

/**
 *
 * @author tayoo
 */
import java.util.*;

class Vehicle {
    String name;
    String owner;
    int year;

    Vehicle(String name, String owner, int year) {
        this.name = name;
        this.owner = owner;
        this.year = year;
    }

    void displayInfo(int vehicleNumber) {
        System.out.println("information Vehicle " + vehicleNumber + ":");
        System.out.println("Nama Kendaraan : " + name);
        System.out.println("Pemilik Kendaraan: " + owner);
        System.out.println("Tahun Pembuatan: " + year);
        System.out.println();
    }

    void updateInfo(Scanner scanner) {
        System.out.print("Input Nama Kendaraan: ");
        this.name = scanner.nextLine();
        System.out.print("Input Nama Pemilik: ");
        this.owner = scanner.nextLine();
        System.out.print("Input Tahun Pembuatan: ");
        this.year = scanner.nextInt();
        scanner.nextLine();
    }
}

public class InforVehicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle1 = new Vehicle("BMW", "otong", 2018);
        Vehicle vehicle2 = new Vehicle("Honda Supra Mk", "Yanto", 2024);

        while (true) {
            vehicle1.displayInfo(1);
            vehicle2.displayInfo(2);

            System.out.println("1. Ubah Kendaraan No 1");
            System.out.println("2. Ubah Kendaraan No 2");
            System.out.println("3. Daftar Kendaraan yang telah diubah");
            System.out.println("4. Selesai");
            System.out.print("Pilih Optional: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Ubah Data? [Y/N]: ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    vehicle1.updateInfo(scanner);
                }
            } else if (choice == 2) {
                System.out.print("Ubah Data? [Y/N]: ");
                String confirm = scanner.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    vehicle2.updateInfo(scanner);
                }
            } else if (choice == 3) {
                vehicle1.displayInfo(1);
                vehicle2.displayInfo(2);
            } else if (choice == 4) {
                System.out.println("Terimakasih!!!");
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
