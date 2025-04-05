/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex7;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedindo três números ao usuário
        System.out.print("Digite o primeiro número: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Digite o segundo número: ");
        int b = Integer.parseInt(input.nextLine());
        System.out.print("Digite o terceiro número: ");
        int c =Integer.parseInt(input.nextLine());

        int menor, meio, maior;

        // Comparando os números
        if (a <= b && a <= c) {
            menor = a;
            if (b <= c) {
                meio = b;
                maior = c;
            } else {
                meio = c;
                maior = b;
            }
        } else if (b <= a && b <= c) {
            menor = b;
            if (a <= c) {
                meio = a;
                maior = c;
            } else {
                meio = c;
                maior = a;
            }
        } else {
            menor = c;
            if (a <= b) {
                meio = a;
                maior = b;
            } else {
                meio = b;
                maior = a;
            }
        }

        // Exibindo os números ordenados
        System.out.println("Números em ordem crescente: " + menor + ", " + meio + ", " + maior);

    }
}
