import java.util.*; 
class rectangle
{
    void display(int height,int width){

    
    System.out.println(height*width);
}
}

class RectangleArea extends rectangle{
    void read_input() 
    {
       Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
int height=sc.nextInt(); 
int width=sc.nextInt();
display(height,width);

    }
}

class js1{
    public static void main(String[] args)
    {
       RectangleArea r=new RectangleArea();
       r.read_input();
     
    }
}