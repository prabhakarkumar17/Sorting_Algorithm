import java.io.*;
import java.util.*;

class childSorting implements Runnable {

    @Override
    public void run() {

        System.out.println("Child thread begins");

        System.out.println(
                "\n Enter range based upon which Random array will be generated :-\n Minimum Range = 10.\n Maximum Range = 10,000 ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=10 || n<10001){
            
        int arr[]=new int[n];
        
        Random r = new Random();

        ArrayList<Long> timeArray = new ArrayList<Long>();
        
        for(int i=0;i<n;i++){
            arr[i]=r.nextInt(100);
        }

        System.out.println("Enter how many times you want to sort the array:- \n Minimum bound = 10 \n Maximum bound = 1000 \n TIPS: Try to hit Upper bound for greater efficiency:");
        int limit = sc.nextInt();

        int arr1[] = arr;
        bubble bb = new bubble();
        long t1 = bb.sort(arr1,limit);
        timeArray.add(t1);

        int arr2[] = arr;
        selection sc1 = new selection();
        long t2 = sc1.sort(arr2,limit);
        timeArray.add(t2);

        int arr3[] = arr;
        insertion is = new insertion();
        long t3 = is.sort(arr3,limit);
        timeArray.add(t3);
        
        int arr4[] = arr;
        radix rx = new radix();
        long t4 = rx.sort(arr4,limit);
        timeArray.add(t4);

        int arr5[] = arr;
        comb cb = new comb();
        long t5 = cb.sort(arr5,limit);
        timeArray.add(t5);

        int arr6[] = arr;
        piegonHole ph = new piegonHole();
        long t6 = ph.sort(arr6,limit);
        timeArray.add(t6);

        int arr7[] = arr;
        brick bk = new brick();
        long t7 = bk.sort(arr7,limit);
        timeArray.add(t7);

        int arr8[] = arr;
        quick qs = new quick();
        long t8 = qs.sort(arr8,limit);
        timeArray.add(t8);

        int arr9[] = arr;
        merge mg = new merge();
        long t9 = mg.sort(arr9,limit);
        timeArray.add(t9);

        int arr10[] = arr;
        heapSort hs = new heapSort();
        long t10 = hs.sort(arr10,limit);
        timeArray.add(t10);

        int arr11[] = arr;
        cycleSort cs = new cycleSort();
        long t11 = cs.sort(arr11,limit);
        timeArray.add(t11);

        int arr12[] = arr;
        tree tr = new tree();
        long t12 = tr.sort(arr12,limit);
        timeArray.add(t12);

        int arr13[] = arr;
        stooge sto = new stooge();
        long t13 = sto.sort(arr13,limit);
        timeArray.add(t13);

        int arr14[] = arr;
        gnome gn = new gnome();
        long t14 = gn.sort(arr14,limit);
        timeArray.add(t14);

        Collections.sort(timeArray);
        Iterator itr = timeArray.iterator();
        int i=1;
        
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Based upon performance listing of Sorting Algorithm is as follows (in Nano Second)");
        System.out.println("----------------------------------------------------------------------------------\n");

        while(itr.hasNext()){
            long check = (long)itr.next();
            
            if(check==t1){
                System.out.println((i++)+". Average time taken by BUBBLE SORT is: "+check);
            }
            else if(check==t2){
                System.out.println((i++)+". Average time taken by SELECTION SORT is: "+check);
            }
            else if(check==t3){
                System.out.println((i++)+". Average time taken by INSERTION SORT is: "+check);
            }
            else if(check==t4){
                System.out.println((i++)+". Average time taken by RADIX SORT is: "+check);
            }
            else if(check==t5){
                System.out.println((i++)+". Average time taken by COMB SORT is: "+check);
            }
            else if(check==t6){
                System.out.println((i++)+". Average time taken by PIEGON SORT is: "+check);
            }
            else if(check==t7){
                System.out.println((i++)+". Average time taken by BRICK SORT is: "+check);
            }
            else if(check==t8){
                System.out.println((i++)+". Average time taken by QUICK SORT is: "+check);
            }
            else if(check==t9){
                System.out.println((i++)+". Average time taken by MERGE SORT is: "+check);
            }
            else if(check==t10){
                System.out.println((i++)+". Average time taken by HEAP SORT is: "+check);
            }
            else if(check==t11){
                System.out.println((i++)+". Average time taken by CYCLE SORT is: "+check);
            }
            else if(check==t12){
                System.out.println((i++)+". Average time taken by TREE SORT is: "+check);
            }
            else if(check==t13){
                System.out.println((i++)+". Average time taken by STOOGE SORT is: "+check);
            }
            else if(check==t14){
                System.out.println((i++)+". Average time taken by GNOME SORT is: "+check);
            }
            
        }
        
    }
        System.out.println("\n Child thread terminates");
    }
}

