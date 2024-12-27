/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMIChelsea;

/**
 *
 * @author chels
 */
public class BMIChelsea {
    double hasil;
    
    void kalkulatorBMI(double tinggi, double berat){
        hasil = (tinggi - 110);
        
        System.out.println("Hasil BMI chelsea adalah " + hasil);
        String category = getBMICategory(hasil);
        System.out.println("Kategori BMI: " + category);
        System.out.println("berat badan chelsea" + berat);
        System.out.println("tinggi chelsea" + tinggi);
        System.out.println("jenis kelamin + laki-laki && perempuan");
    }    
    
    /**
     *
     * @param hasil
     * @return
     */
    public String getBMICategory (double hasil){
        char jenisKelamin = 0;
        if (hasil <50) {
            return "Under weight";
        } else if (hasil >= 50 && hasil <80) {
            return "Normal weight";
        } else if (hasil >= 80 && hasil <100) {
            return "Over weight";
        } else if (hasil >= 100 && hasil >150) {
            return "Obesity";
        } else if (hasil >=150 && hasil > 250) {
            return "Over obesity";  
        } else { 
        
        
        
        

