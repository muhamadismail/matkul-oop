package P06.Karyawan;

/**
 * Created by Ismail on 21-Mar-17.
 */
public class Karyawan {
    private String nama;
    private int umur;
    private double gaji;

    public Karyawan(String nama, int umur, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public double getGaji() {
        return gaji;
    }

    public void printKaryawan() {
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Gaji : " + gaji);
    }
}
