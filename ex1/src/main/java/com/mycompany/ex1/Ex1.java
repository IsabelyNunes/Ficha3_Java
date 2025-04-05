/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float preco, quilowatts, conta, contaAtraso;

        System.out.print("Digite o preco: ");
        preco = Float.parseFloat(input.nextLine());

        System.out.print("Digite os quilowatts: ");
        quilowatts = Float.parseFloat(input.nextLine());

        conta = preco * quilowatts;
        contaAtraso = (float) (conta + (conta * 10.0 / 100));

        System.out.println("Valor da conta normal: " + conta);
        System.out.println("Valor da conta sem atraso: " + contaAtraso);

        if (quilowatts > 70) {
            System.out.println("Consumo elevado de energia");
        } else {
            System.out.println("Voce eh um consumidor consciente");
        }

    }
}
