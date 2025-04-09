/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex14;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float h, pesoIdeal;
        char genero;

        System.out.print("Digite a altura");
        h = Float.parseFloat(input.nextLine());

        System.out.print("Digite a categoria: ");
        genero = input.nextLine().charAt(0);

        if (genero == 'M') {
            pesoIdeal = (float) 72.7 * h - 58;
            System.out.println("Peso ideal para homi:" + pesoIdeal);
        } else if (genero == 'F') {
            pesoIdeal = (float) 62.1 * h - 44.7f;
            System.out.println("Peso ideal para muie:" + pesoIdeal);
        } else {
            System.out.println("digite um genero valido");
        }

    }

}
