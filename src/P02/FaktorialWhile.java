package P02;

/**
 * Created by Ismail on 28-Feb-17.
 * @pertemuan 02 (Praktikum)
 * @date 21 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 01 & 2
 * @desc Menampilkan atau mencetak nilai dari faktorial 0 s/d 9.
 *       menggunakan while dan do-while loop.
 *
 * @output
 */
public class FaktorialWhile
{
    public static void main(String[] args)
    {
        int faktorial = 1;
        int n = 0;

        System.out.println("Faktorial While:");

        while(n < 10)
        {
            if (n > 1) faktorial *= n;

            System.out.println(n + "! = " + faktorial);

            n++;
        }

        faktorial = 1;
        n = 0;

        System.out.println("\nFaktorial do-While:");

        do
        {
            if (n > 1) faktorial *= n;

            System.out.println(n + "! = " + faktorial);

            n++;
        } while(n < 10);
    }
}