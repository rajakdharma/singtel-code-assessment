package com.singtel.animalsactivitys.classes;

import com.singtel.animalsactivitys.classes.Animal;
import com.singtel.animalsactivitys.classes.Bird;
import com.singtel.animalsactivitys.classes.Butterfly;
import com.singtel.animalsactivitys.classes.Cat;
import com.singtel.animalsactivitys.classes.Chicken;
import com.singtel.animalsactivitys.classes.Clownfish;
import com.singtel.animalsactivitys.classes.Dog;
import com.singtel.animalsactivitys.classes.Dolhphin;
import com.singtel.animalsactivitys.classes.Duck;
import com.singtel.animalsactivitys.classes.Fish;
import com.singtel.animalsactivitys.classes.Flying;
import com.singtel.animalsactivitys.classes.Parrot;
import com.singtel.animalsactivitys.classes.Rooster;
import com.singtel.animalsactivitys.classes.Shark;
import com.singtel.animalsactivitys.classes.Singing;
import com.singtel.animalsactivitys.classes.Sounded;
import com.singtel.animalsactivitys.classes.Swimming;
import com.singtel.animalsactivitys.classes.Walk;

public class AnimalActions {
	public static boolean fly(Animal animal) {
        // Check if this animal implements the Flying interface
		if(animal instanceof Flying) { return true; } else { return false;}
    }
	public static boolean swim(Animal animal) {
        // Check if this animal implements the Swimming interface
        if(animal instanceof Swimming) { return true;} else { return false;}
    }
	public static boolean walk(Animal animal) {
        // Check if this animal implements the Walk interface
		if(animal instanceof Walk) { return true;} else { return false;}
    }
	public static boolean sing(Animal animal) {
        // Check if this animal implements the Singing interface
		if(animal instanceof Singing) { return true;} else { return false;}
    }
	public static boolean sound(Animal animal) {
        // Check if this animal implements the Singing interface
		if(animal instanceof Sounded) { return true;} else { return false;}
    }
	public static void main(String args[]) {
		
		
		
		int flyingCount=0;
		int walkingCount=0;
		int swimmingCount = 0;
		int singingCount = 0;
		int soundedCount = 0;
		Animal[] animals = new Animal[] {
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dog(),
				new Dolhphin(),
				new Butterfly(),
				new Cat()				
		};
		
		//calling for Duck and Chicken behavior 
		if(sound((new Duck()))) {
			System.out.println("Duck says Quack, quack");
		}
		if(swim((new Duck()))) {
			System.out.println("Duck can swim");
		}
		if(sound((new Chicken()))) {
			System.out.println("Chicken says Cluck, cluck");
		}
		if(!fly((new Chicken()))) {
			System.out.println("Chicken can not fly");
		}
		
		//calling for fish behavior
		if(swim((new Fish()))) {
			System.out.println("Duck can swim");
		}
		if(!sing((new Fish()))) {
			System.out.println("Fish Don't sing");
		}
		if(!walk((new Fish()))) {
			System.out.println("Fish Don't walk");
		}
		
		//Calling Butterfly and caterpillar behaviour
		if(fly((new Butterfly()))) {
			System.out.println("Butterfly can fly");
		}
		if(!sound((new Butterfly()))) {
			System.out.println("Butterfly don't make sound");
		}
		
		if(!fly((new Caterpillar()))) {
			System.out.println("caterpillar can not fly");
		}
		if(walk((new Caterpillar()))) {
			System.out.println("caterpillar can walk");
		}
		
		for(Animal animal : animals) {
			if(fly(animal)){
				flyingCount ++;
			}
			if(swim(animal)){
				swimmingCount ++;
			}
			if(walk(animal)){
				walkingCount ++;
			}
			if(sing(animal)){
				singingCount ++;
			}
			if(sound(animal)) {
				soundedCount ++;
			}
			System.out.println(animal.getClass()+": can " + ((fly(animal)) ? " fly " : " ") + ((swim(animal)) ? " swim " : "") + ((walk(animal)) ? " walk " : "") + ((sound(animal)) ? " sound " : ""));
			
		}
		System.out.println("Flying Animals : " + flyingCount);
		System.out.println("Swimming Animals : " + swimmingCount);
		System.out.println("Walking Animals : " + walkingCount);
		System.out.println("Singing Animals :" + singingCount);
		System.out.println("Sounded Animals : " + soundedCount);
		
	}
}
