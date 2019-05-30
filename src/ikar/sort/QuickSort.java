package ikar.sort;
import java.util.Arrays;

public class QuickSort extends RandomArrays {
    @Override
    public void sortArray() {
        src_int_array = sortPartition(src_int_array);
    }

    public int[] sortPartition(int[] src_array) {
        if(src_array.length < 2){
            return src_array;
        }
        int base_el = src_array[src_array.length / 2];


        int[] l_array = new int[0];
        int[] r_array = new int[0];
        int[] m_array = new int[0];

        for (int value : src_array) {
            if (value < base_el) {
                l_array = addToArray(l_array, value);
            }else if (value == base_el) {
                m_array = addToArray(m_array, value);
            }else {
                r_array = addToArray(r_array, value);
            }
        }
        l_array = sortPartition(l_array);
        r_array = sortPartition(r_array);

        src_array =  concatArrays(concatArrays(l_array, m_array),r_array);
        return src_array;
    }

    public int[] addToArray(int[] src, int value) {
        src = Arrays.copyOf(src, src.length + 1);
        src[src.length - 1] = value;
        return src;
    }

    public int[] concatArrays(int[] l_array, int[] r_array) {
        int[] res = new int[l_array.length + r_array.length];

        for (int i = 0; i < res.length; i++) {
            if (i < l_array.length) {
                res[i] = l_array[i];
            }
            if (i < r_array.length) {
                res[i + l_array.length] = r_array[i];
            }
        }
        return res;
    }
}
