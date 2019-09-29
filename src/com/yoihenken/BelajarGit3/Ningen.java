package com.yoihenken.BelajarGit3;

public class Ningen {
    private int ummur;
    private String nama;
    private String jabatan;

    public Ningen(int ummur, String nama, String jabatan) {
        this.ummur = ummur;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getUmmur() {
        return ummur;
    }

    public void setUmmur(int ummur) {
        this.ummur = ummur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
