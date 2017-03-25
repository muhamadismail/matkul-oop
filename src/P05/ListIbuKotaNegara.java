package P05;

/**
 * Created by Ismail on 16-Mar-17.
 *
 * @author Muhamad Ismail
 * @pertemuan 05 (Praktek)
 * @date 14 Maret 2017
 * @tugas 02
 * @desc Program untuk memasukan nama negara dan ibu kotanya menggunakan keyboard.
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListIbuKotaNegara {
    String[][] listIbuKotaNegara;
    int jumlahIbuKotaNegara;

    public ListIbuKotaNegara(int jmlIbuKotaNegara) {
        listIbuKotaNegara = new String[jmlIbuKotaNegara][2];
        jumlahIbuKotaNegara = jmlIbuKotaNegara;
    }

    public void tambahIbuKotaNegara(
        int ibuKotaKe, String namaNegara, String namaIbuKota) 
    {
        listIbuKotaNegara[ibuKotaKe][0] = namaNegara;
        listIbuKotaNegara[ibuKotaKe][1] = namaIbuKota;
    }

    public void printList() {
        int ibuKotaKe = 0;
        while (ibuKotaKe < jumlahIbuKotaNegara) {
            System.out.print(ibuKotaKe + 1 + " ");
            System.out.println(listIbuKotaNegara[ibuKotaKe][0] 
                + ", " + listIbuKotaNegara[ibuKotaKe][1]);
            ibuKotaKe++;
        }
    }

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));
        // Membuat objek ibuKotaNegara
        ListIbuKotaNegara ibuKotaNegara = new ListIbuKotaNegara(10);

        System.out.println("Masukan 10 Ibu Kota Negara :");

        // Input daftar nama negara dan ibukotanya.
        int ibuKotaKe = 0;
        while (ibuKotaKe < ibuKotaNegara.jumlahIbuKotaNegara) {
            System.out.println(ibuKotaKe + 1 + " ");
            try {
                System.out.print("Negara\t: ");
                String namaNegara = input.readLine();
                System.out.print("Ibu Kota\t: ");
                String namaIbuKota = input.readLine();
                ibuKotaNegara.tambahIbuKotaNegara(
                    ibuKotaKe, namaNegara, namaIbuKota);
            } catch (Exception e) {
                System.out.println("Error memasukan kota " + e);
            }
            ibuKotaKe++;
        }

        ibuKotaNegara.printList();
    }
}