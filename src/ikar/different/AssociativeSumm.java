package ikar.different;

import java.util.ArrayList;
import java.util.List;

/**
 decomposes a number into sums of all sorts of numbers
 */
public class AssociativeSumm {

    public static void main(String[] args ){
        int number = 8;

        List<Integer> result = new ArrayList<>();
        result.add(number);
        System.out.println(number);
        toDeep(result, new Integer(0));


    }

    public static void toDeep(List<Integer> src, Integer iter ){
        for(int i=0; i < src.size(); i++){
            if(src.get(i).intValue() != 1){
                int val = src.get(i);
                if (val-- > 1){
                    List clList = cloneList(src);
                    clList.set(i, val);
                    if(i + 1 == clList.size()){
                        clList.add(new Integer(1));
                        printList(clList);
                        toDeep(clList, ++iter);
                    }else{
                        clList.set(i + 1,src.get(i + 1) + 1); //increment i+1 element
                        printList(clList);
                        toDeep(clList, ++iter);
                    }
                }
                break;
            }
        }

    }

    public static List<Integer> cloneList(List<Integer> list) {
        List<Integer> clone = new ArrayList<Integer>(list.size());
        for (Integer item : list){
            clone.add(item);
        }
        return clone;
    }

    public static void printList(List src){
        int ind = 0;
        src.stream().forEach(item -> System.out.print(item + " "));
        System.out.println();
    }
}
