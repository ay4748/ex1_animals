public class Cat extends Animal{
    @Override
    public void move()
    {
        System.out.println("crawl");
    }

    @Override
    public void makeSound()
    {
        System.out.println("meow");
    }

    @Override
    public void eat()
    {
        System.out.println("fish");
    }
}
