import java.util.*; 

class rectangle
{
    
    void display(int height,int width){

    
    System.out.println(height+ " " +width);
}
}

class RectangleArea extends rectangle{

     void display(int height,int width){

    
    System.out.println(height*width);
}
}

class js1{
    public static void main(String[] args)
    {
       RectangleArea r=new RectangleArea();
    rectangle rc=new rectangle();

       Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int height=sc.nextInt(); 
int width=sc.nextInt();

rc.display(height,width);
r.display(height,width);
  

     
    }
}