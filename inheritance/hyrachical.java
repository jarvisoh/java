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


class tiger extends animal{
    void tg()
    {
        System.out.println("naa tiger");
    }

}

class js3{
    public static void main(String[] args){
        tiger t=new tiger();
        cat c=new cat();
        dog d=new dog();
        c.meow();
        c.eat();
        c.eat();
        d.bark();
        t.tg();

    }
}