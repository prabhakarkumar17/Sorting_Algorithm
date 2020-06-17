public class heapSort 
{ 
    public long sort(int arr[],int limit) 
    { 
        System.out.println("------------------HEAP SORT-----------------");
        int n = arr.length; 
        long avgTime=0;
        for(int a=0;a<limit;a++){
            long startTime = System.nanoTime();
  
            for (int i = n / 2 - 1; i >= 0; i--) 
             heapify(arr, n, i); 
  
            for (int i=n-1; i>=0; i--) 
            { 
    
                int temp = arr[0]; 
                arr[0] = arr[i]; 
                arr[i] = temp; 

                heapify(arr, i, 0); 
             }  
            long endTime = System.nanoTime();
            long timeElapsed = endTime-startTime;

            avgTime+=timeElapsed; 
        }
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by HEAP SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
        return avgTime/10;
    } 
  
    
    void heapify(int arr[], int n, int i) 
    { 
        int largest = i; 
        int l = 2*i + 1; 
        int r = 2*i + 2; 
  
        
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
  
        
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
  
        
        if (largest != i) 
        { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 

            heapify(arr, n, largest); 
        } 
    } 
} 
