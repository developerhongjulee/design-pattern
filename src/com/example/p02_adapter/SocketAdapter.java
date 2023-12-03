package com.example.p02_adapter;


//110v to 220v
public class SocketAdapter implements Electronic110V {

    private Electronic220V electronic220V;
    public SocketAdapter(Electronic220V electronic220V) {
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
