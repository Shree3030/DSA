class DivisorsofNumber {
    public static void print_divisors(int n) {
      int[] arr = new int[(int)Math.sqrt(n)];
      int count = 0;
         for(int i=1;i<=(int)Math.sqrt(n);i++)
     {
       if(n%i==0)
       {
         System.out.print(i+" ");
         int div =n/i;
         if(div!=i)
         {
             arr[count]=div;
             count++;
         }
       }
     }
     for(int i=count-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
}
