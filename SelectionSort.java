public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int small = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[small] > arr[j]){
                    small = j;
                }
            }
            
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        int arr[]= {3,60,4,8,5,2,9,1};
        selectionSort(arr);
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}