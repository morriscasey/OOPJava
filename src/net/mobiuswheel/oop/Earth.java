package net.mobiuswheel.oop;

public class Earth
{
	public static void main(String args[])
	{
		Human tom;
		tom = new Human("Tom", 24, 76, "brown");
		
		tom.speak();
		
		Human joe = new Human("Joe", 12, 76, "green");
		
		joe.speak();
		
		Bird bird1 = new Bird();
		bird1.fly();
	}
}
