public class greater_num{
      public static void main(String[]args){
      Scanner sc=new Scnner(System.in);
      System.out.print("Enter number:");
      int m=sc.nextInt();
       int n=sc.nextInt();
       int l=sc.nextInt();
       if(m>n)
       {
           System.out.print("greater number is:"+m);
       }else if(n>1)
       {
           System.out.print("greater number is:"+n);
       }else if(l>m)
           System.out.print("greater number is:"+l);
}
}