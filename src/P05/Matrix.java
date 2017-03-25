package P05;

/**
 * Created by Ismail on 13-Mar-17.
 *
 * @pertemuan 05 (Teori)
 * @date  13 Maret 2017
 * @author Muhamad Ismail
 *
 * @tugas 01 - 04
 * @desc Program yang dapat mengisi matriks, menjumlahkan matriks, mengalikan matrikx,
 *       dan mencari determinan dari matriks. Selain itu, juga program untuk menampilkan
 *       isi matriks dalam format matriks (baris dan kolom).
 */

import java.util.Scanner;
import java.lang.Math;

public class Matrix {
    int[][] dataMatrix;
    int jumlahBaris;
    int jumlahKolom;

    public Matrix(int baris, int kolom)
    {
        dataMatrix = new int[baris][kolom];
        jumlahBaris = baris;
        jumlahKolom = kolom;
    }

    public void masukanData(int baris, int kolom, int data)
    {
        dataMatrix[baris][kolom] = data;
    }

    public void jumlahDengan(Matrix matrixLain)
    {
        for(int i = 0; i < jumlahBaris; i++)
        {
            for (int j = 0; j < jumlahKolom; j++)
            {
                dataMatrix[i][j] += matrixLain.dataMatrix[i][j];
            }
        }
    }

    public void kaliDenganKonstanta(int konstanta)
    {
        for (int i = 0; i < jumlahBaris; i++)
        {
            for (int j = 0; j < jumlahKolom; j++)
            {
                masukanData(i, j, konstanta * dataMatrix[i][j]);
            }
        }
    }

    public Matrix perkalianMatrix(Matrix m1, Matrix m2)
    {
        Matrix hasilKali = new Matrix(m1.jumlahBaris, m2.jumlahKolom);

        int temp;

        if (m1.jumlahKolom == m2.jumlahBaris) {
            for (int i = 0; i < m1.jumlahBaris; i++) {
                for (int j = 0; j < m2.jumlahKolom; j++) {
                    temp = 0;
                    for (int k = 0; k < m2.jumlahBaris; k++) {
                        temp += m1.dataMatrix[i][k] * m2.dataMatrix[k][j];
                    }
                    hasilKali.masukanData(i, j, temp);
                }
            }
        }
        // Jika tidak memenuhi if diatas, maka akan mengembalikan matrix kosong.
        return hasilKali;
    }

    public int determinant()
    {
        int det = 0;
        int i, j, im, jm;

        if (jumlahBaris == jumlahKolom) {
            if (jumlahBaris == 2) {
                det = dataMatrix[0][0] * dataMatrix[1][1] - dataMatrix[1][0] * dataMatrix[0][1];
            } else if (jumlahBaris == 1) {
                det = dataMatrix[0][0];
            } else if (jumlahBaris < 1) {
                // Error
            } else {
                Matrix tempMatrix = new Matrix(jumlahBaris - 1, jumlahKolom - 1);

                for (i = 0; i < jumlahKolom; i++)
                {
                    for (im = 1; im < jumlahBaris; im++)
                    {
                        j = 0;
                        for (jm = 0; jm < jumlahKolom; jm++)
                        {
                            if (jm == i)
                                continue;
                            tempMatrix.masukanData(im-1, j, dataMatrix[im][jm]);
                            j++;
                        }
                    }
                    det += Math.pow(-1.0, i) * dataMatrix[0][i] * tempMatrix.determinant();
                }
            }
        } else {
            // Matrix tidak persegi
        }

        return det;
    }

    public void printMatrix()
    {
        for (int i = 0; i < jumlahBaris; i++)
        {
            for (int j = 0; j < jumlahKolom; j++)
            {
                System.out.printf("%d\t", dataMatrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args)
    {
        Matrix m1 = new Matrix(3, 3);
        Matrix m2 = new Matrix(3, 2);

        Scanner inMatrix = new Scanner(System.in);

        System.out.println("Input Matrix ke-1 : ");
        for (int i = 0; i < m1.jumlahBaris; i++)
        {
            for (int j = 0; j < m1.jumlahKolom; j++)
            {
                m1.masukanData(i, j, inMatrix.nextInt());
            }
        }

        /**
        System.out.println("Input Matrix ke-2 : ");
        for (int i = 0; i < m2.jumlahBaris; i++)
        {
            for (int j = 0; j < m2.jumlahKolom; j++)
            {
                m2.masukanData(i, j, inMatrix.nextInt());
            }
        }
        **/

        System.out.println("\nMatrix ke-1 : ");
        m1.printMatrix();

        // System.out.println("\nMatrix ke-2 : ");
        // m2.printMatrix();

        // System.out.println("\nJumlah matrix ke-1 dan ke-2 : ");
        // m1.jumlahDengan(m2.dataMatrix);
        // m1.printMatrix();

        // System.out.println("\nPerkalian matrix ke-1 dan ke-2 : ");
        // Matrix m3 = m1.perkalianMatrix(m1, m2);
        // m3.printMatrix();
        System.out.println("Determinan matrix ke-1 = " + m1.determinant());
    }

}