/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex18;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float saldoMedio;

        System.out.println("Digite o saldo medio: ");
        saldoMedio = Float.parseFloat(input.nextLine());

        if (saldoMedio >= 0 && saldoMedio <= 500.00) {
            System.out.println("Nenhum credito ");
        } else if (saldoMedio >= 500.01 && saldoMedio <= 1000) {
            System.out.println("30% do valor do saldo médio");
        } else if (saldoMedio >= 1000.01 && saldoMedio <= 3000) {
            System.out.println("40% do valor do saldo médio");
        } else if (saldoMedio > 3000) {
            System.out.println("50% do valor do saldo médio");
        }
    }
}
