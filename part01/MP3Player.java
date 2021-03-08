package part01;

import java.util.ArrayList;

public class MP3Player implements iPlayer {
	public ArrayList<Tune> soundData;

	public MP3Player() {
		// add constructor code
	}

	public boolean addTune(String title, String artist, int duration, Genre gen) {
		// complete with your implementation
		return true;
	}

	public String[] getTuneInfo() {
		return null;
		// add your implementation
	}

	public String[] getTuneInfo(Genre gen) {
		return null;
		// add your implementation
	}

	public String[] getTuneInfo(String artist) {
		return null;
		// add your implementation
	}
	
	public String play(int tuneId) {
		return "Any string";
		// complete this implementation
	}
}
