package com.example.p04_decorator;

public class A4 extends AudiDecorator {
    public A4(ICar iCar, String modelName) {
        super(iCar, modelName, 2000);
    }
}
