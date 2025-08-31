import java.util.function.Supplier;

public class LambdasBasicsPractice {
    public static void main(String[] args) {

        Supplier<Integer> fiveSupplier = () -> 5;
        Supplier<String> helloWorldSupplier = () -> "hello world";
        Supplier<String> nameSupplier = () -> "Csaba";

        System.out.println(fiveSupplier.get());
        System.out.println(helloWorldSupplier.get());
        System.out.println(nameSupplier.get());
    }
}
