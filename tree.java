class tree  
{ 
    public long sort(int arr[],int limit)  
    { 
        System.out.println("--------------------TREE SORT ALGORITHM-------------------");
        long avgTime=0;
        for(int a=0;a<limit;a++){
            long startTime = System.nanoTime();
            treeins(arr); 
            inorderRec(root); 
            long endTime = System.nanoTime();
            long timeElapsed = endTime-startTime;
            avgTime+=timeElapsed;
        }
        System.out.print("The Sorted array is :  ");

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println("Average time taken by TREE SORT to sort elements after executing 10 times = "+avgTime/10+"\n\n");    
        return avgTime/10;
    } 
    
    class binaryTree  
    { 
        int key; 
        binaryTree left, right; 
  
        public binaryTree(int item)  
        { 
            key = item; 
            left = right = null; 
        } 
    } 
    binaryTree root; 
  
    tree()  
    {  
        root = null;  
    } 

    void insert(int key) 
    { 
        root = insertItem(root, key); 
    } 

    binaryTree insertItem(binaryTree root, int key)  
    { 
  
        if (root == null)  
        { 
            root = new binaryTree(key); 
            return root; 
        } 
  
        if (key < root.key) 
            root.left = insertItem(root.left, key); 
        else if (key > root.key) 
            root.right = insertItem(root.right, key); 
  
        /* return the root */
        return root; 
    } 
    
    void inorderRec(binaryTree root)  
    { 
        if (root != null)  
        { 
            inorderRec(root.left); 
            //System.out.print(root.key + " "); 
            inorderRec(root.right); 
        } 
    } 
    void treeins(int arr[]) 
    { 
        for(int i = 0; i < arr.length; i++) 
        { 
            insert(arr[i]); 
        } 
          
    } 
} 