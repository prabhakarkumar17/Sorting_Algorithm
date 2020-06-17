class brick{
    public long sort(int array[],int limit){
        System.out.println("-------------------BRICK SORT ALGORITHM------------------");  //Improvement of BUBBLE SORT ALGORITHM
        long avgTime=0;
        for(int k=0;k<limit;k++)
       {
         long startTime=System.nanoTime();

        int n=array.length;
        brickSort(array,n);
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        avgTime+=timeElapsed;
       }

        System.out.print("The Sorted array is :  ");

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    System.out.println();
    System.out.println("Average time taken by BRICK SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
    
        System.out.println();
        return avgTime/10;
    }

    private static void brickSort(int arr[],int n){
        
        boolean isSorted = false; // Initially array is unsorted 
  
        while (!isSorted) 
        { 
            isSorted = true; 
            int temp =0; 
  
            // Perform Bubble sort on odd indexed element 
            for (int i=1; i<=n-2; i=i+2) 
            { 
                if (arr[i] > arr[i+1]) 
                { 
                    temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                    isSorted = false; 
                } 
            } 
  
            // Perform Bubble sort on even indexed element 
            for (int i=0; i<=n-2; i=i+2) 
            { 
                if (arr[i] > arr[i+1]) 
                { 
                    temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp; 
                    isSorted = false; 
                } 
            }
        } 
                
    }
}
        

