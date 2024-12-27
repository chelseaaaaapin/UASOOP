/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AC;

/**
 *
 * @author Chealsea
 */
public interface InterfaceAC {
    
    public static int AC_KEADAAN_OFF = 0;
    public static int AC_KEADAAN_ON = 1;
    public static int AC_KEADAAN_COOL = 0;
    public static int AC_KEADAAN_HOT = 1;
    
    public abstract void matikanAC();
    public abstract void hidupkanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
    
    

    
}
    

