class animal
{
    void eat(){
int a=5;
    
    System.out.println("eating...");
}
}

class dog extends animal{
    void bark()
    {
        System.out.println("barking.."+a);
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