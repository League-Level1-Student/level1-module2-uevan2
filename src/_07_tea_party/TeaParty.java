package _07_tea_party;

public class TeaParty {

	private String name;
	private boolean isWoman;
	private boolean isKnighted;
	
    public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
    	String greeting = "Hello ";
    	if (isKnighted == true) {
    		greeting=greeting+"Sir ";
    	}
    	else if(isWoman == true) {
    		greeting=greeting+"Ms. ";
    	}
    	else {
    		greeting=greeting+"Mr. ";
    	}
    	greeting=greeting+name;
    	
    	return greeting;
    }
    
}
