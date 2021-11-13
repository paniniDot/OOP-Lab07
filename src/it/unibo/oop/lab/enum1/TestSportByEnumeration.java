package it.unibo.oop.lab.enum1;
import it.unibo.oop.lab.socialnetwork.User;
/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

	/**
	 * @param args ignored
	 */
	public static void main(final String... args) {
		SportSocialNetworkUserImpl<User> panini = new SportSocialNetworkUserImpl<>("Mattia", "Panni", "panini", 19);
		SportSocialNetworkUserImpl<User> fiore = new SportSocialNetworkUserImpl<>("Riccardo", "Fiorani", "rickyfiore01",
				20);
		SportSocialNetworkUserImpl<User> palla = new SportSocialNetworkUserImpl<>("Luca", "Perlini", "palla_swag");
		SportSocialNetworkUserImpl<User> morbi = new SportSocialNetworkUserImpl<>("Luca", "Morbidelli",
				"jeans_stretti_joint_pieni");
		
		panini.addSport(Sport.VOLLEY);
		
		System.out.println("Panini hates doing sport (except having sex and " + Sport.VOLLEY + "): " 
				+ panini.hasSport(Sport.VOLLEY));

		fiore.addSport(Sport.F1);
		fiore.addSport(Sport.BIKE);
		fiore.addSport(Sport.MOTOGP);

		System.out.println("Fiore won an e-sport competition of " + Sport.F1 + ": " + fiore.hasSport(Sport.F1));
		System.out.println("Fiore has been involeved in plenty of car crashes while doing " + Sport.BIKE + ": "
				+ fiore.hasSport(Sport.BIKE));
		System.out.println("Fiore found a job in a " + Sport.MOTOGP + " circuit: " + fiore.hasSport(Sport.MOTOGP));

		palla.addSport(Sport.BIKE);
		palla.addSport(Sport.VOLLEY);

		System.out
				.println("Palla said a lot of bad words while doing " + Sport.BIKE + ": " + palla.hasSport(Sport.BIKE));
		System.out.println("Palla said even more bad words while doing " + Sport.VOLLEY + " then when he was biking: "
				+ palla.hasSport(Sport.BIKE));

		morbi.addSport(Sport.VOLLEY);
		morbi.addSport(Sport.SOCCER);

		System.out.println("Morbi is the queer of " + Sport.VOLLEY + ": " + morbi.hasSport(Sport.VOLLEY));
		System.out.println(
				"Morbi isn't as good as he thinks playing " + Sport.VOLLEY + ": " + morbi.hasSport(Sport.VOLLEY));
	}
}
