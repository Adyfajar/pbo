import java.util.Scanner;
public class Matrik {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAM MATRIK 2 DIMENSI");
        System.out.println("=========================");

        //deklarasi array
        int[][] arr= new int[50][50];
        int jml_baris, jml_kolom, i, j;

        System.out.println("input jumlah baris = ");
        jml_baris = input.nextInt();

        System.out.println("Input jumlah kolom = ");
        jml_kolom = input.nextInt();

        //proses input array
        for (i=0; i<jml_baris; i++){
            for (j=0; j<jml_kolom; j++){
                System.out.print("Baris"+(i+1)+ ", Kolom" +(j+1)+" = ");
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }
        //menampilkan hasil matriks
        System.out.println("Hasil Matriks = ");
        for (i=0; i<jml_baris; i++){
            for (j=0; j<jml_kolom; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}