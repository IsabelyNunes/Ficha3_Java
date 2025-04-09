/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex15;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int idade;

        System.out.print("idade: ");
        idade = Integer.parseInt(input.nextLine());

        
        if (idade >= 5 && idade <= 10) {
            System.out.println("Infantil");
        }
        else if (idade >= 11 && idade <= 17) {
            System.out.println("Juvenil");
        }
        else if (idade >= 18 && idade <= 60) {
            System.out.println("Adulto");
        }
        else if (idade > 60) {
            System.out.println("Senior");
        }
    }
}
