package _07_tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
	
	public String welcome(String name, boolean isWoman, boolean isKnighted) {	
		
		if(isWoman == true && isKnighted == true) {
			name = "Lady " + name;
		}
		else if(isWoman == true && isKnighted == false) {
			name  = "Ms. " + name;
		}
		else if(isWoman == false && isKnighted == true) {
			name = "Sir " + name;
		}
		else if(isWoman == false) {
			name = "Mr. " + name;
		}
		
		return "Hello " + name;
	}

}