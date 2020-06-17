
class merge{
     int b[] = new int[5];
     long sort(int arr[],int limit){
        System.out.println("-------------------MERGE SORT ALGORITHM-------------------");
        long avgTime=0;
        for(int a=0;a<limit;a++){

            long startTime = System.nanoTime();

            int low=0;
            int high=arr.length-1;
            divide(low,high,arr);

            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;

            avgTime+=timeElapsed;
        }
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by MERGE SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
        return avgTime/10;
    }

    private void divide(int low,int high,int arr[]){
        if(low<high){
            int mid = (low+high)/2;
            divide(low,mid,arr);
            divide(mid+1,high,arr);
            mergeSort(low,mid,high,arr);
        }
    }

    private void mergeSort(int low,int mid,int high, int arr[]){
        int i,j,k;
        int b[] = new int[arr.length];
        i=low; j=mid+1; k=low;

        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                b[k]=arr[i];
                i++;
            }else{
                b[k]=arr[j];
                j++;
            }
        }k++;
        if(i>=mid){
            while(j<=high){
                b[k]=arr[j];
                j++; k++;
            }
        }else{
            while(i<=mid){
                b[k]=arr[i];
                i++; k++;
            }
        }
        /*for(int a=0;a<arr.length;a++){
            System.out.print(b[a]+" ");
        }*/
        
    }


}