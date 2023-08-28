package testproject;
/*
 변수란 메모리(Ram)에 값을 기록하기 위한 공간
 변수의 선언 : 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것
 변수선언방법:  
           1) 자료형 변수형;
           2) 자료형 변수명 = 값; 
 변수를 선언할 때 하나의 변수명은 하나의 자료형만 가능하다.
 변수명은 재사용 가능하다. 
         
 int = 정수를 나타냄;
 String = 문자를 나타냄;            
  */
public class Variable {
	public static void main(String[] args) { 
         int age = 25;
         System.out.println("나이 : " +age);
         int year = 2023;
         System.out.print(year+"년");
         int month = 8;
         int day = 28;
         System.out.println(month+"월"+day+"일");
         
         String date = "월";
         System.out.println(month+date+day+"일");
         
         String name = "원정연";
         int mth = 4;
         int dy = 17;
         System.out.println(name+mth+dy);
         
	
// 자신의 이름과 월 일을 담은 변수를 만들자
// 자료형 변수명;
	int number1;
	number1 = 100;
	System.out.println("number1 : " +number1);
	number1 = 200;//변수명은 재사용 가능하다.
	System.out.println("number1(재사용) : " +number1);
// 자료형 변수명 = 변수값;
	int number2;
	number2 = 300;
	System.out.println("number2 : " +number2);
	
	String name1 = "java";
	System.out.println("name1 :" +name1);
}
}