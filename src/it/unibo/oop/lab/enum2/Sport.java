/**
 * 
 */
package it.unibo.oop.lab.enum2;

public enum Sport {
	
	BASKET("Basket", 10, Place.INDOOR), VOLLEY("Volley", 12, Place.INDOOR), TENNIS("Tennis", 2, Place.OUTDOOR),
	BIKE("Bike", 1, Place.OUTDOOR), F1("Formula 1", 1, Place.OUTDOOR), MOTOGP("Moto GP", 1, Place.OUTDOOR), SOCCER("Soccer", 11, Place.OUTDOOR);
     
	public final static int INDIVIDUAL = 1; 
	
	private final String name;
	private final int nMembers;
	private final Place place;
	
	/**
	 * 
	 * @param name
	 * 		actual name of the sport 
	 * @param nMembers
	 * 		the number of members each team is composed of (1 for individual sports)
	 * @param place
	 * 		place where sport is practiced 
	 */
	private Sport(final String name, final int nMembers, final Place place) {
		this.name = name;
		this.nMembers = nMembers;
		this.place = place;
	}
	
	/**
	 * 
	 * @return true if is an individual sport
	 */
	public boolean isIndividualSport() {
		return this.nMembers == Sport.INDIVIDUAL;
	}
	
	/**
	 * 
	 * @return true if is an indoor sport
	 */
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	/**
	 * 
	 * @return where the sport is played
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.name + "practiced " + this.place + "in " + this.nMembers + " players";
	}
	
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
}
