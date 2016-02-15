package DesignPatterns_StatePattern;

public class ATMMachine {
	
	ATMState noCard;
	ATMState atmState;
	int cashInMachine = 2000;
	boolean correctPinEntered = false;
	
	public ATMMachine(){
		noCard = new NoCard(this);
		atmState = noCard;
	}
	
	void setATMState(ATMState newATMState){
		
		atmState = newATMState;
		
	}
	
	public void setCashInMachine(int newCashInMachine){
		
		cashInMachine = newCashInMachine;
		
	}
	
	public void insertCard() {
		
		atmState.insertCard();
		
	}

	public void ejectCard() {
		
		atmState.ejectCard();
		
	}

	public void requestCash(int cashToWithdraw) {
		
		atmState.requestCash(cashToWithdraw);
		
	}

	public void insertPin(int pinEntered){
		
		atmState.insertPin(pinEntered);
		
	}
	
	public ATMState getATMState(){
		
		return this.atmState;
		
	}
	
}
