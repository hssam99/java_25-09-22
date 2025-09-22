package bank;

import java.util.Scanner;

public interface BankProgram {
	
	Scanner sc = new Scanner(System.in);
	
	public void printMenu(); // 메뉴 출력
	public void deposit(Scanner sc); // 입금
	public void withdraw(Scanner sc); // 출금
	public void transfer(Scanner sc); // 송금
	public void createAccount(Scanner sc); // 계좌 생성
	public void printAccountHistory(Scanner sc); // 계좌 기록 출력
	public void printBankList(); // 은행 리스트 출력 
	public void makeBankList(); // 은행 리스트 출력 
	
}
