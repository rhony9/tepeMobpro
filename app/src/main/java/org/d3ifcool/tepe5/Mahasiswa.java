package org.d3ifcool.tepe5;

/**
 * Created by Chevalier on 2/19/2018.
 */

public class Mahasiswa {
    private String name;
    private String nim;

    public Mahasiswa() {}

    public Mahasiswa(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
