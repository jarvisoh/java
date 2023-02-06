class animal
{
    void eat(){

    
    System.out.println("eating...");
}
}

class dog extends animal{
    void bark()
    {
        System.out.println("barking..");
    }
}

class js1{
    public static void main(String[] args)
    {
        dog d =new dog();
        d.bark();
        d.eat();
    }
}