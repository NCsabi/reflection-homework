package test;

import api.PrimeLister;
import impl.NaivePrimeLister;
import impl.SievePrimeLister;
import impl.SqrtPrimeLister;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

public class PrimeListerTest {
    private void runCommonTests(PrimeLister lister) {
        assertIterableEquals(List.of(2, 3), lister.generatePrime(3));
        assertIterableEquals(List.of(2, 3, 5, 7), lister.generatePrime(10));
        assertIterableEquals(List.of(), lister.generatePrime(1));
    }

    @Test
    void testNaivePrimeLister() {
        runCommonTests(new NaivePrimeLister());
    }

    @Test
    void testSqrtPrimeLister() {
        runCommonTests(new SqrtPrimeLister());
    }

    @Test
    void testSievePrimeLister() {
        runCommonTests(new SievePrimeLister());
    }
}
