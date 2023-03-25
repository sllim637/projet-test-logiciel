package junit.monprojet.test;

import junit.monprojet.SommeArgent;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SommeArgentTestTest {
@Test
    public void testSommeArgent(){
    SommeArgent m12CHF= new SommeArgent(12, "CHF");
    SommeArgent m14CHF= new SommeArgent(14, "CHF");
    SommeArgent expected = new SommeArgent(26, "CHF");
    SommeArgent result = m12CHF.add(m14CHF);

    Assert.assertTrue(expected.equals(result));

}
}