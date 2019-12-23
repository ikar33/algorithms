package ikar.different;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * Given sequence. Find all 3 numbers, witch gives in summ zero
 */

@SuppressWarnings("Duplicates")
public class FreeSumm {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>> processed = new HashSet<>();

        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int zeroSeq = 0;
        for (Integer num: nums) {
            if (num <= 0){
                negative.add(num);
                if(num == 0){
                    zeroSeq++;
                }
            } else {
                positive.add(num);
            }
        }

        if(zeroSeq>2)
            addToList(processed,0,0,0);


        for (int i_neg = 0; i_neg < negative.size(); i_neg++) {
            for (int i_pos = 0; i_pos < positive.size(); i_pos++) {
                int diff = negative.get(i_neg)  + positive.get(i_pos);
                if(diff  >= 0 ){
                    if(i_neg != negative.size()) {
                        for (int i_middle = i_neg + 1; i_middle < negative.size(); i_middle++) {
                            if (diff + negative.get(i_middle) == 0) {
                                if(negative.get(i_neg) < negative.get(i_middle)){
                                    addToList(processed,negative.get(i_neg),positive.get(i_middle),positive.get(i_pos));
                                }else{
                                    addToList(processed,positive.get(i_middle),negative.get(i_neg),positive.get(i_pos));
                                }
                            }
                        }
                    }
                }else
                    for (int i_middle = i_pos + 1; i_middle < positive.size(); i_middle++) {
                        if(diff + positive.get(i_middle) == 0){
                            if(positive.get(i_middle) < positive.get(i_pos)){
                                addToList(processed,negative.get(i_neg),positive.get(i_middle),positive.get(i_pos));
                            }else{
                                addToList(processed,negative.get(i_neg),positive.get(i_pos),positive.get(i_middle));
                            }
                        }
                    }

            }
        }
        return new ArrayList(processed);
    }

    private void addToList(HashSet processed,Integer a ,Integer b ,Integer c){
        processed.add(new ArrayList<Integer>(){{
            add(a);
            add(b);
            add(c);
        }});
    }





}
