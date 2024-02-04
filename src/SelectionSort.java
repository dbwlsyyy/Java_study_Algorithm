public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,10,5,8,7,6,4,3,2,9};
        int i, min,j,index = 0,temp;
        for(i = 0; i < 10; i++){
            min = 9999;
            for( j = i; j < 10; j++ ){
                if(min > arr[j]){
                    min = arr[j];
                    index = j;
                }

            }
            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

        }
        for(int h=0; h< 10; h++){
            System.out.println(arr[h]);
        }
    }
}
