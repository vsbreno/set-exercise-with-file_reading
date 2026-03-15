package model.entities;

import java.time.Instant;

public class User implements Comparable<User>{

	private String name;
	private Instant log;
	
	public User(String name, Instant log) {
		this.name = name;
		this.log = log;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Instant getLog() {
		return log;
	}

	public void setLog(Instant log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return name +
				" " + 
				log;
	}

	@Override
	public int compareTo(User other) {
		return getName().toUpperCase().compareTo(other.getName().toUpperCase());
	}
	
	
}
