package P05;

import java.lang.reflect.Array;
import java.util.List;

/**
 * Created by Ismail on 16-Mar-17.
 *
 * @author Muhamad Ismail
 * @pertemuan 05 (Praktek)
 * @date 14 Maret 2017
 * @tugas 01
 * @desc Program untuk memasukan nama kota di prov. Jawa Barat menggunakan keyboard.
 * Urutkan program berdasarkan abjad secara ascending order.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListKota {
    public String[] daftarKota;
    public int jumlahKota;

    public ListKota(int jmlKota) {
        jumlahKota = jmlKota;
        daftarKota = new String[jmlKota];
    }

    public void masukanKota(int kotaKe, String namaKota) {
        daftarKota[kotaKe] = namaKota;
    }

    public void urutkanListAsc() {
        String temp;
        for (int i = 0; i < jumlahKota - 1; i++) {
            for (int j = i + 1; j < jumlahKota; j++) {
                if (daftarKota[i].compareTo(daftarKota[j]) > 0) {
                    temp = daftarKota[i];
                    daftarKota[i] = daftarKota[j];
                    daftarKota[j] = temp;
                }
            }
        }
    }

    public ListKota urutkanListAscNew() {
        ListKota kotaTerurut = new ListKota(jumlahKota);
        System.arraycopy(daftarKota, 0, kotaTerurut.daftarKota, 0, jumlahKota);

        kotaTerurut.urutkanListAsc();

        return kotaTerurut;
    }

    public void printList() {
        int kotaKe = 0;
        while (kotaKe < jumlahKota) {
            System.out.print(kotaKe + 1 + " ");
            System.out.println(daftarKota[kotaKe]);
            kotaKe++;
        }
    }

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        // Membuat objek kotaJabar yang didalamnya terdapat array kota sebanyak 6.
        ListKota kotaJabar = new ListKota(6);

        System.out.println("Masukan 6 kota di Jawa Barat");

        // Input daftar nama kota di jawa barat sebanyak jumlah daftar kota
        int kotaKe = 0;
        while (kotaKe < kotaJabar.jumlahKota) {
            System.out.print(kotaKe + 1 + " ");
            try {
                kotaJabar.masukanKota(kotaKe, input.readLine());
            } catch (Exception e) {
                System.out.println("Error memasukan kota " + e);
            }
            kotaKe++;
        }

        // Panggil metode untuk melakukan sort ascending dari list kota. Metode urutkanListAscNew akan mereturn objek.
        // List kota pada objek kotaJabar tidak akan tepengaruh.
        ListKota kotaJabarTerurut = kotaJabar.urutkanListAscNew();

        // Tampilkan hasil list kota yang telah di urutkan secara ascending.
        System.out.println("\nHasil sort (buat objek baru):");
        kotaJabarTerurut.printList();

        // Tampilkan list original/asli yang tidak terpengaruh
        System.out.println("\nData original tidak terpengaruh:");
        kotaJabar.printList();

        // Urutkan list kotaJabar. Kali ini, list kota asli akan di-overwrite. Sehingga urutan datanya sudah tidak
        // seperti urutan asli saat melakukan input.
        kotaJabar.urutkanListAsc();

        // Tampilkan hasil list kota yang telah di urutkan secara ascending.
        System.out.println("\nHasil sort (objek asli):");
        kotaJabar.printList();

        // Tampilkan list original/asli yang tidak terpengaruh
        System.out.println("\nData original terpengaruh:");
        kotaJabar.printList();
    }
}
