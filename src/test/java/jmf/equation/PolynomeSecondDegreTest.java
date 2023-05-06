package jmf.equation;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PolynomeSecondDegreTest {

    @Test
    public void test2Racines(){
        PolynomeSecondDegre polynomeSecondDegre = new PolynomeSecondDegre(1,1,-2);
        double [] results = polynomeSecondDegre.calculRacines();
        Assert.assertTrue(Arrays.equals(polynomeSecondDegre.getRacines(),results));
    }
    @Test
    public void test1Racine(){
        PolynomeSecondDegre polynomeSecondDegre = new PolynomeSecondDegre(1,-2,1);
        double [] results = polynomeSecondDegre.calculRacines();
        Assert.assertTrue(Arrays.equals(polynomeSecondDegre.getRacines(),results));
    }
    @Test
    public void testPasDeRacineReelle(){
        PolynomeSecondDegre polynomeSecondDegre = new PolynomeSecondDegre(1,1,1);
        double [] results = polynomeSecondDegre.calculRacines();
        Assert.assertTrue(Arrays.equals(polynomeSecondDegre.getRacines(),results));
    }

}