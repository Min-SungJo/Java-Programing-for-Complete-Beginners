package org.example;

public class MultiplicationTable {

    void print() {
        System.out.println("call print");
//        for (int i = 1; i < 10; i++) {
//            System.out.printf("%d * %d = %d\n", 5, i, 5 * i);
//        }
        print(5);
    }

    void print(int n) {
        System.out.println("call print(int n)");
//        for (int i = 1; i < 10; i++) {
//            System.out.printf("%d * %d = %d\n", n, i, n * i);
//        }
        print(n, 1, 9);
    }

    void print(int n, int from, int to) {
        System.out.println("call print(int n, int from, int to)");
        for (int i = from; i <= to; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
