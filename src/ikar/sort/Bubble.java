package ikar.sort;

/*
Сортировка пузырьком - Т итераций,на каждой сравниваются 2 ближайших элемента и меньший ставится раньше
 */
public class Bubble extends algoritms.sort.RandomArrays {

    public Bubble() {
        System.out.println("Bubble sort alhoritm:");
    }

    public static void main(String[] args) {

    }

    public void sortArray(){
        for (int j = 0; j < this.src_int_array.length - 1; j++)
            for (int i = 0; i < this.src_int_array.length - 1; i++) {
                if (this.src_int_array[i] > this.src_int_array[i + 1]) {
                    int temp_val = this.src_int_array[i];
                    this.src_int_array[i] = this.src_int_array[i + 1];
                    this.src_int_array[i + 1] = temp_val;
                }
            }
        //return this.src_int_array;
    }

}
