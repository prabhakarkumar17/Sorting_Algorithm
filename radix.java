import java.util.Arrays;

class radix {
   
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    private static void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
   
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 

        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    
    public long sort(int arr[],int limit) 
    { 
        
        System.out.println("-------------------RADIX SORT ALGORITHM-------------------");
        long avgTime=0;
        for(int a=0;a<limit;a++){
            long startTime = System.nanoTime();
            int n=arr.length;
            int m = getMax(arr, n); 
   
            for (int exp = 1; m/exp > 0; exp *= 10) 
                countSort(arr, n, exp); 

                long endTime = System.nanoTime();
                long timeElapsed = endTime - startTime;
                avgTime+=timeElapsed;
            }
    
            System.out.print("The Sorted array is :  ");

            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
            System.out.println("Average time taken by RADIX SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
            return avgTime/10;
        } 
}











/*class radix{
    public void sort(int[] array){
        System.out.println("--------------RADIX SORT ALGORITHM---------------");
        int n,noOfDigit=0;
        long startTime = System.nanoTime();

        n=array.length;
        int arr[]=new int[n];
        arr=array;

        int maxNo=max(arr);
        //System.out.println(maxNo);

        while(maxNo!=0){
            int i = maxNo%10;
            noOfDigit+=1;
            maxNo = maxNo/10;
        }
        System.out.println("Total no of digits are "+noOfDigit);

        countSort(arr,noOfDigit);

        long endTime = System.nanoTime();
        long elapsedTime = endTime-startTime;
        System.out.println("Time Elapsed= "+elapsedTime);

    }

    private int max(int[] arr){
        int n=arr.length;    
        int maxNo=arr[0];

        for(int i=1;i<n;i++){
            if(maxNo<arr[i]){
                maxNo=arr[i];
            }
        }
        return maxNo;
    }

    private void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        // Store count of occurrences in count[] 
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        // Change count[i] so that count[i] now contains 
        // actual position of this digit in output[] 
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        // Build the output array 
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        // Copy the output array to arr[], so that arr[] now 
        // contains sorted numbers according to curent digit 
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
}*/