public class vowel{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in):
    System.out.println("Enter alphabets:");
    char ch=sc.next().charAt(0);
    switch(ch)
{
   case 'a':
   case 'e':
   case 'i':
   case 'o':
   case 'u':
    System.out.println("It is vowel "+ch);
    break;
    default:System.out.println("It is not vowel= "+ch):
    break;
}
}
}