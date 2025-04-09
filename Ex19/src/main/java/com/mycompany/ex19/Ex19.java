/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex19;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dia: ");
        int dia = input.nextInt();

        System.out.print("Mês: ");
        int mes = input.nextInt();

        System.out.print("Ano: ");
        int ano = input.nextInt();

        boolean bissexto = ehBissexto(ano);
        boolean dataValida = dataEhValida(dia, mes, ano);

        System.out.println(bissexto ? "Ano bissexto" : "Ano não é bissexto");
        System.out.println(dataValida ? "Data válida" : "Data inválida");
    }

    static boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }

    static boolean dataEhValida(int dia, int mes, int ano) {
        if (ano < 0 || ano > 9999 || mes < 1 || mes > 12) {
            return false;
        }

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (ehBissexto(ano)) {
            diasMes[1] = 29;
        }

        return dia >= 1 && dia <= diasMes[mes - 1];
    }
}
