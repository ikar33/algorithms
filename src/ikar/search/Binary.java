package ikar.search;




import java.util.Arrays;


public class Binary {
    public int searchElement(int[] src_array, int search) {
        try {
            return inlineSearch(src_array,search);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    private int inlineSearch(int[] srcArray, int search_elem) throws Exception {
        int middle_el = srcArray.length / 2;
        if(srcArray.length == 1 && search_elem != srcArray[0]){
            throw new Exception("element not found");
        }
        if(search_elem < srcArray[middle_el]){
            return inlineSearch(Arrays.copyOfRange(srcArray, 0,  middle_el), search_elem);
        }else if(search_elem > srcArray[middle_el]){
            return inlineSearch(Arrays.copyOfRange(srcArray, middle_el,  srcArray.length), search_elem) + middle_el;
        }else{
            return middle_el;
        }
    }
}
