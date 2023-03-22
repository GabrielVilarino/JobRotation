package com.gabrielvilarino.JobRotation;

import java.util.Scanner;

public class Q2 {
    
    public static int calculaFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculaFibonacci(n-1) + calculaFibonacci(n-2);
        }
    }
    
    public static boolean pertenceFibonacci(int num) {
        int i = 0;
        while (calculaFibonacci(i) <= num) {
            if (calculaFibonacci(i) == num) {
                return true;
            }
            i++;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}
