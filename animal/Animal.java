package animal;

public abstract class Animal {
    public String name;
    public String color;

    //constructor to initialize name and color 
    public Animal(String name,String color){
        this.name = name;
        this.color = color;
    }
    //abstract method without implementation
    public abstract void makesound();

    //Display name and color
    public void display(){
        System.out.printf("Tha animal name is :%s\n The Animal color is: %s\n",name,color);
    }
}
