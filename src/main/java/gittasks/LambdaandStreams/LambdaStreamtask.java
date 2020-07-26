package gittasks.LambdaandStreams;

import java.util.*;
import java.util.function.ToIntFunction;
class Average
{
    public List<Integer> list;
Average(List<Integer> list)
{
this.list = list;
}
    public void sum(List<Integer> l,int n)
    {
        int s=l.stream().mapToInt(new ToIntFunction<Integer>() {
			public int applyAsInt(Integer i) {
				return i;
			}
		}).sum();
        System.out.print("Req. result:"+s/n);
    }
}
public class LambdaStreamtask
{
    private static Scanner sc;

	public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>();
        sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in list:");
        int n=sc.nextInt();
        System.out.println("Enter elements:");
        for(int i=1;i<=n;i++)
        {
            int m=sc.nextInt();
            list.add(m);
        }
        Average avg=new Average(list);
        avg.sum(list,n);
    }
}
