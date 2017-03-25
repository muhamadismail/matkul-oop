package P06.Karyawan;

/**
 * Created by Ismail on 21-Mar-17.
 *
 * @author Muhamad Ismail
 * @pertemuan 06 (Praktek)
 * @date 21 Maret 2017
 * @tugas 01 & 02
 * @desc Program untuk memasukan kumpulan nama karyawan, umur karyawan, dan gaji karyawan.
 *       Kumpulan karyawan tersebut dapat diurutkan berdasarkan nama, umur, dan gaji.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListKaryawan {
    private Karyawan[] listKaryawan;

    public int jumlahKaryawan;

    public ListKaryawan(int jumlahKaryawan) {
        this.jumlahKaryawan = jumlahKaryawan;
        this.listKaryawan = new Karyawan[jumlahKaryawan];
    }

    public void inputList(int el, Karyawan karyawan) {
        this.listKaryawan[el] = new Karyawan(
                karyawan.getNama(),
                karyawan.getUmur(),
                karyawan.getGaji());
    }

    public void sortAscending(byte sortBy) {
        Karyawan temp;
        boolean compareStatus = false;

        for (int i = 0; i < jumlahKaryawan - 1; i++) {
            this.inputList(i, this.listKaryawan[i]);
            for (int j = i+1; j < jumlahKaryawan; j++) {
                if (sortBy == 0) {
                    compareStatus = this.getListElemen(i).getNama().compareTo(
                            this.getListElemen(j).getNama()) > 0;
                } else if (sortBy == 1) {
                    compareStatus = this.getListElemen(i).getUmur() > this.getListElemen(j).getUmur();
                } else if (sortBy == 2) {
                    compareStatus = this.getListElemen(i).getGaji() > this.getListElemen(j).getGaji();
                } else {
                    // Error
                }

                if (compareStatus) {
                    temp = this.getListElemen(i);
                    this.listKaryawan[i] = this.getListElemen(j);
                    this.listKaryawan[j] = temp;
                }
            }
        }
    }

    public Karyawan getListElemen(int el) {
        return listKaryawan[el];
    }

    public void printListInTable() {
        System.out.format("%3s  |  %15s  |  %4s |  %7s  |\n",
                "No", "Nama", "Umur", "Gaji(jt)");
        System.out.println("----------------------------------------------");

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.format("%3d  |  %15s  |  %3d  |  %2g  |\n",
                    i+1,
                    listKaryawan[i].getNama(),
                    listKaryawan[i].getUmur(),
                    listKaryawan[i].getGaji() / 1000000);
            i++;
        }
    }

    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        ListKaryawan krywn = new ListKaryawan(5);

        String namaKrywn;
        int umurKrywn;
        double gajiKrywn;

        int i = 0;
        while (i < krywn.jumlahKaryawan) {
            try {
                System.out.println("[" + (i + 1) + "] =============================");
                System.out.print("Nama: ");
                namaKrywn = input.readLine();
                System.out.print("Umur: ");
                umurKrywn = Integer.parseInt(input.readLine());
                System.out.print("Gaji (jt): ");
                gajiKrywn = Double.parseDouble(input.readLine()) * 1000000.0;

                krywn.inputList(i, new Karyawan(namaKrywn, umurKrywn, gajiKrywn));
            } catch (Exception e) {
                System.out.println("Error " + e);
                break;
            }
            i++;
        }

        System.out.println("\nHasil input:");
        // Output hasil dari input
        krywn.printListInTable();

        System.out.println("\nSort Dengan nama:");
        // Output dari listkaryawan yang disort berdasarkan nama
        krywn.sortAscending((byte) 0);
        krywn.printListInTable();

        System.out.println("\nSort Dengan umur:");
        // Output dari listkaryawan yang disort berdasarkan umur
        krywn.sortAscending((byte) 1);
        krywn.printListInTable();

        System.out.println("\nSort Dengan gaji:");
        // Output dari listkaryawan yang disort berdasarkan gaji
        krywn.sortAscending((byte) 2);
        krywn.printListInTable();

    }

}
