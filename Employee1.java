class Employee
{
   int id;
    String name;
    float salary;
  
    Employee(int id,String name,float salary)
    {
       this.id=id;
       this.name=name;
       this.salary=salary;
     }
     Employee(){
     }
       public void display()
      {
        System.out.println("Employee Id:"+id);
        System.out.println("Employee name:"+name); 
        System.out.println("Employee Salary:"+salary);
       }
      }
          class Employee1
          {
              public static void main(String[]args)
              {
                 Employee emp = new Employee(10,"anupriya",40000);
                 Employee emp1 = new Employee(20,"priyanshu",30000);
                 Employee emp2 = new Employee(30,"shivkumar",20000);
                  emp.display();
                  emp1.display();
                  emp2.display();
         }
} 
