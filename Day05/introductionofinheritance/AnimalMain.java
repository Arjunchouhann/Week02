//Creating Parent class Animal
class Animal{
	//Attributes of animals which is inherited by its child classes
    private String name;
      private int age;
	
	//getter
    public String getName() {
        return name;
    }
	
	//Setter
    public void setName(String name) {
        this.name = name;
    }

	//Getter
    public int getAge() {
        return age;
    }

	//Setter
    public void setAge(int age) {
        this.age = age;
    }

	//Method makeSound to print Animal sound
    public void makeSound(){
        System.out.println("Animal Default sound");
    }
}

//Child class Dog 
class Dog extends Animal{
	//Override Method makeSound to print Dog sound
    @Override
    public void makeSound() {
        System.out.println("Bhau Bhau");
    }
}

//Child class Cat 
class Cat extends Animal{
	//Override Method makeSound to print Cat sound
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

//Child class Bird
class Bird extends Animal{
	//Override Method makeSound to print Bird sound
    @Override
    public void makeSound() {
        System.out.println("Chi chi chi");
    }
}

//Main Driver class
class AnimalMain{
	//main method
    public static void main(String[] args) {
		//Creating objects of Animal, Dog, Cat and Bird class
		Animal animal = new Animal();
        Dog puppy = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

		//using animal object to call setters and getter.
        animal.setName("Cow");
        animal.setAge(12);
        animal.getName();
		
		//using puppy object to call setters and getter.
        puppy.setName("Tommy");
        puppy.setAge(5);
        puppy.getName();

        //using cat object to call setters and getter.
		cat.setName("Mi-Chan");
        cat.setAge(2);
        cat.getName();

        //using bird object to call setters and getter.
		bird.setName("Fenny");
        bird.setAge(1);
        bird.getName();

        //Printing Results

		System.out.println("Animal name :"+animal.getName());
        System.out.println("Animal age : "+animal.getAge());
        System.out.println("Animal Sound : ");
        animal.makeSound();

        System.out.println("\nDog name : "+puppy.getName());
        System.out.println("Dog age : "+puppy.getAge());
        System.out.println("Dog Sound : ");
        puppy.makeSound();

        System.out.println("\nCat name : "+cat.getName());
        System.out.println("Cat age : "+cat.getAge());
        System.out.println("Cat Sound : ");
        cat.makeSound();

        System.out.println("\nBird name : "+bird.getName());
        System.out.println("Bird age : "+bird.getAge());
        System.out.println("Bird Sound : ");
        bird.makeSound();
    }
}