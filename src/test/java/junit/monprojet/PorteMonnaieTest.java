package junit.monprojet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PorteMonnaieTest {

    @Test
    void ajouteSomme() {
        PorteMonnaie porteMonnaie1 = new PorteMonnaie();
        PorteMonnaie porteMonnaie2 = new PorteMonnaie();
        SommeArgent sommeArgent1 = new SommeArgent(5, "€");
        SommeArgent sommeArgent2 = new SommeArgent(10, "€");
        porteMonnaie2.ajouteSomme(sommeArgent2);
        porteMonnaie1.ajouteSomme(sommeArgent1);
        porteMonnaie1.ajouteSomme(sommeArgent1);
        Assert.assertTrue(porteMonnaie1.equals(porteMonnaie2));
    }
}