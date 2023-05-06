package org.example;

import junit.monprojet.PorteMonnaie;
import junit.monprojet.SommeArgent;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        SommeArgent sommeArgent1 = new SommeArgent(50, "$US");
        SommeArgent sommeArgent2 = new SommeArgent(50, "&ER");
        System.out.println(sommeArgent1.equals(sommeArgent2));
        SommeArgent sommeArgent3 = new SommeArgent(50, "€");
        PorteMonnaie porteMonnaie = new PorteMonnaie();
        porteMonnaie.ajouteSomme(sommeArgent3);
        porteMonnaie.ajouteSomme(sommeArgent1);
        porteMonnaie.ajouteSomme(sommeArgent2);
        String ch = porteMonnaie.toString();
        PorteMonnaie porteMonnaie1 = new PorteMonnaie();
        porteMonnaie1.ajouteSomme(sommeArgent1);
        PorteMonnaie porteMonnaie2 = new PorteMonnaie();
        porteMonnaie2.ajouteSomme(sommeArgent2);
        System.out.println(porteMonnaie1.equals(porteMonnaie2));



    }
}