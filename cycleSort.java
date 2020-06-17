
class cycleSort { 
    
    public long sort(int arr[],int limit) 
    { 
        System.out.println("--------------------CYCLE SORT ALGORITHM-----------------");
        long avgTime=0;
for(int a=0;a<limit;a++)
{
        long startTime = System.nanoTime();

        int flag = 0; 
        int n=arr.length;
  
        for (int i = 0; i <= n - 2; i++) { 
            
            int item = arr[i]; 

            int pos = i; 
            for (int j = i + 1; j < n; j++) 
                if (arr[j] < item) 
                    pos++; 

            if (pos == i) 
                continue; 
   
            while (item == arr[pos]) 
                pos += 1; 
  
            
            if (pos != i) { 
                int temp = item; 
                item = arr[pos]; 
                arr[pos] = temp; 
                flag++; 
            } 
  
            while (pos != i) { 
                pos = i; 
  
                for (int j = i + 1; j < n; j++) 
                    if (arr[j] < item) 
                        pos += 1; 

                while (item == arr[pos]) 
                    pos += 1; 
  
                
                if (item != arr[pos]) { 
                    int temp = item; 
                    item = arr[pos]; 
                    arr[pos] = temp; 
                    flag++; 
                } 
            } 
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
 System.out.println("Average time taken by CYCLE SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
       
 return avgTime/10;
    }        
    
} 