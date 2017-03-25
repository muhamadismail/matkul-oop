package P02;

/**
 * Created by Ismail on 25-Feb-17.
 * @pertemuan 02 (Teori)
 * @date 20 Feb 2017
 * @author Muhamad Ismail
 *
 * @tugas 01
 * @desc Melakukan proses pengurutan/sorting data yang disimpan
 *       pada sebuah array integer. Sorting dapat berupa ascending
 *       maupun descending.
 *
 */
public class Sorting
{
    public static void main(String[] args)
    {
        // Array Data sebanyak 10 nilai integer.
        int[] data = {2, 9, 19, 10, 20, 3, 7, 42, 97, 1};
        int temp;

        // Ascending Order
        System.out.println("Sorting Ascending :");

        for (int i = 0; i < 9; i++)
        {
            for (int j = i + 1; j < 10; j++)
            {
                if (data[i] > data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }

        // Descending Order
        System.out.println("\nSorting Descending :");

        for (int i = 0; i < 9; i++)
        {
            for (int j = i + 1; j < 10; j++)
            {
                if (data[i] < data[j]) {
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(data[i] + " ");
        }
    }
}