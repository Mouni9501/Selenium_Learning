public class ArrayRotation

{


    public static void main(String args[])
    {
        int a[]  = {1,2,3,4,5,6,7,8,9,10};//9,10,1,2,3,4,5,6,7,8
        int n= a.length;
        int  k=17;
        if(k>n)
        {
            k=k%n;
        }
      reverseArray(a,0,n-1);
      reverseArray(a,0,k-1);
      reverseArray(a,k,n-1);
      for(int abc:a)
          System.out.print(abc+" ");
       // 10,9,8,7,6,5,4,3,2,1
        //9,10,8,7,6,5,4,3,2,1
        //9,10,1,2,3,4,5,6,7,8

    }
    static void reverseArray(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp = a[start];
            a[start]= a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
}
