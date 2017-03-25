package P03;
/**
 * Created by Ismail on 04-Mar-17.
 * @pertemuan 03 (Teori & Praktikum)
 * @date 27,28 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 03
 * @desc Program untuk mengisi elemen-elemen array dua dimensi
 *       dengan jumlah baris dan kolom yang ditentukan. Kemudian
 *       menampilkan elemen-elemen array tersebut dalam bentuk
 *       baris dan kolom (seperti matrix).
 */
import java.util.Scanner;

public class ElemenArray {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Membuat array elemen 3 baris 4 kolom
        int[][] elements = new int[3][4];

        System.out.println("Masukkan elemen array 4 kolom 3 baris (12 elemen) :");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                elements[i][j] = input.nextInt();
            }
        }

        System.out.println("Tampilkan elemen-elemen array dalam bentuk matriks :");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                System.out.printf("%d\t", elements[i][j]);
            }
            System.out.println("");
        }
    }
}
