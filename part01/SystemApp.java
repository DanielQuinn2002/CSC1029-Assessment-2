package part01;

public class SystemApp {

	static MP3Player myPlayer = new MP3Player();
	
	
	public static void main(String[] args) {
		
		addSomeTunes();
		// needs a Menu & supporting code
	}

	/**
	 * A 'freebie' - just to get you started
	 */
	private static void addSomeTunes() {
		myPlayer.addTune("One", "U2", 380, Genre.ROCK);
		myPlayer.addTune("Four Seasons - Winter", "Vivaldi", 5500, Genre.CLASSICAL);
		myPlayer.addTune("The Chain", "Fleetwood Mac", 750, Genre.ROCK);
		myPlayer.addTune("Graceland", "Paul Simon", 350, Genre.POP);
		myPlayer.addTune("Help", "The Beatles", 300, Genre.POP);
	}
	
	
}
