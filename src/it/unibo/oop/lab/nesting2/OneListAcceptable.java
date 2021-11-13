package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable<T> implements Acceptable<T> {
	
	/**
	 *  list to be accepted
	 */
	private final List<T> inputList;
	
	/**
	 *  internal list
	 */
	private final List<T> myList;
	
	/**
	 * 
	 * @param list
	 * 		list to be iterated
	 */
	public OneListAcceptable(List<T> list) {
		this.inputList = list;
		this.myList = new ArrayList<>();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public Acceptor<T> acceptor() {
		return new Acceptor<T>() {

			/**
			 * {@inheritDoc}
			 */
			@Override
			public void accept(T newElement) throws ElementNotAcceptedException {
				if (inputList.contains(newElement)) {
					myList.add(newElement);
				} else {
					throw new ElementNotAcceptedException(newElement);
				}
			}
			
			/**
			 * {@inheritDoc}
			 */
			@Override
			public void end() throws EndNotAcceptedException {
				if(inputList.size() > myList.size()) {
					throw new EndNotAcceptedException();
				}
			}
			
		};
	}

}
