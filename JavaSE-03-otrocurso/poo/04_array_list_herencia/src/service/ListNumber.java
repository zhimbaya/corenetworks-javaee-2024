package service;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {
		
	public ListNumber() {
		super();
	}

	public Integer first () {
		return size()>0?get(0):null;
	}
	
	public Integer last() {
		return size()>0?get(size()-1):null;
		
	}
	
	public int sum() {
		int suma=0;
		for (Integer num : this) {
			suma+=num;
		}
		return suma;
	}

	@Override
	public boolean add(Integer e) {
		if(!contains(e)) {
		return super.add(e);
		}
		return false;
	}

	@Override
	public void add(int index, Integer element) {
		if(!contains(element)) {
		super.add(index, element);
		}
	}
}
