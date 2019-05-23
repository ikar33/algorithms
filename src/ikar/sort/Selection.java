package algoritms.sort;

/*
Сортировка выбором. На n-ой итерации находим минимальный элемент и меняем его с n-ым
 */
public class  Selection  extends RandomArrays {

    public Selection() {
        System.out.println("Selecion sorting algoritm");
    }

    public void sortArray(){
        int min_index= 0;
        for(int i = 0; i < this.src_int_array.length - 1; i++){
            int min_element = this.src_int_array[i];
            min_index = i;
            for(int j = i + 1; j < this.src_int_array.length; j++){
                //find min
                if(this.src_int_array[j] < min_element){
                    min_element = this.src_int_array[j];
                    min_index = j;
                }
            }
            this.src_int_array[min_index] = this.src_int_array[i];
            this.src_int_array[i] = min_element;
        }
    }

}
