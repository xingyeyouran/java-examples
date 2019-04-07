package com.example23.optional;

public class Computer {
	private Soundcard soundcard;

	public Computer(Soundcard soundcard) {
		this.soundcard = soundcard;
	}

	public Computer() {
	}

	public Soundcard getSoundcard() {
		return soundcard;
	}

	public void setSoundcard(Soundcard soundcard) {
		this.soundcard = soundcard;
	}

}
