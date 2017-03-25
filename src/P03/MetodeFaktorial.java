package P03;

/**
 * Created by Ismail on 04-Mar-17.
 * @pertemuan 03 (Teori & Praktikum)
 * @date 27,28 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 02
 * @desc Program untuk menghitung nilai faktorial dengan menggunakan method
 *       tersendiri.
 *
 */
import java.util.Scanner;

public class MetodeFaktorial {
    /**
     * Melakukan perhitungan faktorial hingga maksimum 20! dengan menggunakan
     * for loop.
     * @param n nilai yang akan difaktorialkan: n! (maks 20!)
     * @return hasil dari faktorial.
     */
    public long faktorial(byte n)
    {
        long hasil = 1;
        for (int i = 0; i <= n; i++)
        {
            if (i > 1)
                hasil *= i;
        }
        return hasil;
    }

    /**
     * Melakukan perhitungan faktorial dengan cara recursive dengan nilai n
     * maksimum 20.
     * @param n nilai yang akan difaktorialkan: n! (maks 20!)
     * @return hasil dari faktorial.
     */
    public long recFaktorial(byte n)
    {
        if (n < 1) {
            return 1;
        } else {
            return (long) n * recFaktorial((byte) (n - 1));
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        MetodeFaktorial mf = new MetodeFaktorial();

        char ask_repeat;
        byte n;
        do {
            System.out.println("Program menghitung nilai faktorial n.");
            System.out.print("Masukan nilai n = ");
            n = input.nextByte();
            System.out.printf("forloop\t\t: %d! = %d\n", n, mf.faktorial(n));
            System.out.printf("recursive\t: %d! = %d\n", n, mf.recFaktorial(n));

            System.out.print("\nHitung Lagi? \n[Y]a atau [T]idak? ");
            ask_repeat = input.next().charAt(0);
            System.out.println("======================================");

            if (ask_repeat == 'Y' || ask_repeat == 'y') {
                continue;
            } else if (ask_repeat == 'T' || ask_repeat == 't') {
                for (int i = 0; i <= n; i++)
                {
                    System.out.printf("%d!\t= %d\n", i, mf.faktorial((byte) i));
                }
                break;
            } else {
                System.out.println("Perintah tidak ditemukan");
                break;
            }
        } while (true);
    }
}
