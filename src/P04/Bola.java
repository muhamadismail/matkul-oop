package P04;

/**
 * Created by Ismail on 13-Mar-17.
 * @pertemuan 04 (Praktek)
 * @date 7 Maret 2017
 * @author Muhamad Ismail
 *
 * @tugas 01 (c dan d)
 * @desc Menghitung nilai luas permukaan dan volume bola dengan nilai radius dalam
 *       tipe data byte.
 *
 */
import java.lang.Math;

public class Bola {
    byte radius;

    public Bola(byte r)
    {
        radius = r;
    }

    public double luasPermukaan()
    {
        return Math.PI * 4 * Math.pow((double) radius, 2.0);
    }

    public double volume()
    {
        return Math.PI * (4.0/3.0) * Math.pow((double) radius, 3.0);
    }

    public static void main(String[] args)
    {
        Bola bolaSaya = new Bola((byte) 5);

        System.out.println(bolaSaya.luasPermukaan());
        System.out.println(bolaSaya.volume());
    }
}
