/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ex10;

import java.util.Scanner;

/**
 *
 * @author isabe
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y, z;

        System.out.print("X: ");
        x = Integer.parseInt(input.nextLine());

        System.out.print("Y: ");
        y = Integer.parseInt(input.nextLine());

        System.out.print("Z: ");
        z = Integer.parseInt(input.nextLine());

        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && x == z) {
                System.out.print("Equilatero ");
            } else if (x != z && x == y || x != y && x == z) {
                System.out.print("Isoscele ");
            } else { //if ( x != y && x != z){
                System.out.print("Escaleno ");
            }

        } else{
            System.out.print("n eh triangulo ");
        }
    }
}
