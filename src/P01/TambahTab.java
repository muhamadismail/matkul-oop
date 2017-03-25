package P01;

/**
 * Created by Ismail on 25-Feb-17.
 * @pertemuan 01 (Praktikum)
 * @date 14 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 01
 * @desc Menampilkan output "Saya belajar Java" dengan menambahkan
 *       5 spasi untuk setiap iterasi seperti dibawah hingga 9 baris.
 *
 * @output
 *       > Saya belajar Java.
 *       >      Saya belajar Java.
 *       >           Saya belajar Java.
 *       >                ...
 *
 */

public class TambahTab
{
    public static void main(String [] args)
    {
        // Tugas 01
        System.out.println("");
        System.out.println("Tugas 01");
        System.out.println("=========");

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("     ");
            }
            System.out.println("Saya belajar Java");
        }
    }
}
