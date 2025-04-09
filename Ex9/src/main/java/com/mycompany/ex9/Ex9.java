/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex9;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float numero, saldoA, valor, novoSaldo = 0, estourado;
        int operacao;

        System.out.print("Digite o numero ");
        numero = Float.parseFloat(input.nextLine());

        System.out.print("Digite o saldo atual");
        saldoA = Float.parseFloat(input.nextLine());

        System.out.print("Digite a operacao ");
        operacao = Integer.parseInt(input.nextLine());

        System.out.print("Digite o valor ");
        valor = Float.parseFloat(input.nextLine());

        if (operacao == 1) {
            novoSaldo = saldoA + valor;
        } else if (operacao == 2) {
            novoSaldo = saldoA - valor;
        }

        if (novoSaldo < 0) {
            System.out.println("estourado");
        }

        System.out.println(novoSaldo);
    }

}
