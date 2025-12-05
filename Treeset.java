package com.Linkedlist;

import java.util.Arrays;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<>();
		t.add(10);
		t.add(40);
		t.add(20);
		t.add(80);
		t.add(30);
		t.add(50);
		System.out.println(t);
		System.out.println(t.addAll(Arrays.asList(10,30,40)));
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(t.ceiling(32));
		System.out.println(t.subSet(20,70));
		System.out.println(t.lower(80));
		System.out.println(t.higher(60));
		System.out.println(t.pollFirst());
		System.out.println(t.pollLast());
		
		
		
		

	}

}
