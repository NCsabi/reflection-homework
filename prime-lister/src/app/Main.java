package app;

import api.PrimeLister;
import impl.NaivePrimeLister;
import impl.SievePrimeLister;
import impl.SqrtPrimeLister;

public class Main {
    public static void main(String[] args) {
        PrimeLister naive = new NaivePrimeLister();
        PrimeLister sqrt = new SqrtPrimeLister();
        PrimeLister sieve = new SievePrimeLister();

        System.out.println("Naive: " + naive.generatePrim(1200));
        System.out.println("Sqrt: " + sqrt.generatePrim(1200));
        System.out.println("Sieve: " + sieve.generatePrim(1200));
    }
}
