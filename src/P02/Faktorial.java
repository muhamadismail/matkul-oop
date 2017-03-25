package P02;

/**
 * Created by Ismail on 25-Feb-17.
 * @pertemuan 02 (Teori)
 * @date 20 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 02
 * @desc Menampilkan atau mencetak nilai dari faktorial 0 s/d 9.
 *
 */
public class Faktorial
{
    public static void main(String[] args)
    {
        int faktorial = 1;

        System.out.println("Faktorial :");

        for (int i = 0; i <= 9; i++)
        {
            if (i > 1) faktorial *= i;

            System.out.println(i + "! = " + faktorial);
        }
    }
}
