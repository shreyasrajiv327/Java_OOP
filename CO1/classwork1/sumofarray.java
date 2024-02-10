package classwork1;

public class sumofarray {
   public static void main(String[] args) {
    int a[] = new int[5];
    a[0]=1;
    a[1]=2;
    a[2]=3;
    a[3]=4;
    a[4]=5;
    int max=0;
    for(int i=0; i<a.length; i++)
    {
        max=max+a[i];
    }
    System.out.println(max);
   }

}
