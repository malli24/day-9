import java.util.*;
public class Str2poin
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char b[]=a.toCharArray();
        int C=b.length;
        int l=0;
        int h=-1;
        while(l<=h)
        {
        char temp=b[1];
        b[l]=b[h];
        b[h]=temp;
        l++;
        h--;
        }
         String res=new String(b);
         System.out.println(res);
    }
}
        

        