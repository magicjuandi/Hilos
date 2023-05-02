package com.Threads;

public class Example extends Thread {
    public static int position = 4;
    ;
    public static void main(String[] args) {
        Example thread = new Example();
        thread.start();
        while(thread.isAlive()){
            System.out.println("Esperando en la fila...");
        }
        System.out.println("Usted se encuentra en la posicion: "+ position);
        position--;
        System.out.println("Usted se encuentra en la posicion: "+ position);
        position--;
        System.out.println("Usted se encuentra en la posicion: "+ position);
    }
    public void run(){
        position--;
    }
    
}
