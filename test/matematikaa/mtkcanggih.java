/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaa;

/**
 *
 * @author chels
 */
public class mtkcanggih extends mtk {
    void modulus(double a, double b, double c) {
        double hasil = a % b % c;
        System.out.printf("\nHasil modulus : %.1f%n ", hasil);
    }

    void modulus(int a, int b, int c) {
        int hasil = a % b % c;
        System.out.println("Hasil modulus : " + hasil);
    }

    void modulus(int a, int b) {
        int hasil = a % b;
        System.out.println("Hasil modulus : " + hasil);
    }

    void modulus(double a, double b) {
        double hasil = a % b;
        System.out.printf("Hasil modulus : %.1f%n ", hasil);
    }
    
}
