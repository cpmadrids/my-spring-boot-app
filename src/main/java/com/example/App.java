package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static int suma(int a, int b) {
        return a+b;
    }

    public static int resta(int a, int b) {
        return a-b;
    }

    public static void main(String args[]) {
        int a = 3, b = 2;
        int res = suma(a, b);
        System.out.println("3 + 2 = " + res);
    }
}
