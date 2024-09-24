public class Dog extends Animal{
    @Override
    public void move()
    {
        System.out.println("run");
    }

    @Override
    public void makeSound()
    {
        System.out.println("bark");
    }

    @Override
    public void eat()
    {
        System.out.println("bone");
    }
}
