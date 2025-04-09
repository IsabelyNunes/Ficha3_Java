/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex17;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pesoTerra;
        int codigoPlaneta;
        float pesoNoPlaneta;

        System.out.print("Digite seu peso: ");
        pesoTerra = Integer.parseInt(input.nextLine());

        System.out.print("Digite o código do planeta: ");
        codigoPlaneta = Integer.parseInt(input.nextLine());

        switch (codigoPlaneta) {
            case 1:
                pesoNoPlaneta = 0.38f * pesoTerra;
                System.out.println("Mercúrio: " + pesoNoPlaneta + " kg");
                break;
            case 2:
                pesoNoPlaneta = 0.91f * pesoTerra;
                System.out.println("venus: " + pesoNoPlaneta + " kg");
                break;
            case 3:
                pesoNoPlaneta = 0.38f * pesoTerra;
                System.out.println("marte: " + pesoNoPlaneta + " kg");
                break;
            case 4:
                pesoNoPlaneta = 2.34f * pesoTerra;
                System.out.println("jupiter: " + pesoNoPlaneta + " kg");
                break;
            case 5:
                pesoNoPlaneta = 1.06f * pesoTerra;
                System.out.println("saturno: " + pesoNoPlaneta + " kg");
                break;
            case 6:
                pesoNoPlaneta = 0.92f * pesoTerra;
                System.out.println("urano: " + pesoNoPlaneta + " kg");
                break;
            case 7:
                pesoNoPlaneta = 1.19f * pesoTerra;
                System.out.println("netuno: " + pesoNoPlaneta + " kg");
                break;
            default:
                System.out.println("digite a opcao desejada");
        }
    }
}
