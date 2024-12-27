/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author Chealsea
 */
public class AC implements InterfaceAC {
    
    int statusAC;
    int statusSuhu;
    
    public void matikanAC(){
        if (statusAC == AC_KEADAAN_ON) {
            statusAC = AC_KEADAAN_OFF;
            System.out.println("\nMatikan AC --> AC sudah off ");
        } else {
            System.out.println("\nMatikan AC --> AC sudah off, tenang aja");
        }
    }
    
    public void hidupkanAC() {
        if (statusAC == AC_KEADAAN_OFF) {
            statusAC = AC_KEADAAN_ON;
            System.out.println("\nHidupkan AC --> AC sudah on ");
        } else {
            System.out.println("\nHidupkan AC --> AC sudah on, udah adem");
        }
    }
    
    public void dinginkanAC(){
        if (statusAC == AC_KEADAAN_HOT) {
            statusAC = AC_KEADAAN_COOL;
            System.out.println("\nDinginkan AC --> AC mode cool ");
        } else {
            System.out.println("\nDinginkan AC --> AC mode cool, ga kepanasan lagi");
        }
    }
    
    public void panaskanAC(){
        if (statusAC == AC_KEADAAN_COOL) {
            statusAC = AC_KEADAAN_HOT;
            System.out.println("\nPanaskan AC --> AC mode hot ");
        } else {
            System.out.println("\nPanaskan AC --> AC mode hot, ga kedinginan lagi ");
        }
    }
    
}

    
    

