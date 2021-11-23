package com.designpatterns.behavioral.iterator;

public class NameRepository implements Container<String> {

	private String[] names = {"John","Ali","Miguel","Hernan"};
	
	@Override
	public Iterator<String> getIterator() {
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator<String>  {

		int index = 0;
		
		@Override
		public boolean hasNext() {
			if(index<names.length)
				return true;
			return false;
		}

		@Override
		public String getNext() {
			if(index<names.length) {
				String name = names[index];
				index++;
				return name;
			}
			return null;
		}
		
	}

}
