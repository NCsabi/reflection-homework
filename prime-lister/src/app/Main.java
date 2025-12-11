package app;

import lister.PrimeLister;
import lister.NaivePrimeLister;
import lister.SievePrimeLister;
import lister.SqrtPrimeLister;

public class Main {
    public static void main(String[] args) {
        PrimeLister naive = new NaivePrimeLister();
        PrimeLister sqrt = new SqrtPrimeLister();
        PrimeLister sieve = new SievePrimeLister();

        System.out.println("Naive: " + naive.generatePrime(1200));
        System.out.println("Sqrt: " + sqrt.generatePrime(1200));
        System.out.println("Sieve: " + sieve.generatePrime(1200));
    }
}
