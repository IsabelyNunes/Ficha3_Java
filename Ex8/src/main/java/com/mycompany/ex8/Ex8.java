/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex8;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;
        char categoria;
        float salarioA, novoSalario;

        System.out.print("Digite o nome: ");
        nome = input.nextLine();

        System.out.print("Digite a categoria: ");
        categoria = input.nextLine().charAt(0);

        System.out.print("Digite o salario atual: ");
        salarioA = Float.parseFloat(input.nextLine());

        if (categoria == 'A' || categoria == 'H') {
            novoSalario = salarioA * 1.10f;
        } else if (categoria == 'B' || categoria == 'D' || categoria == 'E') {
            novoSalario = salarioA * 1.15f;
        } else if (categoria == 'C' || categoria == 'F') {
           novoSalario = salarioA * 1.25f;
        } else {
            novoSalario = salarioA * 1.30f;
        }
        
        System.out.println(nome);
        System.out.println(categoria);
        System.out.println(novoSalario);

    }
}
