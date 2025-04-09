/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex12;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angulo;

        System.out.print("angulo: ");
        angulo = Integer.parseInt(input.nextLine());

        if (angulo < 90) {
            System.out.println("agudo ");
        } else if (angulo == 90) {
            System.out.println("reto ");
        } else if (angulo > 90) {
            System.out.println("obtuso ");
        }else {
             System.out.print("sem definicao ");
        }
    }
}
