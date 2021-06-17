package com.revature;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SearchUtil implements Comparator<Animal>
{
	public static Animal search(String name, List<Animal> animalList)
	{
		Animal rv = new Animal();
		rv = null;
		Iterator<Animal> iter = animalList.iterator();
		
		while(iter.hasNext()) {
			Animal temp = iter.next();
			if(temp.getName().equals(name))
			{
				rv = temp;
			}
		}
		
		if(rv == null)
		{
			System.out.println("Animal not found- Error 404");
		}
		
		
		return rv;
	}

	@Override
	public int compare(Animal o1, Animal o2) {
		return o1.compareTo(o2);
	}
}
