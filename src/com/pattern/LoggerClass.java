
//--------------- Logger Application For Bank------------------//
	
	//	what is logger : is used for compliance, trouble shooting, security and performance.
	
	// - Amount withdraw
	// - Amount Deposite
	// - Peer-to-Peer transfer

package com.pattern;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerClass {
	
	private final String fileName = "log.txt";
	private PrintWriter printWriter;
	private double balance = 0.00;
	
	public LoggerClass() {
		
		try {
			
			FileWriter fileWriter = new FileWriter(fileName);
			printWriter = new PrintWriter(fileWriter, true);
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
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
