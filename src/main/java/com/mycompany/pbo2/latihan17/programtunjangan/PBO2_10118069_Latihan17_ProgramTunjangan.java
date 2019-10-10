/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pbo2.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author
 * Nama     : Muhamad Rizqi Ramdani
 * Kelas    : PBO2
 * Nim      : 10118069
 * Deskripsi Program : Program Tunjangan
 */
public class PBO2_10118069_Latihan17_ProgramTunjangan {
      public static double gajipokok, tunjangan = 0, totalgaji;
    public static String status;
    
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========== Program Tunjangan ===========");
        System.out.print("Berapa gaji anda perbulan?  : Rp.");
        gajipokok = scanner.nextInt();
        System.out.print("Status Anda? (Menikah/Belum): ");
        status = scanner.next();
        
        if (status.equals("Menikah"))
            tunjangan = 0.35 * gajipokok;
        
        System.out.println("======= Hasil Perhitungan Gaji Anda =======");
        System.out.println("Gaji Pokok\t\t: Rp." + gajipokok );
        
        System.out.println("Tunjangan\t\t: Rp." + tunjangan);
        
        totalgaji = gajipokok + tunjangan;
        System.out.println("Total Gaji\t\t: Rp." + totalgaji);
        
        
    }
    
}
