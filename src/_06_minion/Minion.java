package _06_minion;

public class Minion {
	
	private String name;
	private int eyes; 
	private String color; 
	private String master;

	Minion(String name, int eyes, String color, String master){
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
	
	String getName() {
		return name;
	}
	
	int getEyes() {
		return eyes;
	}
	
	String getColor() {
		return color;
	}
	
	String getMaster() {
		return master;
	}
	
	void setName(String nameInput) {
		this.name=nameInput;
	}
	
	void setEyes(int eyesInput) {
		this.eyes=eyesInput;
	}
	
	void setColor(String colorInput) {
		this.color=colorInput;
	}
	
	void setMaster(String masterInput) {
		this.master=masterInput;
	}


}
