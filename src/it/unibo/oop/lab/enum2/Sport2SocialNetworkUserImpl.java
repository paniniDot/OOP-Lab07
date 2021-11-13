/**
 * 
 */
package it.unibo.oop.lab.enum2;

import java.util.Set;
import java.util.HashSet;

import it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * 
 * @param <U>
 *            specific {@link User} type
 */
public class Sport2SocialNetworkUserImpl<U extends User> extends SocialNetworkUserImpl<U> {

    private final Set<Sport> sports;

    /**
     * Builds a new {@link Sport2SocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public Sport2SocialNetworkUserImpl(final String name, final String surname, final String user) {
        this(name, surname, user, -1);
    }

    /**
     * Builds a new {@link Sport2SocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public Sport2SocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.sports = new HashSet<>();
    }

    /**
     * Add a new sport followed by this user: if the user already likes or does
     * the sport, nothing happens.
     * 
     * @param sport
     *            a sport followed/done by the user
     */
    public void addSport(final Sport sport) {
    	this.sports.add(sport);
    }

    /**
     * Returns true if a user likes/does a given sport.
     * 
     * @param s
     *            sport to check
     * 
     * @return true if user likes sport s
     */
    public boolean likesSport(final Sport s) {
        return this.sports.contains(s);
    }
    
    /**
     * Returns the set of individual sports followed/practiced by this user: a
     * sport is individual if the number of team member is = 1.
     * 
     * @return the set of individual sport this user practices/follows
     */
    	public Set<Sport> getIndividualSports() {
    		Set<Sport> individualSports = new HashSet<>();
    		for (Sport sp : this.sports) {
    			if (sp.isIndividualSport()) {
    				individualSports.add(sp);
    			}
    		}
    		return individualSports;
    	}
    
    /** 
     * Returns the set of sports which are practiced in a given place.
     * 
     * @param p the place in which the sport is practiced in order to be
     * included in the resulting set
     * 
     * @return the set of sport practiced in a given place
     */
    public Set<Sport> getSportPracticedInPlace(Place p) {
    	Set<Sport> sportsPracticedInPlace = new HashSet<>();
		for (Sport sp : this.sports) {
			if (isPracticedInPlace(sp, p)) {
				sportsPracticedInPlace.add(sp);
			}
		}
		return sportsPracticedInPlace;
    }
    
    private boolean isPracticedInPlace(Sport s, Place p) {
    	return s.getPlace() == p;
    }
}
