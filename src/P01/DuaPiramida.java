package P01;

/**
 * Created by Ismail on 25-Feb-17.
 * @pertemuan 01 (Praktikum)
 * @date 14 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 04
 * @desc Menampilkan output seperti tugas 03. Tapi, setelah 2 '#',
 *       dilajutkan kembali dengan 4 '#' hingga mencapai 20 '#'
 *
 * @output
 *       > ####################
 *       >  ##################
 *       >         ...
 *       >         ...
 *       >         ##
 *       >        ####
 *       >         ...
 *       >  ##################
 *       > ####################
 *
 */
public class DuaPiramida
{
    public static void main(String [] args)
    {
        System.out.println("");
        System.out.println("Tugas 04");
        System.out.println("=========");

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 20 - 2*i; k++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
        for (int i = 8; i >= 0; i--)
        {
            for (int j = i-1; j >= 0; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < 20-2*i; k++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
