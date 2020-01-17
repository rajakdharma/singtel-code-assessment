package com.singtel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.singtel.animalsactivitys.classes.Animal;
import com.singtel.animalsactivitys.classes.AnimalActions;
import com.singtel.animalsactivitys.classes.Bird;

@SpringBootTest
class AnimalActivitiesApplicationTests {

	@Test
	void test() {
		assertTrue((AnimalActions.fly(new Bird())), "Birds can fly");
		assertTrue((AnimalActions.sing(new Bird())), "Birds can sing");
		assertTrue((AnimalActions.walk(new Bird())), "Birds can walk");
	}

}
