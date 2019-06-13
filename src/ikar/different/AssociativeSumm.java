package ikar.different;

import java.util.ArrayList;
import java.util.List;

/**
 decomposes a number into sums of all sorts of numbers
 выбранное натуральное целое положительное число представляем в виде всевозможного количества комбинаций слагаемых из положительных натуральных чисел
 */

/**
 * Описание алгоритма
 * Берем число и передаем его в виде массива в рекурсивную функцию. В данной функции цикл пробегается по элементам массива, которые являются слагаемыми и
 * если элемент больше 1, то вычитаем из него единицы и приавляем его к элементу справа, если спарва нет элемента, добавляем 1 к массиву увелчивая его.
 * Выписывваем кажду итерацию.
 * Пример:
 *
 * 3
 * 2 1
 * 1 2
 * 1 1 1
 */
public class AssociativeSumm {

    public static void main(String[] args ){
        int number = 3;

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
