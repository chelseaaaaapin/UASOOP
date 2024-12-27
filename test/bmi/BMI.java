/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author chels
 */
public class BMI {
    double hasil;
    
    void bmi(double tinggi, double berat){
        hasil = (tinggi - berat);
        
        System.out.println("Hasil BMI anda adalah " + hasil);
        String category = getBMICategory(hasil);
        System.out.println("Kategori BMI: " + category);
        System.out.println("berat badan anda" + berat);
        System.out.println("tinggi anda " + tinggi);
    }

    public String getBMICategory(double hasil) {
        if (hasil <155) {
            return "Underweight";
        } else if (hasil >= 155 && hasil < 165) {
            return "Normal weight";
        } else if (hasil >= 165 && hasil < 175) {
            return "Overweight";
        } else if (hasil >= 175 && hasil < 250) {
            return "Obesity";
        } else {
            return "Overobesity";
        }
    }   
}


