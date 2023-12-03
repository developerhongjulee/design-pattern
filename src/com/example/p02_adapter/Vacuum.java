package com.example.p02_adapter;

public class Vacuum implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 220v on");
    }
}
