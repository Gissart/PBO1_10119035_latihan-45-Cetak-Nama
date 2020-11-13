package com.tugasPBO;
import java.util.Scanner;

/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1 / IF1
* Deskripsi : program menampilkan jumlah nama yang dicetak sesuai keinginan user
* */

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Printer printer = new Printer();

        System.out.print("Masukkan nama anda : ");
        printer.setNama(scan.nextLine());
        System.out.print("Mau cetak berapa kali ? ");
        printer.setJmlCetak(scan.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
}
