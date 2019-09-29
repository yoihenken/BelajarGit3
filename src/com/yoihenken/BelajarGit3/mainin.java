package com.yoihenken.BelajarGit3;
import com.yoihenken.BelajarGit3.Ningen;


public class mainin {
    public static void main(String[] args) {
        System.out.println("<<<<< Hello Git Hub >>>>>");

        int umur;
        String nama;
        String jabatan;

        umur = 10;
        nama = "Babai";
        jabatan = "yutuber";

        Ningen babai = new Ningen(umur, nama, jabatan);

        System.out.println("Nama\t: " + nama + "\numur\t: " + umur + "\nCita-cita\t: " + jabatan);



    }
}
