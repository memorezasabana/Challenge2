/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge1;
import java.util.Scanner;
/**
 *
 * @author TUF
 */
public class Challenge2 {
public static void main(String[] args) {
    double nilaitugasharian;
    double nilailaporan;
    double nilaiujian;
    double nilaiakhir;
    
    Scanner scanner = new Scanner (System.in);
    System.out.println("Challenge2");
    System.out.println("==NILAI RAPORT==");
    System.out.println("Masukkan nilai tugas harian");
    nilaitugasharian= scanner.nextInt();
    System.out.println("Masukkan nilai laporan");
    nilailaporan = scanner.nextInt();
    System.out.println("Masukkan nilai ujian");
    nilaiujian = scanner.nextInt();
    
    nilaitugasharian = (nilaitugasharian * 30/100);
    nilailaporan = (nilailaporan * 20/100);
    nilaiujian = (nilaiujian * 50/100);
    nilaiakhir = (nilaitugasharian+nilailaporan+nilaiujian);
    
    if((nilaiakhir>=0)&&(nilaiakhir<=40)) {
    System.out.println("NILAI RAPORT ANDA :"+ nilaiakhir);
    System.out.println("PREDIKAT : F");
    System.out.println("Anda tidak lulus, tingkatkan belajar anda");
    
    }else if ((nilaiakhir>=41)&&(nilaiakhir<=55)) {
    System.out.println("NILAI RAPORT ANDA :"+ nilaiakhir);
    System.out.println("PREDIKAT : E");
    System.out.println("Anda tidak lulus, tingkatkan belajar anda");
        
    }else if ((nilaiakhir>=56)&&(nilaiakhir<=74)) {
    System.out.println("NILAI RAPORT ANDA :"+ nilaiakhir);
    System.out.println("PREDIKAT : E");
    System.out.println("Anda tidak lulus, tingkatkan belajar anda");
    
    }else if ((nilaiakhir>=75)&&(nilaiakhir<=85)) {
    System.out.println("NILAI RAPORT ANDA :"+ nilaiakhir);
    System.out.println("PREDIKAT : C");
    System.out.println("Anda lulus dengan cukup, tingkatkan lagi prestasimu");
    
    }else if ((nilaiakhir>=86)&&(nilaiakhir<=92)) {
    System.out.println("NILAI RAPORT ANDA :"+ nilaiakhir);
    System.out.println("PREDIKAT : B");
    System.out.println("Anda lulus dengan baik, tingkatkan lagi prestasimu");
    
     }else if ((nilaiakhir>=93)&&(nilaiakhir<=100)) {
    System.out.println("NILAI RAPORT ANDA :"+ nilaiakhir);
    System.out.println("PREDIKAT : A");
    System.out.println("Anda lulus, Excellent");
    }
}    
}
