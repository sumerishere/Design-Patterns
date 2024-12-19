package com.pattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

//-- design type : creational pattern
public class SingletonLogger {
	
	private final String fileName = "Singleton_Log.txt";
	private PrintWriter printWriter;
	private double balance = 0.00;
	
	private static SingletonLogger singletonlogger = null;
	
	private SingletonLogger() {
		
		try {
			
			FileWriter fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter, true);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public static SingletonLogger getInstance() {
		
		if(singletonlogger == null) {
			singletonlogger =  new SingletonLogger();
		}
		return singletonlogger;
	}
	
	
	public void logWithdraw(String accountNumber, double amount) {
		
		if(balance > 0) {
			balance = balance - amount;
			printWriter.println("Amount withdraw ( "+ accountNumber +" ): "+amount);
		}else {
			printWriter.println("Insufficient!! Balance to withdraw amount.");
		}

	}
	
	public void logDeposit(String accountNumber, double amount) {
		balance = balance+amount;
		printWriter.println("Deposit Amount ( "+accountNumber+" ): "+ amount );
	}
	
	public void logTransfer(String sender, String receiver, double amount) {
		balance = balance - amount;
		printWriter.println("Transfer ( "+ sender +" --> "+ receiver + " ): " + amount);
	}
	
	public void logBalance(String accountNumber) {
		printWriter.println("Total Balance ( "+accountNumber+" ): "+ balance );
	}

	
	
}
