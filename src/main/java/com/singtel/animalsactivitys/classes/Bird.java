package com.singtel.animalsactivitys.classes;

import com.singtel.animalsactivitys.classes.Animal;
import com.singtel.animalsactivitys.classes.Bird;
import com.singtel.animalsactivitys.classes.Flying;
import com.singtel.animalsactivitys.classes.Parrot;
import com.singtel.animalsactivitys.classes.Singing;
import com.singtel.animalsactivitys.classes.Sounded;
import com.singtel.animalsactivitys.classes.Swimming;
import com.singtel.animalsactivitys.classes.Walk;

public class Bird extends Animal implements Walk, Singing{

	void eat() { System.out.println("im eating"); }
}	

//created interface for whoever has flying behavior
interface Flying {
	default String fly() {
		return "I can Fly";
	} 
}
//created interface for whoever has swimming behavior
interface Swimming{
	default String swim() {
		return "I can Swim";
	}
}
//created interface for whoever has singing behavior
interface Singing{
	default String sing() {
		return "I can Sing";
	}
}
//created interface for whoever making Sounds behavior
interface Sounded{
	default String sound() {
		return "I can make sound";
				}
}
//created interface for whoever has walking behavior
interface Walk{
	default String walk() {
		return "I can walk";
	};
}

class Duck extends Bird implements Swimming,Sounded{}
class Chicken extends Bird implements Sounded, Walk{}
class Rooster extends Parrot implements Sounded{};
class Parrot extends Bird implements Sounded, Singing{}
class Fish extends Animal implements Swimming{}
class Shark extends Fish implements Swimming{}
class Clownfish extends Fish implements Swimming {}
class Dolhphin extends Animal implements Swimming {}
class Dog extends Parrot implements Walk, Sounded, Swimming {}
class Cat extends Parrot implements Walk, Sounded {} 
class Butterfly extends Bird implements Flying {}
class Caterpillar extends Bird implements Walk {}

