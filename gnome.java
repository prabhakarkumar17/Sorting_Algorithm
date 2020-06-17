class gnome{
    public long sort(int arr[],int limit){
        System.out.println("------------------GNOME SORT ALGORITHM-------------------");
        long avgTime=0;
        for(int a=0;a<limit;a++){
            long startTime = System.nanoTime();
            gnomeSort(arr);
            long endTime = System.nanoTime();
            long timeElapsed = endTime-startTime;
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

    private void gnomeSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                if(i==0){continue;}
                else{i--;}
            }else{
                continue;
            }
        }
    }
}