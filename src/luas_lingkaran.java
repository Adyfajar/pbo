import java.util.Scanner;

public class luas_lingkaran {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("# PROGRAM MENGHITUNG LUAS LINGKARAN #");
        System.out.println("======================================");
        System.out.println();

        double r, luas;
        System.out.println("Masukkan Jari-jari lingkaran = ");
        r = input.nextDouble();

        luas = 3.14 * r * r;

        System.out.println("Luas lingkaran = "+luas);
    }
}