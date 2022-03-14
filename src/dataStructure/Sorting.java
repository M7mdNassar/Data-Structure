package dataStructure;

public class Sorting {

    public void bubbleSort (int[]array){

        for (int i = 0 ; i < array.length-1  ; i++) {
            for (int j=0 ; j < array.length -1- i ; j++){
                if (array[j] > array[j+1])
                    swap(array , j, j+1);
            }

        }
    }


    public void selectionSort (int []array) {
        int minIndex;
        for (int i = 0  ; i<array.length -1 ; i++){
            minIndex = i;
            for (int j = i+1 ; j< array.length ; j++)
                if (array[j] < array[minIndex])
                    swap(array , j ,minIndex);
        }


    }


    public void insertionSort(int arr[])
    {
        int i, key, j;
        for (i = 1; i < arr.length; i++)
        {
            key = arr[i];
            j = i - 1;

        /* Move elements of arr[0..i-1], that are
        greater than key, to one position ahead
        of their current position */
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    public void swap(int []array , int m , int n){
        int temp= array[m];
        array[m] = array[n];
        array[n]=temp;
    }

    public void display(int []arr)
    {
        System.out.print("Array : ");
        for (int i = 0; i <arr.length  ; i++) {
            System.out.print( arr[i] +" " );
        }
        System.out.println("");
    }


    public static void main(String[] args) {
        int []array = {3,5,2,4,1,6,10,9,7,8};
        Sorting s = new Sorting();
        s.display(array);
        s.bubbleSort(array);
        s.display(array);
        s.selectionSort(array);
        s.display(array);
        s.insertionSort(array);
        s.display(array);

    }

}
