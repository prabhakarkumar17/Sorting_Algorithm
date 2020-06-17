//import java.util.Scanner;

class insertion{

    public long sort(int arr[],int limit){
        System.out.println("-------------------INSERTION SORT ALGORITHM--------------------");
        long avgTime=0;
        for(int a=0;a<limit;a++){
            long startTime=System.nanoTime();

            int pos;
            int n = arr.length;
            for(int i=1;i<n;i++){
                pos=i;
                partition(arr,pos);
            }
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            avgTime+=timeElapsed;
        }    

        System.out.print("The Sorted array is :  ");

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by INSERTION SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
        return avgTime/10;
    }

    private void partition(int arr[],int pos){
        for(int i=0;i<pos;i++){
            if(arr[i]>arr[pos]){
                int temp=arr[i];
                arr[i]=arr[pos];
                arr[pos]=temp;
            }
        }
    }
    
    
}