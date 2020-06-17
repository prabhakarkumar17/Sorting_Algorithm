public class stooge { 

    static void stoogesort(int arr[], int l, int h) 
    { 
        if (l >= h) 
            return; 
  
        
        if (arr[l] > arr[h]) { 
            int t = arr[l]; 
            arr[l] = arr[h]; 
            arr[h] = t; 
        } 
 
        if (h - l + 1 > 2) { 
            int t = (h - l + 1) / 3; 
  
            stoogesort(arr, l, h - t); 
  
            stoogesort(arr, l + t, h); 
  
            stoogesort(arr, l, h - t); 
        } 
    } 
   
    public long sort(int arr[],int limit) 
    { 
        System.out.println("-------------------STOOGE SORT ALGORITHM-------------------"); 
        int n = arr.length; 
        long avgTime=0;
        for(int a=0;a<limit;a++){
        long startTime = System.nanoTime();
  
        stoogesort(arr, 0, n - 1); 

        long endTime = System.nanoTime();
        long timeElapsed = endTime-startTime;
  
        avgTime+=timeElapsed;
        }
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by STOOGE SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
        return avgTime/10;
    } 
} 