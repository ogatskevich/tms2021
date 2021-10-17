package com.home.model;

import java.util.Scanner;

public class Computer {
    String cpu;
    int ram;
    int hdd;
    public int resource;
    int i;

    public void description() {
        System.out.printf("CPU: %s \tRAM: %d\tHDD: %d \tCount: %d \t", cpu, ram, hdd, resource);
    }

    public Computer() {
        cpu = "Intell";
        ram = 32;
        hdd = 512;
        resource = 12;
    }

    public void on() {
        if (i != resource)
            System.out.println("Внимание! Введите 0 или 1");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int random = (int) Math.random() * 2;
        System.out.println(random);
        if (number == random) {
            off();
        } else {
            this.resource--;
        }
        System.out.println("Внимание! Компьютер сгорел");

    }

    public void off() {
        if (resource > 0) {
            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int random = (int) Math.random();
            System.out.println(random);
            if (number == random) {
                on();
            } else {
                i = resource;
            }

            System.out.println("Внимание! Компьютер сгорел");
        }


    }
}
