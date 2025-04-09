/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex13;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int produto1, produto2, produto3;
        String nome1, nome2, nome3;

        System.out.print("Digite o nome: ");
        nome1 = input.nextLine();

        System.out.print("Estoque: ");
        produto1 = Integer.parseInt(input.nextLine());

        System.out.print("Digite o nome: ");
        nome2 = input.nextLine();

        System.out.print("Estoque: ");
        produto2 = Integer.parseInt(input.nextLine());

        System.out.print("Digite o nome: ");
        nome3 = input.nextLine();

        System.out.print("Estoque: ");
        produto3 = Integer.parseInt(input.nextLine());

        if (produto1 <= 30) {
            System.out.println(nome1 + " " + produto1);
        }
        if (produto2 <= 30) {
            System.out.println(nome2 + " " + produto2);
        }
        if (produto3 <= 30) {
            System.out.println(nome3 + " " + produto3);
        } else {
            System.out.println(" ");
        }

    }
}
