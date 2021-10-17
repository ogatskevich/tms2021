package com.home.service;

import com.home.model.Computer;

public class Main {
    private static Object resource;

    public static void main(String[] args) {
        // com.home.model.Computer computer = new com.home.model.Computer();
        Computer computer = new Computer();
        computer.description();
        for (int i = 0; i != computer.resource; i++) {
            computer.on();
            computer.off();
        }
    }
}
