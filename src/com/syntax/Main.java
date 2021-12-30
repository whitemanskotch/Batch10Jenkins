package com.syntax;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	for (int i=0; i<5; i++){
        System.out.println("Batch 10 is great "+(i+1));
        Thread.sleep(2000);
    }
    }
}
