/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloadingMatematika;

import java.util.Scanner;

/**
 *
 * @author chels
 */
public class matematikacanggihberaksi {
    public static void main(String[] args) {
        matematikacanggih mtk = new matematikacanggih();
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka 1 : ");
        int angka1 = input.nextInt();
        System.out.print("masukkan angka 2 : ");
        int angka2 = input.nextInt();
        
        System.out.println("hasil pertambahan "+ angka1 + " + " + angka2 + " = " + mtk.pertambahan(angka1, angka2));
        System.out.println("hasil perkalian "+ angka1 + " * " + angka2 + " = "+  mtk.perkalian(angka1, angka2));
        System.out.println("hasil modulus "+ angka1 + " % " + angka2 + " = "+ mtk.modulus(angka1, angka2));
    }
    
}
