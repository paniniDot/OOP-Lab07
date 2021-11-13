package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	private final List<T> inputList;
	private final List<T> myList;
	
	public OneListAcceptable(List<T> list) {
		this.inputList = list;
		this.myList = new ArrayList<>();
	}

	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {

			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if (inputList.contains(newElement)) {
					myList.add(newElement);
				} else {
					throw new ElementNotAcceptedException(newElement);
				}
			}

			@Override
			public void end() throws EndNotAcceptedException {
				if(inputList.size() > myList.size()) {
					throw new EndNotAcceptedException();
				}
			}
			
		};
	}

}
