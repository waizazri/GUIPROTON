/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseFour;

abstract class Parents{
    abstract void Message();
    void printMethod(){
        System.out.println("Message");
    }
}
class sub1 extends Parents{
   @Override
   void Message(){
       System.out.println("This is first subclass");
   }
    
}
class sub2 extends Parents{
   void Message(){
       System.out.println("This is second subclass");
   }
    
}
public class Number1 {
    public static void main(String []args){
        sub1 a=new sub1();
        sub2 b=new sub2();
        a.Message();
        b.Message();
    }
}