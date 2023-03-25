package org.example;

import junit.monprojet.SommeArgent;

public class Main {
    public static void main(String[] args) {

        SommeArgent sommeArgent1 = new SommeArgent(50 , "$US");
        SommeArgent sommeArgent2 = new SommeArgent(50 , "&ER");
        System.out.println(sommeArgent1.equals(sommeArgent2));
    }
}