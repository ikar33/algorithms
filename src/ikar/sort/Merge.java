package algoritms.sort;

import java.util.Arrays;

public class Merge extends RandomArrays {
    @Override
    public void sortArray() {

        int[] res = merge(Arrays.copyOfRange(src_int_array, 0, (src_int_array.length)/ 2), Arrays.copyOfRange(src_int_array, (src_int_array.length )/ 2, src_int_array.length ));
        src_int_array = res;
        printArray();


    }

    private int[] merge(int part_1[], int part_2[]) {

        int[] res_part_1 = part_1;
        int[] res_part_2 = part_2;




        if (part_1.length > 1 ) {
            res_part_1 = merge(Arrays.copyOfRange(part_1, 0, (part_1.length) / 2), Arrays.copyOfRange(part_1, (part_1.length) / 2, part_1.length));
        }
        if(part_2.length > 1){
            res_part_2 = merge(Arrays.copyOfRange(part_2, 0, (part_2.length)/ 2), Arrays.copyOfRange(part_2, (part_2.length )/ 2, part_2.length));
        }
        int res_array_syze = res_part_1.length + res_part_2.length;
        int res_array[] = new int[res_array_syze];

        int p_1_arr_ind = 0;
        int p_2_arr_ind = 0;
        int res_arr_ind = 0;

        while (true) {
            if (res_part_1[p_1_arr_ind] < res_part_2[p_2_arr_ind]) {
                res_array[res_arr_ind++] = res_part_1[p_1_arr_ind++];
            } else {
                res_array[res_arr_ind++] = res_part_2[p_2_arr_ind++];
            }

            if (p_1_arr_ind == res_part_1.length) {
                for (int i = res_arr_ind; i < res_array_syze; i++) {
                    res_array[res_arr_ind++] = res_part_2[p_2_arr_ind++];
                }
                break;
            } else if (p_2_arr_ind == res_part_2.length) {
                for (int i = res_arr_ind; i < res_array_syze; i++) {
                    res_array[res_arr_ind++] = res_part_1[p_1_arr_ind++];
                }
                break;
            }
        }


        return res_array;
    }

}
