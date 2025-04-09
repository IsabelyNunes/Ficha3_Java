/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex16;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float x, y;

        System.out.println("Digite a abscissa: ");
        x = Float.parseFloat(input.nextLine());

        System.out.println("Digite a ordenada: ");
        y = Float.parseFloat(input.nextLine());

        if (x > 0 && y > 0) {
            System.out.println("1° quadrante");
        } else if (x < 0 && y > 0) {
            System.out.println("2° quadrante");
        } else if (x < 0 && y < 0) {
            System.out.println("3° quadrante");
        } else if (x > 0 && y < 0) {
            System.out.println("4° quadrante");
        }
    }
}
