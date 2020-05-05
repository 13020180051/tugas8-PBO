/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor;

/**
 *
 * @author user
 */
public class Nomor {
 
 static int hitung = 0;
 
 public void menghitungObjek(){
  hitung++;
 }
 
 
 public static void main (String args []){
  
  Nomor buah_1 = new Nomor();
  Nomor buah_2 = new Nomor();
  Nomor buah_3 = new Nomor();
  Nomor buah_4 = new Nomor();
  Nomor buah_5 = new Nomor();
  
  buah_1.menghitungObjek();
  buah_2.menghitungObjek();
  buah_3.menghitungObjek();
  buah_4.menghitungObjek();
  buah_5.menghitungObjek();
  
  System.out.println("Objek buah_1 menghitung :" + buah_1.hitung);
  System.out.println("Objek buah_2 menghitung :" + buah_2.hitung);
  System.out.println("Objek buah_3 menghitung :" + buah_3.hitung);
  System.out.println("Objek buah_4 menghitung :" + buah_4.hitung);
  System.out.println("Objek buah_5 menghitung :" + buah_5.hitung);
 }
}
