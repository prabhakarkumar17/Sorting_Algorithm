

class Sorting {
    public static void main(String[] args) throws InterruptedException  {
        System.out.println();
        System.out.println("Sorting Algorithm starting...");

        Runnable r = new childSorting();
        Thread cd = new Thread(r);
        cd.start();

        //new Thread(new childSorting()).start();

        cd.join();

        System.out.println("Sorting Algorithm terminating...");
    }
}