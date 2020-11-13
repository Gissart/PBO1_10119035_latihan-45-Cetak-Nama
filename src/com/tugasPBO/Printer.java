package com.tugasPBO;

public class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama){
        System.out.println("Nama Anda : " + nama);
    }

    public void cetak(int jmlCetak, String nama){
        for(int i = 0; i < jmlCetak; i++){
            System.out.println(nama);
        }

    }
}
