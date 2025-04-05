/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex6;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, menor;

        System.out.print("Digite o numero: ");
        n1 = Integer.parseInt(input.nextLine());

        System.out.print("Digite o numero: ");
        n2 = Integer.parseInt(input.nextLine());

        System.out.print("Digite o numero: ");
        n3 = Integer.parseInt(input.nextLine());

        if ((n1 < n2) && (n1 < n3)) {
            System.out.print(n1);
        } else if ((n2 < n1) && (n2 < n3)) {
            System.out.println(n2);
        } else if ((n3 < n1) && (n3 < n2)) {
            System.out.println(n3);
        }
    }
}
