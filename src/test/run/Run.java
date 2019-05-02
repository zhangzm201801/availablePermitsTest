package test.run;

import myservice.MyService1;
import myservice.MyService2;

public class Run {

	public static void main(String[] args) {
		MyService1 service1 = new MyService1();
		service1.testMethod();
		
		MyService2 service2 = new MyService2();
		service2.testMethod();

	}

}
