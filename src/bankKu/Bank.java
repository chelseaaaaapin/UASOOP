/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankKu;

/**
 *
 * @author Chealsea
 */
public class Bank {
    
    int saldo;

    public Bank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Simpan uang: Rp. " + jumlah);
        } else {
            System.out.println("Jumlah simpanan harus lebih dari 0.");
        }
    }

    public void ambilUang(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.println("Ambil uang: Rp. " + jumlah);
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi untuk mengambil Rp. " + jumlah);
        } else {
            System.out.println("Jumlah yang diambil harus lebih dari 0.");
        }
    }

    public int getSaldo() {
        return saldo;
    }
}

    
