package P01;

/**
 * Created by Ismail on 25-Feb-17.
 * @pertemuan 01 (Praktikum)
 * @date 14 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 03
 * @desc Menampilkan output seperti dibawah dimulai dengan 20 tanda
 *       pagar (#) hingga berkurang menjadi 2 tanda (#).
 *
 * @output
 *       > ####################
 *       >  ##################
 *       >         ...
 *       >         ...
 *       >         ##
 *
 */

public class PiramidaTerbalik
{
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("Tugas 03");
        System.out.println("=========");

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 20 - 2 * i; k++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}