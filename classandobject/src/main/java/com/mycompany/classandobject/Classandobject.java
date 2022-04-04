/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.classandobject;

//membuat class sebagai template

class Mahasiswa{
    String nama;
    String NIM;
    String Jurusan;
    
}

public class Classandobject {

    public static void main(String[] args) {
       
        //membuat object
       Mahasiswa mahasiswa1 = new Mahasiswa();
       mahasiswa1.nama = "Reza Radhitya Irham";
       mahasiswa1.NIM = "2120010134";
       mahasiswa1.Jurusan = "Software Engineering";
       
           
       
       
       System.out.println(mahasiswa1.nama);
       System.out.println(mahasiswa1.NIM);
       System.out.println(mahasiswa1.Jurusan);
    }
}
