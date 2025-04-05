/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex5;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.print("Digite o numero: ");
        numero = Integer.parseInt(input.nextLine());

        if (numero <= 10) {
            System.out.print("F1");
        } else if (numero > 10 && numero <= 100) {
            System.out.println("F2");
        } else {
            System.out.println("F3");
        }
    }
}
