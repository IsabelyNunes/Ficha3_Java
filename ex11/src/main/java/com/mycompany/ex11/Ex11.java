/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex11;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hora, minuto, segundo;

        System.out.print("hora: ");
        hora = Integer.parseInt(input.nextLine());

        System.out.print("minuto: ");
        minuto = Integer.parseInt(input.nextLine());

        System.out.print("segundo: ");
        segundo = Integer.parseInt(input.nextLine());

        if (hora == 24 || minuto == 60 || segundo == 60) {
            hora = 0;
            minuto = 1;
            segundo = 1;
        }

        System.out.println(hora + ":" + minuto + ":" + segundo);

    }
}
