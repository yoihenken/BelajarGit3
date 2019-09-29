package com.yoihenken.BelajarGit3;
import com.yoihenken.BelajarGit3.Ningen;
import com.yoihenken.BelajarGit3.neko;

import static com.yoihenken.BelajarGit3.neko.talk;


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

        System.out.println("Nama\t: " + babai.getNama() + "\numur\t: " + babai.getUmmur() + "\nCita-cita\t: " + babai.getJabatan());

        System.out.println("Neko says ");
        talk();

    }
}
