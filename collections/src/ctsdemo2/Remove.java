package ctsdemo2;

import java.util.ArrayList;

public class Remove 
{

	public static void main(String[] args)
	{
		ArrayList<String> list1=new ArrayList<>();
		list1.add("Tejamajji");
		list1.add("chaitanya");
		list1.remove("Tejamajji");
		list1.add("ganesh");
		list1.add("murali");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("haritha");
		list2.addAll(list2);
		System.out.println(list1);
	}
}
