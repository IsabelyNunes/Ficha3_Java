/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex4;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Ex4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, tipo;

        System.out.print("Digite o numero: ");
        numero = Integer.parseInt(input.nextLine());
        
        if (numero % 2 == 0){
             System.out.println("Par");
        } else{
            System.out.println("Impar");
        }
        
    }
}
