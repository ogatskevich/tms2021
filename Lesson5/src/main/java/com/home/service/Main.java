package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        // com.home.model.Computer computer = new com.home.model.Computer();
        Computer computer = new Computer();
        computer.description();
        computer.cpu = "Intell";
        computer.ram = 32;
        computer.hdd = 512;
        computer.resource = 12;
        computer.description();
        computer.on();

    }


}
