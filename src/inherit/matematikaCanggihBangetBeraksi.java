/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit;

/**
 *
 * @author Chealsea
 */
public class matematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        matematikaCanggihBanget matematika = new matematikaCanggihBanget();

        int hasilPertambahan = matematika.pertambahan(60, 90);
        System.out.println("Hasil pertambahan: " + hasilPertambahan);

        int hasilPerkalian = matematika.perkalian(9, 20);
        System.out.println("Hasil perkalian: " + hasilPerkalian);

        int hasilModulus = matematika.modulus(60, 8);
        System.out.println("Hasil modulus: " + hasilModulus);

        int hasilPertambahanTiga = matematika.pertambahanTiga(9, 11, 6);
        System.out.println("Hasil pertambahan tiga angka: " + hasilPertambahanTiga);
    }
}

    

