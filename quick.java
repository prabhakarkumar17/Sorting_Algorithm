
class quick{
    public long sort(int arr[],int limit){
        
        System.out.println("-------------------QUICK SORT ALGORITHM------------------");
        long avgTime=0;
        for(int a=0;a<limit;a++){
            long startTime = System.nanoTime();
            
            run(0,arr.length-1,arr);
       
            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            avgTime+=timeElapsed;
        }
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by GNOME SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
        return avgTime/10;
    }

    private void run(int l,int h,int arr[]){
        if(l<h){
            int j = partition(l,h,arr);
            run(l, j-1, arr);
            run(j+1,h,arr);
        } 
    }

    int partition(int l,int h,int arr[]){
        int i=l,j=h+1,pivot=arr[l];
        while(i<j){
            do{
                i++;    //INCREMENTING i
            }while(arr[i]<pivot);

            do{
                j--;    //DECREMENTING j
            }while(arr[j]>pivot);

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[l];
        arr[l]=arr[j];
        arr[j]=temp;

        return j;
    }
}

/*class quick {
    public static void main(String[] args);throws Exception; {

        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        quickSort qs = new quickSort();
        int low=0,high;
        high = sc.nextInt();
        int arr[] = new int[high];
        
        System.out.println("Enter array");
        try {
            for(int i=0;i<high;i++;)
                arr[i]=sc.nextInt();
        } catch (Exception e) {
            System.out.println("Exception occured "+e);
        }
        qs.sort(low, high-1, arr);

        System.out.println("Sorted Array is ");
        for(int k=0;k<high;k++;){
            System.out.print(arr[k]);
        }
        long; endTime = System.nanoTime();
        System.out.println("Time elapsed = "+(endTime-startTime));
        sc.close();

    }
}*/