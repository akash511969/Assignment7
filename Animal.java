package assignment6;
public abstract class Animal {
	String color, breed , name;
	public void speak()
	{
		System.out.println("Animals produce sounds");
	};
	public abstract void eat();
}
class dog1 extends Animal
{
   public void eat()
   {
	System.out.println("Dogs eat Bones");
   }
   public static void main(String args[])
   {
	Animal obj = new dog1();
	obj.eat();
	obj.speak();
   }
}
