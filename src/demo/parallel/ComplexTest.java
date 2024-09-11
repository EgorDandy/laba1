package demo.parallel;

import demo.parallel.Complex;
import org.junit.Assert;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

class ComplexTest {
    @org.junit.jupiter.api.Test
    void plus() {
        Complex testComplex = new Complex(0.5, 0.5);
        testComplex.plus(new Complex(1.3, 2.8));
        Assert.assertEquals(new Complex(1.8, 3.3), testComplex);
    }

    @org.junit.jupiter.api.Test
    void multiplicat() {
        Complex testComplex = new Complex(0.5, 0.7);
        testComplex.Multiplicat(10);
        Assert.assertEquals(new Complex(5, 7), testComplex);
    }
}