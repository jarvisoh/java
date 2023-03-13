class area
{
     int area;
    void eat(){

    
    System.out.println(area);
}
}

class rectangle extends area{
    void rect(int l,int b)
    {
     area=l*b;   
    }
}
class square extends area{
    void square(int l)
    {
     area=l*l;   
    }
}
class 
class js1{
   
    public static void main(String[] args)
    {
       square d =new square();
       rectangle r=new rectangle();
        r.rect(5,8);
        r.eat();
        d.square(5);
        d.eat();
    }
}