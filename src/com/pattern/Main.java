package com.pattern;

public class Main {
	public static void main(String[] args) {
		
		LoggerClass logger1 = new LoggerClass();

		LoggerClass logger2 = new LoggerClass();

		LoggerClass logger3 = new LoggerClass();
		
//		LoggerClass logger4 = new LoggerClass();


		logger1.logDeposit("303033", 5000.0);
		logger1.logWithdraw("30303", 500.0);
		logger1.logTransfer("sumer", "khushal", 500.0);
//		logger2.logWithdraw("333033", 4000);
		logger1.logWithdraw("333033", 4000);

		logger1.logBalance("333033");
	}
}
