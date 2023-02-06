class HumanBody  
{  
public void displayHuman()  
{  
System.out.println("Method defined inside HumanBody class");  
}  
}  
interface Male  
{  
public void show();  
}  
interface Female  
{  
public void show();  
}   
class Child extends HumanBody implements Male, Female  
{  
public void show()  
{  
System.out.println("showing ");  
}    
public void displayChild()  
{  
System.out.println("Child class");  
}  
} 
class js4{
public static void main(String args[])  
{  
Child obj = new Child();  
System.out.println("Hybrid Inheritance in Java");  
obj.show();  
obj.displayChild();  
}  
} 
