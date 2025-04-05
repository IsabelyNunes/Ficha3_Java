/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex3;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int peso;
        float altura, IMC;

        System.out.print("Digite o peso: ");
        peso = Integer.parseInt(input.nextLine());

        System.out.print("Digite a altura: ");
        altura = Float.parseFloat(input.nextLine());

        IMC = peso / (altura * altura);

        if (IMC <= 20) {
            System.out.println("Magro");
        } else if (IMC >= 20 && IMC < 24.99) {
            System.out.println("normal");
        } else if (IMC >= 25 && IMC <= 30) {
            System.out.println("sobrepeso");
        } else {
            System.out.println("OBESO GORDO BALOFO RIDICULO");
        }

        System.out.println("IMC " + IMC);

    }
}
