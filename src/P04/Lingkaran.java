package P04;

/**
 * Created by Ismail on 13-Mar-17.
 * @pertemuan 04 (Praktek)
 * @date 7 Maret 2017
 * @author Muhamad Ismail
 *
 * @tugas 01 (a dan b)
 * @desc Menghitung nilai keliling dan luas lingkaran dengan nilai radius dalam
 *       tipe data byte.
 *
 */
import java.lang.Math;

public class Lingkaran {
    byte radius;

    public Lingkaran(byte r)
    {
        radius = r;
    }

    public double keliling()
    {
        return Math.PI * 2 * (double) radius;
    }

    public double luas()
    {
        return Math.PI * Math.pow((double) radius, 2.0);
    }

    public static void main(String[] args)
    {
        Lingkaran lingkaranSaya = new Lingkaran((byte) 5);

        System.out.println(lingkaranSaya.keliling());
        System.out.println(lingkaranSaya.luas());
    }
}
