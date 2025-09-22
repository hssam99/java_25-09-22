package day12;

public class Agent {
	private String agentName;
	private String agentNumber;
	
	
	public Agent() {}
	public Agent(String name, String num) {
		this.agentName=name;
		this.agentNumber=num;
	}
	
	
	
	
	
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public String getAgentNumber() {
		return agentNumber;
	}
	public void setAgentNumber(String agentNumber) {
		this.agentNumber = agentNumber;
	}
	@Override
	public String toString() {
		return "Agent [agentName=" + agentName + ", agentNumber=" + agentNumber + "]";
	}
	

}
