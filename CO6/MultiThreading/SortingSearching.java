import java.util.Arrays;
class sorting extends Thread{
    int[] array;
    sorting(int [] array){
        this.array = array;
    }
    
    public void run(){
        int n = array.length;
        for(int i = 0;i<n;i++)
        {
           for(int j = 0;j<n-1;j++){
              if(array[j]>array[j+1]){
                int temp = array[j];
                array[j]=array[j+1];
                array[j+1]= temp;
                
              }
           }
        }
        System.out.println("Array is sorted "  + Arrays.toString(array));
    }

}



class searching extends Thread{
    int[] array;
    int target;
    searching(int[] array,int t)
    {
        this.array = array;
        this.target =  t;
    }
    boolean found = false;

    public void run(){
        for(int i = 0;i<array.length;i++ ){
            if(array[i]==target)
            {
                found = true;
                break;
            }
        }
        if(found)
    {
        System.out.println("Target  found");
    }
    else{
        System.out.println("Target not found");
    }
    }

    
}
public class SortingSearching {
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 4}; // Correct initialization of the array
       sorting s1 = new sorting(arr); // Passing the array to the sorting constructor
       s1.start(); 
       try{
        s1.join();
       }catch(Exception e)
       {
         System.out.println(e.getMessage());
       }

       searching s2 = new searching(arr,3);
       s2.run();
       System.out.println(Arrays.toString(arr));
     }
}
