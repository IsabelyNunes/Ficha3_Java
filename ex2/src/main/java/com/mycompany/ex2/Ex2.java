/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex2;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prova1, prova2, trabalho;

        System.out.print("Digite a nota da prova1: ");
        prova1 = Integer.parseInt(input.nextLine());

        System.out.print("Digite a nota da prova2: ");
        prova2 = Integer.parseInt(input.nextLine());

        System.out.print("Digite a nota do trabalho: ");
        trabalho = Integer.parseInt(input.nextLine());

        if ((prova1 >= 6 || prova2 >= 6) && trabalho >= 7) {
            System.out.println("Parabens, voce foi aprovado! ");
        } else {
            System.out.println("Infelizmente, voce nao foi aprovado ");
        }

    }
}
