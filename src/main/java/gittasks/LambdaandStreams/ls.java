package gittasks.LambdaandStreams;

import java.util.*;
import java.util.stream.IntStream;
class Newlist
{
    public List<String> list;
Newlist(List<String> list)
{
this.list = list;
}
    public List<String> lists(List<String> list,int n)
    {
        List<String> palin=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            String tempString = list.get(i).replaceAll("\\s+", "").toLowerCase();
            if(IntStream.range(0, tempString.length() / 2).noneMatch(j -> tempString.charAt(j) != tempString.charAt(tempString.length() - j - 1))==true)
            {
                palin.add(tempString);
            }
        }
        return palin;
    }
}
public class ls
{
    private static Scanner s;

	public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        s = new Scanner(System.in);
        System.out.println("Enter number of strings:");
        int n=s.nextInt();
        System.out.println("Enter Strings:");
        for(int i=1;i<=n;i++)
        {
            String str=s.next();
            list.add(str);
        }
        Newlist l=new Newlist(list);
        List<String> finall=l.lists(list,n);
        System.out.print(finall);
    }
}