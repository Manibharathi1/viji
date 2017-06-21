import java.io*;
import java.util.*;
import java.util.Arrays;
public class prod
{
public static void main(String args[])
{
  int product=1;
int a[]=new int[args.length];
for(int i=0;i<args.length;i++)
{
a[i]=Integer.parseInt(args[i]);
}
for(int j=0;j<args.length;j++)
{
for(int k=0;k<args.length;k++)
{
if(j!=k)
{
product=product*a[k];
}
}
System.out.println(product);
  product=1;
}
}
}
