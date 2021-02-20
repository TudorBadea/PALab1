package pa.lab1.compulsory;

import java.lang.Math;

public class Main<n> {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};

        int n = (int) (Math.random() * 1_000_000);
        n = n * 3;
        byte binary = 0b10101;
        n = n + binary;
        int hex = 0xFF;
        n = n + hex;
        n = n * 6;
        int sum;
        while (n > 9) {
            sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        System.out.println(n);
        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }


}
