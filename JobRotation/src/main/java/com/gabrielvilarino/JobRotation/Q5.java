package com.gabrielvilarino.JobRotation;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite uma String: ");
        String str = input.nextLine();
        String strInvertida = "";
        
        for(int i = str.length() - 1; i >=0; i--){
            strInvertida += str.charAt(i);
        }
        
        System.out.println("String Invertida: " + strInvertida);
    }
}
