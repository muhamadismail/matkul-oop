package P04;

/**
 * Created by Ismail on 12-Mar-17.
 * @pertemuan 04 (Teori)
 * @date 06 Maret 2017
 * @author Muhamad Ismail
 *
 * @desc Pengenalan bahasa berorientasi objek. Menggunakan String class sebagai contoh dalam mengimplementasikan
 *       objek pada Java.
 */
public class JavaString {
    public static void main(String[] args)
    {
        String s1 = new String();

        s1 = "Hello";
        String s2 = s1;

        s2 = new String(s1);

        s2 = s1.toUpperCase();

        String s3 = s2.concat("!!");        // Juga bisa ditulis s3 = s2 + "!!";
    }
}
