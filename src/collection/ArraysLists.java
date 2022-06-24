package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraysLists {

	public static void main(String[] args) {


		
     List list=new ArrayList();

     for (int i = 0; i < 100; i++) {
		list.add(i);
		list.add("nagnath");
	}
     System.out.println(list);
	}

}
