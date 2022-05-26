package org.example;

public class App {

    public static void main(String[] args) {

        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(2, 2));
        System.out.println(calc.sub(10, 22));
        System.out.println(calc.mult(2, 10));
        System.out.println(calc.div(200, 10));
        System.out.println(calc.pow(200, 10));

    }
}