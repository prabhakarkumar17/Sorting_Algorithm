class piegonHole{
    public long sort(int array[],int limit){
        System.out.println("-------------------PIEGON HOLE SORTING ALGORITHM------------------");
        long avgTime=0;
        int opArr[] = new int[array.length];
        for(int i=0;i<limit;i++){

            long startTime = System.nanoTime();
        
            int max=maxElement(array);
            int min=minElement(array);
            int range=(max-min)+1;

            opArr=pigeonHoleSort(array,range,min);

            long endTime = System.nanoTime();
            long timeElapsed = endTime - startTime;
            avgTime+=timeElapsed;

        }
        
        
        System.out.print("The sorted array is : ");

        for(int k=0;k<array.length;k++){
            System.out.print(opArr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by PIEGON SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");
        return avgTime/10;
    }

    private int maxElement(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

    private int minElement(int arr[]){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i])
                min=arr[i];
        }
        return min;
    }

    private int[] pigeonHoleSort(int arr[],int range,int min){
        int arr2[]=new int[range];
        for(int i=0;i<arr.length;i++){
            int a=arr[i]-min;
            arr2[a]=arr[i];
            arr[i]=arr2[a];
        }
        return arr;

    }
}