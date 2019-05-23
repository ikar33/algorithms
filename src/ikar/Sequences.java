package algoritms;

import java.util.Arrays;

public class Sequences {


    public void print_Fibonacci_loop(int size){
        int[] fibbonachi_seq = new int[size];
        fibbonachi_seq[0] = 0;
        fibbonachi_seq[1] = 1;
        for(int i = 2; i < size; i++){
            fibbonachi_seq[i] = fibbonachi_seq[i - 1] + fibbonachi_seq[i - 2];
        }

        Arrays.stream(fibbonachi_seq).forEach(a -> System.out.print(" " + a));
    }

    public void printFibonacci_recursive(int size){

        int[] fibbonachi_seq = new int[size];
        fibbonachi_seq[0] = 0;
        fibbonachi_seq[1] = 1;
        for(int i = 2; i < size; i++){
            fibbonachi_seq[i] = fibbonachi_seq[i - 1] + fibbonachi_seq[i - 2];
        }

        Arrays.stream(fibbonachi_seq).forEach(a -> System.out.print(" " + a));
    }

}
