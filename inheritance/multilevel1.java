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
class cat extends dog{
    void meow()
    {
        System.out.println("meoving");
    }
}
class sdr{
    public static void main(String[] args){
        cat c=new cat();
        c.meow();
        c.eat();
        c.bark();
    }
}