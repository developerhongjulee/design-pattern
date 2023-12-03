package com.example.p04_decorator;

public class A3 extends AudiDecorator {
    public A3(ICar iCar, String modelName) {
        super(iCar, modelName, 1000);
    }
}
