/*
 * Written by: Graham Ó Síocháin
 * 
 * Date: 10/01/16
 * 
 * Purpose: Java program to to model a television set
*/

public class Television {

	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on_off = false;

	final int maxChannel = 120;
	final int minChannel = 1;

	// constructor
	public Television(int channel, int volumeLevel, boolean on_off) {
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on_off = on_off;
	}

	// getters & setters
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (getOn_off() && channel >= minChannel && channel <= maxChannel) {
			this.channel = channel;
		} else {
			System.out.println("unknown channel");
			this.channel = 1;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (getOn_off() && volumeLevel >= 1 && volumeLevel <= 7) {
			this.volumeLevel = volumeLevel;
		} else {
			System.out.println("Unknown volume");
			this.volumeLevel = 1;
		}
	}

	public boolean getOn_off() {
		return on_off;
	}

	public void setOn_off(boolean on_off) {
		if (getOn_off()) {
			this.on_off = on_off;
		} /*else {
			this.on_off = false;
		}*/
		
		if (!getOn_off()) {
			this.on_off = false;
		}
	}

	// methods
	public void channelUp() {
		if (getOn_off() && channel < 120) {
			System.out.println("Going up one channel.");
			channel++;
			System.out.println("Channel: " + channel);
		} else {
			System.out.println("Max channel");
			this.channel = 120;
		}
	}

	public void channelDown() {
		if (getOn_off() && channel > 1) {
			System.out.println("Going down one channel.");
			channel--;
			System.out.println("Channel: " + channel);
		} else {
			System.out.println("Min channel");
			this.channel = 1;
		}
	}

	public void volumeUp() {
		if (getOn_off() && volumeLevel < 7) {
			System.out.println("Volume up.");
			volumeLevel++;
			System.out.println("Volume: " + volumeLevel);
		} else {
			System.out.println("Maximum volume");
			this.volumeLevel = 7;
		}
	}

	public void volumeDown() {
		if (getOn_off() && volumeLevel > 1) {
			System.out.println("Volume down.");
			volumeLevel--;
			System.out.println("Volume: " + volumeLevel);
		} else {
			System.out.println("Minimum volume");
			this.volumeLevel = 1;
		}
	}

	public String toString() {
		return "Channel: " + channel + ", VolumeLevel = " + volumeLevel
				+ ", on = " + on_off;
	}

}
