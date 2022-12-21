class Person{
       private float height;
       private float weight;
       private int age;
       private String name;
       public void setHeight(float height){
            this.height = height;
       }
       public void setWeight(float weight){
            this.weight = weight;
       }
       public void setName(String name){
            this.name = name;
       }
       public void setAge(int age){
            this.age = age;
       }
       public float getHeight(){
            return height;
       }
       public float getWeight(){
            return weight;
       }
       public int getAge(){
            return age;
       }
       public String getName(){
            return name;
       }
}
class Rahul extends Person{
      String Gender;
            public void display(){
                   System.out.println("Name : "+getName());
                   System.out.println("Age  : "+getAge());
                   System.out.println("Height : "+getHeight());
                   System.out.println("Weight : "+getWeight());
                   System.out.println("Gender : "+Gender);
          }
}
class MainPersonClass{
       public static void main(String[]args){
              Rahul r1 = new Rahul();
              r1.setName("Rahul Sharma");
              r1.setAge(40);
              r1.setHeight(5.8f);
              r1.setWeight(80.0f);
              r1.Gender = "Male";
              r1.display();
       }
}


