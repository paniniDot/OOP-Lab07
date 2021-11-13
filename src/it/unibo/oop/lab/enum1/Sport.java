/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
   
	BASKET("Basketball"), SOCCER("Soccer"), TENNIS("Tennis"), BIKE("Bike"), F1("Formula 1"),
	MOTOGP("Moto GP"), VOLLEY("Volleyball");
	
	/**
	 * Well formatted name of enum
	 */
	private final String actualName;
	
	/**
	 * 
	 * @param name
	 * 		actual name of the sport 
	 */
	private Sport(String name) {
		this.actualName = name;
	}
	
	/**
	 * 
	 * @return actual name of sport
	 */
	@Override
	public String toString() {
		return this.actualName;
	}
	
	
}

