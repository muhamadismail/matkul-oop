package P04;

/**
 * Created by Ismail on 13-Mar-17.
 * @pertemuan 04 (Praktek)
 * @date 7 Maret 2017
 * @author Muhamad Ismail
 *
 * @tugas 02
 * @desc Menggunakan BufferedReader untuk menerima nilai input radius suatu lingkaran atau bola. Method untuk lingkaran
 *       maupun bola diambil dari soal tugas 01 sebelumnya.
 *
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputBufferReader {
    public static void main(String[] args)
    {
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("Masukkan nilai radius (cm) untuk ligkaran dan bola : ");

        try {
            byte radius = Byte.parseByte(input.readLine());

            Lingkaran ling = new Lingkaran(radius);
            Bola bola = new Bola(radius);

            System.out.println("Lingkaran:");
            System.out.println("\tKeliling = " + ling.keliling() + " cm");
            System.out.println("\tLuas = " + ling.luas() + " cm^2");

            System.out.println("Bola:");
            System.out.println("\tLuas Permukaan = " + bola.luasPermukaan() + " cm^2");
            System.out.println("\tVolume = " + bola.volume() + " cm^3");

        } catch (Exception e) {
            System.out.println("Terjadi Error: \n\t" + e);
        }
    }
}
