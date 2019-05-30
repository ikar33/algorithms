package ikar.sort;

public class Inserting extends RandomArrays {


    @Override
    public void sortArray() {
        for (int i = 0; i < src_int_array.length ; i++) {
            for (int j = 0; j < i; j++) {
                if (this.src_int_array[i] >= this.src_int_array[j]) {
                    if (this.src_int_array[i] < this.src_int_array[j + 1]) {
                        if (i != j + 1) {

                            int temp = this.src_int_array[j + 1];
                            this.src_int_array[j + 1] = this.src_int_array[i];

                            for (int k = j + 1; k < i; k++) {
                                int temp_ = this.src_int_array[k + 1];
                                this.src_int_array[k + 1] = temp;
                                temp = temp_;
                            }
                        }
                    }
                } else {
                    if(j == 0){ //if needle element is first
                        int temp = this.src_int_array[j];
                        this.src_int_array[j] = this.src_int_array[i];

                        for (int k = j + 1; k <= i; k++) {
                            int temp_ = this.src_int_array[k];
                            this.src_int_array[k] = temp;
                            temp = temp_;
                        }
                    }else if (i == j + 1) { //if needle element is last
                        int temp = this.src_int_array[j];
                        this.src_int_array[j] = this.src_int_array[i];
                        this.src_int_array[i] = temp;
                    }
                }
            }
        }
    }

}
