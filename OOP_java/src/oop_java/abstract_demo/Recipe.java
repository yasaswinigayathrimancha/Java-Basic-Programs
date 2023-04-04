package oop_java.abstract_demo;

class Recipe extends AbstractRecipe {

	void ready() {
		System.out.println("Cut all vegetables");
	}

	void cook() {
		System.out.println("Cook with all ingredients");

	}

	void clean() {
		System.out.println("Clean the things");

	}
}
