package ikar.sort;

import java.util.Arrays;
import java.util.Random;

public abstract class RandomArrays {

    public int randSize = 10;
    public int numberOrigin = 0;
    public  int numberBound = 100;

    protected int[] src_int_array;

    public abstract void sortArray();
    public RandomArrays() {
        src_int_array = new Random().ints(randSize, numberOrigin, numberBound).toArray();
    }

    void printArray(){
        Arrays.stream(this.src_int_array).forEach(a -> System.out.print(" " + a));
        System.out.println();
    }
}
