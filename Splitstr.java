import java.util.*;
public class Splitstr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String sp[]=a.split(" ");
        System.out.println(Arrays.toString(sp));
    }
}