package org.example;

import org.example.chapter0.Operation;

public class Main implements Operation {
    public Main(){
        Operation.interfaceStaticMethod();
    }
    public static void main(String[] args) {
        new Main();
        System.out.println("Hello world!");
    }

    @Override
    public float operation() {
        return 0;
    }
}