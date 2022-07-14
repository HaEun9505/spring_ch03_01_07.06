package com.haeun.test;

public class MainClass {

   public static void main(String[] args) {
      

      MyCalculator myCal = new MyCalculator();
      
      myCal.setNum1(20);	//초기화
      myCal.setNum2(10);
      
/*
      Calculator cal1 = new Calculator(); 
      myCal.setCal(cal1); //myCal객체.함수(cal객체)
*/      
      myCal.setCal(new Calculator());
      
      
      myCal.add();
      myCal.sub();
      myCal.mul();
      myCal.div();
      
   }

}
