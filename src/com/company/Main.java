package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ivedimas();
        suma();
        skirtumas();
        daugyba();
    }

    public static float a;
    public static float b;

    public static void ivedimas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Iveskite du skaicius");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    public static void isvedimas(float atsakymas) {
        System.out.println(atsakymas);
    }

    public static void suma() {
        isvedimas(a + b);
    }

    public static void skirtumas() {
        isvedimas(a - b);
    }

    public static void daugyba() {
        isvedimas(a * b);
    }

}
