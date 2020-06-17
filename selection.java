class selection{
    public long sort(int array[],int limit) {
        System.out.println("\n----------------SELECTION SORTING ALGORITHM-----------------");
        long avgTime=0;
        int n,i,j,temp;
    for(int a=0;a<limit;a++){
        n=array.length;
        int arr[]=new int[n];
        arr=array;
        long startTime = System.nanoTime();
        for(i=0;i<n;i++){
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
        avgTime+=timeElapsed;
    }

    System.out.print("The Sorted array is :  ");

    for(int k=0;k<array.length;k++){
        System.out.print(array[k]+" ");
    }
    System.out.println();
    System.out.println("Average time taken by SELECTION SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
    return avgTime/10;    
}
}





/*class selection extends Thread {

    int n;
    int arr[] = new int[10];

    selection(int[] array) {
        n = array.length;
        arr = array;
    }

    public void run() {

        System.out.println("This is Selection Sort");
        int i,j,temp;

        long startTime = System.nanoTime();
        for(i=0;i<n;i++){
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
        System.out.println("Time elapsed for SELECTION SORT= "+timeElapsed);

        /*for(int k=0;k<n;k++){
            System.out.print(arr[k]);
        }
        System.out.println();
    }

    
}*/