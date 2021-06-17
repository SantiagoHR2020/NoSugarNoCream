package com.revature;

public class Animal implements Comparable<Animal>
{
	private int speed;
	private String name;
	
	public Animal()
	{
		this.speed = 0;
		this.name = null;
	}
	
	public Animal(int speed, String name)
	{
		this.speed = speed;
		this.name = name;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Animal o)
	{
		return this.speed - o.speed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + speed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [speed=" + speed + ", name=" + name + "]";
	}
	
	
	
}
