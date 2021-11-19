import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

// Использовать квадратичный подход к вычислению последовательности проб на базе хеш-функции умножения при m = 3083, 4096; A = 0,618.
//Kiyanbekova Adina Sib-29/1

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        HashMap<Integer, Integer> P = new HashMap<>();
        int m = 3083;
        float A = (float) 0.618;
        for (int i = 0; i < 6; i++) {
            P.put(i, Hmod(i, m));
        }
    }

    public static int Hmod(int k, int m) {
        return k % m;    //qaldyqpen bolu
    }

    public static int hash_multiply(int k, int m, float A) {
        int h1, h2 = 4096;
        return (h1 = (int) ((h2 * k) + A));   //квадратичный подход к вычислению последовательности проб , kobeitu
    }

}