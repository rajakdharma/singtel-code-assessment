package com.singtel.animalsactivitys.classes;

import com.singtel.animalsactivitys.classes.Animal;
import com.singtel.animalsactivitys.classes.Bird;
import com.singtel.animalsactivitys.classes.Flying;
import com.singtel.animalsactivitys.classes.Parrot;
import com.singtel.animalsactivitys.classes.Singing;
import com.singtel.animalsactivitys.classes.Sounded;
import com.singtel.animalsactivitys.classes.Swimming;
import com.singtel.animalsactivitys.classes.Walk;

public class Bird extends Animal implements Walk, Flying{

	void eat() { System.out.println("im eating"); }
}	

interface Flying {
	default String fly() {
		return "I can Fly";
	} 
}
interface Swimming{
	default String swim() {
		return "I can Swim";
	}
}
interface Singing{
	default String sing() {
		return "I can Sing";
	}
}
interface Sounded{
	default String sound() {
		return "I can make sound";
				}
}
interface Walk{
	default String walk() {
		return "I can walk";
	};
}

class Duck extends Animal implements Swimming,Sounded{}
class Chicken extends Animal implements Sounded, Walk{}
class Rooster extends Parrot implements Sounded{};
class Parrot extends Bird implements Sounded, Singing{}
class Fish extends Animal implements Swimming{}
class Shark extends Animal implements Swimming{}
class Clownfish extends Animal implements Swimming {}
class Dolhphin extends Animal implements Swimming {}
class Dog extends Animal implements Walk, Sounded, Swimming {}
class Cat extends Animal implements Walk, Sounded {} 
class Butterfly extends Bird implements Flying {}
class Caterpillar extends Bird implements Walk {}

