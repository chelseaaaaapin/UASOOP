/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankKu;

/**
 *
 * @author Chealsea
 */
public class bankBeraksi {

    public static void main(String[] args) {
        Bank bankChelsea = new Bank(900000000);

        System.out.println("Selamat Datang di Bank CHELSEA");
        System.out.println("\nSaldo anda saat ini: Rp. " + bankChelsea.saldo);

        bankChelsea.simpanUang(900000000);
        System.out.println("\nSaldo anda saat ini: Rp. " + bankChelsea.saldo);

        bankChelsea.ambilUang(2000000);
        System.out.println("\nSaldo anda saat ini: Rp. " + bankChelsea.saldo);
    }
}

    

