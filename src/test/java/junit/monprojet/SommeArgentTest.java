package junit.monprojet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SommeArgentTest {
    static int nb = 0;
    private ArrayList<SommeArgent> initialisaion(){
        SommeArgentTest.nb++;
        System.out.println(SommeArgentTest.nb + "ime passage avant exécution d'une méthode de test");
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "CHF");
        ArrayList<SommeArgent> sommeArgents = new ArrayList<SommeArgent>();
        sommeArgents.add(m12CHF);
        sommeArgents.add(m14CHF);
        return sommeArgents;
    }
    @Test
    void add() throws UniteDistincteException {
        ArrayList<SommeArgent>sommeArgents = this.initialisaion();
        SommeArgent m12CHF= sommeArgents.get(0);
        SommeArgent m14CHF= sommeArgents.get(1);
        //SommeArgent m12CHF= new SommeArgent(12, "CHF");
        //SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent expected = new SommeArgent(26, "CHF");
        SommeArgent result = m12CHF.add(m14CHF);

        Assert.assertTrue(expected.equals(result));
        //dans cette methode on test si le l'objet sur laquelle faite l'operation d'addition est egale a l'objet deja attendu
        System.out.println(SommeArgentTest.nb + "ime passage APRES exécution d'une méthode de test");
    }

    @Test
    void testEquals() {
        ArrayList<SommeArgent>sommeArgents = this.initialisaion();
        SommeArgent m12CHF= sommeArgents.get(0);
        SommeArgent m14CHF= sommeArgents.get(1);
        //SommeArgent m12CHF= new SommeArgent(12, "CHF");
        //SommeArgent m14CHF= new SommeArgent(14, "CHF");
        SommeArgent m14USD= new SommeArgent(14, "USD");
        Assert.assertTrue(!m12CHF.equals(null));
        Assert.assertEquals(m12CHF, m12CHF);
        Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF")); // (1)
        Assert.assertTrue(!m12CHF.equals(m14CHF));
        Assert.assertTrue(!m14USD.equals(m14CHF));
        //dans la derniére ligne on teste la methode equals avec l'objet lui meme parcequ'on est  sur qui'il dont egaux
        System.out.println(SommeArgentTest.nb + "ime passage APRES exécution d'une méthode de test");
    }
    @Test
    void excetionAddTest() throws UniteDistincteException {
        SommeArgent m12CHF= new SommeArgent(12, "CHF");
        SommeArgent m14CHF= new SommeArgent(14, "DT");
        assertThrows(UniteDistincteException.class,() -> m12CHF.add(m14CHF));
    }

}

