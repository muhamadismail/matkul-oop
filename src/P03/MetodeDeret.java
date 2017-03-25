package P03;

/**
 * Created by Ismail on 04-Mar-17.
 * @pertemuan 03 (Teori & Praktikum)
 * @date 27,28 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 03
 * @desc Program untuk menampilkan nilai deret ke-n dan/atau
 *       sampai suku ke-n.
 *       S1 = 8
 *       S2 = 12
 *       S3 = 160
 *       ...
 *       S12 = ...
 *       Rumus umum : Sn = (Sn-2 + Sn-1) * Sn-1
 *
 */
import java.util.Scanner;

public class MetodeDeret {
    /**
     * Netode untuk menghitung nilai deret ke-n dengan menggunakan
     * metode recursive.
     * @param n posisi deret.
     * @return  nilai dari deret ke-n
     */
    public long deret(byte n)
    {
        if (n == 1) {
            return 8;
        } else if (n == 2) {
            return 12;
        } else {
            return (deret((byte) (n - 2)) + deret((byte) (n - 1))) * deret((byte) (n - 2));
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MetodeDeret md = new MetodeDeret();

        System.out.println("Program untuk menghitung deret ke-n");
        System.out.println("S1 = 8, S2 = 12, S3 = 160, ...");
        System.out.print("Deret ke : ");
        byte n = input.nextByte();

        System.out.printf("S%d = %d", n, md.deret(n));
        System.out.println("\n=====================================");
        System.out.println("Deret lengkap :");

        for (byte i = 1; i <= n; i++)
        {
            System.out.printf("S%d = %d\n", i, md.deret((byte) i));
        }
    }
}
