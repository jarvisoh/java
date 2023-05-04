import java.util.*;

class member {
    String name = "";
    int age;
    int phonenumber;
    String address;
    double salary;

    public member(String name, int age, int phonenumber, String address, double salary) {
        super();
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
    }

    public void printsalary() {
        System.out.print("The salary is " + salary);
    }
}

class employee extends member {
    String spec = "";
    String dept = "";
     public employee(String name, int age, int phonenumber, String address, double salary,String dept,String spec)
    {
        super(name,age,phonenumber,address,salary);
        this.dept=dept;
        this.spec=spec;
        
    }
    public void print1()
  {
 System.out.println("Name of the person: " + name);
        System.out.println("Age of the person: " + age);
        System.out.println("Phone of the person: " + phonenumber);
        System.out.println("Address of the person: " + address);
           System.out.println("spec of the person: " + spec);
                System.out.println("dept of the person: " + dept);
    }
}

class manager extends member {
    String spec = "";
    String dept = "";
    public manager(String name, int age, int phonenumber, String address, double salary,String dept,String spec)
    {
        super(name,age,phonenumber,address,salary);
        this.dept=dept;
        this.spec=spec;
        
    }
      public void print2()
    {
 System.out.println("Name of the person: " + name);
        System.out.println("Age of the person: " + age);
        System.out.println("Phone of the person: " + phonenumber);
        System.out.println("Address of the person: " + address);
            System.out.println("spec of the person: " + spec);
                System.out.println("dept of the person: " + dept);
        
    }
}

class js1 {
    public static void main(String args[]) {
        // create member object
       member m = new member("jothis", 12, 99213812, "trichy", 9213.0);
        employee e =new employee("jothis", 12, 99213812, "trichy", 9213.0,"emp","computerscience");
        manager me=new manager("jothis", 12, 99213812, "trichy", 9213.0,"manger","It");
       e.print1();
    me.print2();
        
        // print member details and salary
       
        m.printsalary();
    }
}