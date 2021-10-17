package com.home.model;

import java.util.Scanner;

//class Program{
//
//    public static void main(String[] args) {
//        Computer computer = new Computer();
//        computer.description();
//        computer.cpu = "Intell";
//        computer.ram = 32;
//        computer.hdd = 512;
//        computer.resource=12;
//        computer.description();
//        computer.on();
//    }
//}
public class Computer {
    public String cpu;
    public int ram;
    public int hdd;
    public int resource;

    public Computer() {

    }

    public void description() {
        System.out.printf("CPU: %s \tRAM: %d\tHDD: %s \tCount: %s \t", cpu, ram, hdd, resource);
    }

    public Computer(String cpu, int ram, int hdd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    public void on() {
        for (int i = 0; i < resource; i++) {
            if (i != resource) {
                System.out.println("Внимание! Введите 0 или 1");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                int random = (int) Math.random();
                System.out.println(random);
                if (number == random) {
                    off();
                    return;
                } else {
                    i = resource;
                }
            } else {
                System.out.println("Внимание! Компьютер сгорел");
            }
        }


    }

    private void off() {
        for (int i = 0; i < resource; i++) {
            if (i != resource) {
                System.out.println("Внимание! Введите 0 или 1");
                Scanner scanner = new Scanner(System.in);
                int number = scanner.nextInt();
                int random = (int) Math.random();
                System.out.println(random);
                if (number == random) {
                    on();
                    return;
                } else {
                    i = resource;
                }
            } else {
                System.out.println("Внимание! Компьютер сгорел");
            }
        }
    }


}
