package animal;

//Dog class extends animal and implements pet 
class Dog  extends Animal implements Pet{

    //Implementation of Abstract method
    // Pet interface method
    @Override
    public void play(){
        System.out.println("The Dog is playing");
    }
    //Animal class method
    @Override
    public void makesound(){
        System.out.println("Bark Bark");
    }
   
    //Constructor to initalize Animal name and color 
    public Dog(String name,String color){
        super(name,color);
    }

}

