/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExerciseFour;

abstract class Mark{
    abstract void getPercentage();
}
class A extends Mark{
    double percentage=0, mark1, mark2, mark3;

        A(double m1, double m2, double m3){
            this.mark1=m1;
            this.mark2=m2;
            this.mark3=m3;
}

    @Override
    void getPercentage(){
	percentage = (mark1+mark2+mark3)/300*100;
	
	System.out.println("Percentage class A: "+percentage+"%");
}
}
class B extends Mark{

    double percentage=0, mark1, mark2, mark3, mark4;

        B(double m1, double m2, double m3, double m4){
            this.mark1=m1;
            this.mark2=m2;
            this.mark3=m3;
            this.mark4=m4;
}

    @Override
    void getPercentage(){
	percentage = (mark1+mark2+mark3+mark4)/400*100;
	
	System.out.println("Percentage class B: "+percentage+"%");
}
}
public class Number3 {
    public static void main(String[] args) {
	
	A a = new A(90,70,80);
	B b = new B(90,70,80,60);
	
	a.getPercentage();
	b.getPercentage();
}
}