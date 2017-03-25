package P03;

/**
 * Created by Ismail on 03-Mar-17.
 * @pertemuan 03 (Teori & Praktikum)
 * @date 27,28 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 01
 * @desc Program untuk menghitung nilai x pangkat y dengan menggunakan metode
 *       tersendiri.
 *
 */
import java.util.Scanner;

public class MetodePangkat {
    /**
     * Method atau fungsi untuk menghitung nilai pangkat.
     *
     * @param   x   integer yang akan dipangkatkan
     * @param   y   integer yang akan dipangkatkan
     * @return  hasil dari pangkat dengan nilai maks long
     */
    public double pangkat(int x, int y)
    {
        double hasil = 1;

        if (y >= 0) {
            for (int i = 0; i < y; i++) {
                hasil *= x;
            }
        } else {
            for (int i = y; i < 0; i++) {
                hasil /= x;
            }
        }
        return hasil;
    }

    /**
     * Method untuk menghitung nilai pangkat dengan menggunakan
     * metode recursive yang mendukung nilai pangkat negatif dan positif.
     * @param x integer yang akan dipangkatkan
     * @param y integer yang akan dipangkatkan
     * @return hasil dari pangkat dengan nilai maks dalam range double
     */
    public double recPangkat(int x, int y)
    {
        if (y > 0) {
            return recPangkat(x, y - 1) * x;
        } else if (y < 0) {
            return recPangkat(x, y + 1) / x;
        } else {
            return 1;
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MetodePangkat mp = new MetodePangkat();

        boolean repeat;
        char ask_repeat;
        int x, y;
        do {
            System.out.println("Program untuk menghitung nilai X^Y");
            System.out.print("nilai x = ");
            x = input.nextInt();
            System.out.print("nilai y = ");
            y = input.nextInt();
            System.out.printf("pangkat\t\t:%d^%d = %g", x, y, mp.pangkat(x, y));
            System.out.printf("\nrecpangkat\t:%d^%d = %g", x, y, mp.recPangkat(x, y));

            System.out.print("\nHitung Lagi? \n[Y]a atau [T]idak? ");
            ask_repeat = input.next().charAt(0);
            System.out.println("======================================");

            if (ask_repeat == 'Y' || ask_repeat == 'y') {
                repeat = true;
            } else if (ask_repeat == 'T' || ask_repeat == 't') {
                repeat = false;
                break;
            } else {
                System.out.println("Perintah tidak ditemukan");
                break;
            }
        } while(repeat);
    }
}
