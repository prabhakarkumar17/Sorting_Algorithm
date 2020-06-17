// import java.util.Scanner;


class bubble{
    public long sort(int[] array,int limit) {
        System.out.println("----------------BUBBLE SORTING ALGORITHM---------------");
        long avgTime=0;
        int n=array.length;
        int arr[]=new int[n];
        arr=array;

        for(int t=0;t<limit;t++){
            int i, j, temp;

            long startTime = System.nanoTime();
            for(i=0;i<n-1;i++){
                for(j=i+1;j<n;j++){
                 if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
                }
            }
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            avgTime +=timeElapsed;
        }
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
System.out.println();
 System.out.println("Average time taken by BUBBLE SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
       return avgTime/10;
    }
}






/*class bubble extends Thread{

    int arr[]=new int[10];
    int n;
    bubble(int[] array){
        n=array.length;
        arr=array;
    }
     public void run() {
        System.out.println("This is Bubble Sort");
        int i, j, temp;

        long startTime = System.nanoTime();
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Time elapsed for BUBBLE SORT is= "+timeElapsed);

        /*for(int k=0;k<n;k++){
            System.out.print(arr[k]);
        }
    }
}*/