abstract class Car{
        int regNo;
        Car(int regNo){
               this.regNo = regNo;
         }
         public void filltank(){
              System.out.println("Open the tank using key");
              System.out.println("Fill the tank");  
              System.out.println("Close the tank with key");
         }
          public abstract void brake();
}
class Maruti extends Car{
          Maruti(int regNo){
               super(regNo);
          }
           public void brake(){
                  System.out.println("It is hydraulic brake");
           }
}
class Santro extends Car{
          Santro(int regNo){
                super(regNo);
           }
           public void brake(){
                  System.out.println("It is gas brake");
           }
}
class MainCar{
         public static void main(String[]args){
              Car c;
              Maruti m1 = new Maruti(8368);
              Santro s1 = new Santro(9911);
              c = m1;
              System.out.println("Maruti Reg No : "+c.regNo);
              c.filltank();
              c.brake();
              c = s1;
              System.out.println("Santro Reg No : "+c.regNo);
              c.filltank();
              c.brake();
         }
}
  