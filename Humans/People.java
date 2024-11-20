package Humans;
public class People {
     private String name;
     private byte age;

     public String getName() {
          return this.name;
     }
     public void setNome(String name) {
          
          if (name != null) {
               this.name = name;
          }
          if (name == null) {
               System.out.println("Campo nome vazio!");
          }
     }

     public byte getage(){
          return this.age;
     }
     public void setage(byte age){
          
          if (age >= 0) {
               this.age = age;
               
          }
          if (age < 0) {
               System.out.println("Campo idade inválido!");
          }
     }
     public void ChatEnd(){
          System.out.println("Seu nome é "+getName()+",e sua idade é "+getage());
      }
 
}
