package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController implements BankProgram {
	
	List<Bank> bankList = new ArrayList<Bank>(); // 은행 리스트
	

	
	
	@Override
	public void printMenu() {
		System.out.println("=============== MENU ===============");
		System.out.println("1. 계좌생성 | 2. 입금하기 | 3. 출금하기");
		System.out.println("4. 송금하기 | 5. 계좌정보출력하기 | 6. 종료");
		System.out.println("====================================");
	}
	
	
	// 1. 사용자 계정 생성
	@Override
	public void createAccount(Scanner sc) {
		
		int bankName = returnBankName(); // 은행 선택(선택한 은행 인덱스 리턴)
		bankList.get(bankName).addAccount(sc); // 계정 생성
		
	}

	
	// 2. 입금하기
	@Override
	public void deposit(Scanner sc) {
		int bankName = returnBankName(); // 은행 선택(선택한 은행 인덱스 리턴)
		
		System.out.print("계좌번호 입력 > ");
		int index = bankList.get(bankName).findAccount(sc.next()); // 검색한 계좌 인덱스 리턴
		
		
		if(index==-1) {
			System.out.println("계좌 정보가 존재하지 않습니다.");
			return;
		}
		
		Account userAccount = bankList.get(bankName).getCustomerList().get(index); // 검색한 계좌
		
		System.out.print("입금금액 > ");
		int amount = sc.nextInt();
		
		// 입금 정상 처리됐을 경우 로그 기록
		if(userAccount.deposit(amount)) {
			userAccount.saveTransactionLog(0, amount, userAccount, userAccount); // deposit code = 0
			System.out.println("입금을 완료했습니다.");
		}
		
		
	}

	
	// 3. 출금하기
	@Override
	public void withdraw(Scanner sc) {
		int bankName = returnBankName(); // 은행 선택(선택한 은행 인덱스 리턴)
		
		System.out.print("계좌번호 입력 > ");
		int index = bankList.get(bankName).findAccount(sc.next()); // 검색한 계좌 인덱스 리턴
		
		if(index==-1) {
			System.out.println("계좌 정보가 존재하지 않습니다.");
			return;
		}
		
		Account userAccount = bankList.get(bankName).getCustomerList().get(index); // 검색한 계좌
		
		System.out.print("출금금액 > ");
		int amount = sc.nextInt();
		
		// 출금 정상 처리됐을 경우 로그 기록
		if(userAccount.withdraw(amount)) {
			userAccount.saveTransactionLog(1, amount, userAccount, userAccount); // withdraw code = 1
			System.out.println("출금을 완료했습니다.");
		}
		
		
	}

	
	// 4. 송금하기
	
	// 자기자신에게 송금 못하도록 설정
	@Override
	public void transfer(Scanner sc) {
		
		// 보내는이
		System.out.println("=== 보내는이 ===");
		int senderBankName = returnBankName(); // 은행 선택(선택한 은행 인덱스 리턴)
		
		System.out.print("계좌번호 입력 > ");
		int senderIndex = bankList.get(senderBankName).findAccount(sc.next()); // 검색한 계좌 인덱스 리턴
		
		if(senderIndex==-1) {
			System.out.println("계좌 정보가 존재하지 않습니다.");
			return;
		}
		
		Account senderAcc = bankList.get(senderBankName).getCustomerList().get(senderIndex); // 보내는이 객체 생성
		
		
		// 받는이
		System.out.println("=== 받는이 ===");
		int receiverBankName = returnBankName(); // 은행 선택(선택한 은행 인덱스 리턴)
		
		System.out.print("계좌번호 입력 > ");
		int recieverIndex = bankList.get(receiverBankName).findAccount(sc.next()); // 검색한 계좌 인덱스 리턴
		
		if(recieverIndex==-1) {
			System.out.println("계좌 정보가 존재하지 않습니다.");
			return;
		}
		
		Account receiverAcc = bankList.get(receiverBankName).getCustomerList().get(recieverIndex); // 받는이 객체 생성
		
		
		
		// 송금 금액 입력
		System.out.print("금액 입력 > ");
		int amount = sc.nextInt();
		
		
		// 이체 처리
		
		// 1. 송금자
		if(senderAcc.withdraw(amount)) {
			senderAcc.saveTransactionLog(2, amount, senderAcc, receiverAcc); // transfer code = 2 로그 기록
		}else {
			return; // 오작동시 종료
		}
		
		// 2. 받는자
		if(receiverAcc.deposit(amount)) {
			receiverAcc.saveTransactionLog(3, amount, senderAcc, receiverAcc); // transfer code = 3 로그 기록
		}
		
		
		System.out.println("송금을 완료했습니다.");
		
	}

	
	
	// 5. 계좌 정보 출력하기
	@Override
	public void printAccountHistory(Scanner sc) {
		int bankName = returnBankName(); // 은행 선택(선택한 은행 인덱스 리턴)
		
		System.out.print("계좌번호 입력 > ");
		int index = bankList.get(bankName).findAccount(sc.next());
		
		if(index==-1) {
			System.out.println("계좌 정보가 존재하지 않습니다.");
			return;
		}
		
		Account userAccount = bankList.get(bankName).getCustomerList().get(index);
		userAccount.printAccountFile();
	}
	
	

	@Override
	public void makeBankList() {
		bankList.add(new Bank("우리은행","100"));
		bankList.add(new Bank("신한은행", "200"));
		bankList.add(new Bank("하나은행", "300"));
	}
	
	@Override
	public void printBankList() {
		System.out.println("---은행 리스트---");
		int i = 1;
		for(Bank b : bankList) {
			System.out.println("["+i++ + "] "+b.getCompanyName());
		}
		System.out.println("--------------");
	}

	
	// 은행을 선택하면 해당 은행 인덱스 값 리턴
	public int returnBankName() {
		printBankList();
		int bankName = -1;
		do{
			try {
				System.out.print("은행 선택 > ");
				bankName = sc.nextInt()-1; // 리스트 인덱스는 사용자가 입력한 값의 -1
				
				if (bankName<0||bankName>2) {
					System.out.println("없는 옵션입니다. 다시 선택하세요.");
					bankName = -1;
					continue;
				}
				break;
			} catch (Exception e) {
				System.err.println("Err: 잘못된 값을 입력했습니다.");
				sc.nextLine();
			}
		}while(true);
		return bankName;
	}

	
	
	
	

}
