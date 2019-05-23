package algoritms.search;



import java.util.Arrays;

public class SearchMain {

    public static void main(String[] args) {
        int[] src_int_array = {1, 6, 7, 10, 11, 23 ,26 ,30, 31, 38, 43, 46, 48, 50,56, 89, 91, 94};
        System.out.println((new Binary()).searchElement(src_int_array, 50));


        String src = "abcdefg";

        StringBuilder src_res = new StringBuilder();
        for(int i = src.length() - 1; i >= 0; i--){
            src_res.append(src.charAt(i));
        }
        System.out.println(src_res);


    }

    void printArray(int[] src_int_array){
        Arrays.stream(src_int_array).forEach(a -> System.out.print(" " + a));
        System.out.println();


    }
}
