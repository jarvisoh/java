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
class cat extends animal{
    void meow()
    {
        System.out.println("meoving");
    }
}
class js{
    public static void main(String[] args){
        cat c=new cat();
        c.meow();
        c.eat();
    }
}