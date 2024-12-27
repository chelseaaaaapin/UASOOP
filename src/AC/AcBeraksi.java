/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author Chealsea
 */
public class AcBeraksi {
    public static void main(String[] args) {
        AC acChelsea = new AC();
        
        System.out.println("Keadaan AC sekarang : off");
        acChelsea.hidupkanAC();
        acChelsea.matikanAC();
        acChelsea.matikanAC();
        acChelsea.hidupkanAC();
        acChelsea.hidupkanAC();
        
        System.out.println("\nKeadaan AC sekarang : hot");
        acChelsea.dinginkanAC();
        acChelsea.panaskanAC();
        acChelsea.panaskanAC();
        acChelsea.dinginkanAC();
        acChelsea.dinginkanAC();
        
    }
    
}
        
        
        