package P01;

/**
 * Created by Ismail on 25-Feb-17.
 * @pertemuan 01 (Praktikum)
 * @date 14 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 02
 * @desc Menampilkan output seperti tugas 01 hanya saja setelahnya
 *       (setelah 9 baris), tampilkan seperti dibawah.
 *
 * @output
 *       >                ...
 *       >           Saya belajar Java.
 *       >      Saya belajar Java.
 *       > Saya belajar Java.
 *
 */
public class TambahKurangTab
{
    public static void main(String [] args)
    {
        System.out.println("");
        System.out.println("Tugas 02");
        System.out.println("=========");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("     ");
            }
            System.out.println("Saya belajar Java");
        }
        for (int i = 8; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("     ");
            }
            System.out.println("Saya belajar Java");
        }
    }
}
