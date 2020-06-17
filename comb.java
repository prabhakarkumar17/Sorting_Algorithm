
class comb{
    public long sort(int array[],int limit){

        System.out.println("------------COMB SORT ALGORITHM------------");  //Improvement of BUBBLE SORT ALGORITHM
        long avgTime=0;
for(int i=0;i<limit;i++)
{
        long startTime=System.nanoTime();

        combSort(array);
        
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        avgTime+=timeElapsed;
}
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<array.length;k++){
            System.out.print(array[k]+" ");
        }
System.out.println();
 System.out.println("Average time taken by COMB SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");

 return avgTime/10;
    }

    private void combSort(int array[]){
        int gap = array.length;
        int n=gap;

        while(gap>=1){
            gap=(gap*10)/13;

            for(int i=0;i<n-gap;i++){
                
                    if(array[i]>array[i+gap]){
                        int temp=array[i];
                        array[i]=array[i+gap];
                        array[i+gap]=temp;
                    }
                
            }
        }
      
    }
}