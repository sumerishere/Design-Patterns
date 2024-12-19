package com.pattern;

public class Main {
	public static void main(String[] args) {
		
		//-------------- with normal class instances -------------//

		LoggerClass logger1 = new LoggerClass();
		LoggerClass logger2 = new LoggerClass();
		LoggerClass logger3 = new LoggerClass();
		

		logger1.logDeposit("303033", 5000.0);
		logger1.logWithdraw("30303", 500.0);
		logger1.logTransfer("sumer", "khushal", 500.0);
		logger2.logWithdraw("333033", 4000);
		logger3.logWithdraw("333033", 4000);

		logger1.logBalance("333033");
		
		//---comparing two singleton intance for equality check.
		System.out.println(logger1); 
		System.out.println(logger2);
		
		//------------- with singleton instances -------------//
		
		SingletonLogger singelton1  = SingletonLogger.getInstance();
		SingletonLogger singelton2  = SingletonLogger.getInstance();
		SingletonLogger singelton3  = SingletonLogger.getInstance();
		
		
		singelton1.logDeposit("303033", 5000.0);
		singelton1.logWithdraw("30303", 500.0);
		singelton1.logTransfer("sumer", "khushal", 500.0);
		singelton2.logWithdraw("333033", 4000);
		singelton3.logWithdraw("333033", 4000);

		singelton1.logBalance("333033");
		
		//---comparing two singleton intance for equality check.
		System.out.println(singelton1); 
		System.out.println(singelton2);
		
		
	}
}
