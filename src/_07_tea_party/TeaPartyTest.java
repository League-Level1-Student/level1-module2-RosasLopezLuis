package _07_tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaPartyTest {
	
	public class TeaParty {
		String name;
		boolean isWoman;
		boolean isKnighted;

		 public String welcome(String name, boolean isWoman, boolean isKnighted) {
			this.name = name;
			this.isWoman = isWoman;
			this.isKnighted = isKnighted;
	
			if(isWoman == true && isKnighted == true) {
				name = "Hello Lady " + name;
			}
			
			if(isWoman == true && isKnighted == false) {
				name = "Hello Ms. "+ name;
			}
			
			if(isWoman == false && isKnighted == true) {
				name = "Hello Sir " + name;
			}
			
			if(isWoman == false && isKnighted == false) {
				name = "Hello Mr. " + name;
			}
			
			return name;
		 }
		
}
	public class TeaPartyTesting {
		 /**
		  * Jane Austen is a woman, so say “Hello Ms. Austen”. 
		  * George Orwell is a man, so say “Hello Mr. Orwell”. 
		  * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
		  **/

		 @Test
		 public void test() {
		     TeaParty teaParty = new TeaParty();
		      String greeting = teaParty.welcome(null, false, false);
		      assertEquals("Hello Ms. Austen", teaParty.welcome("Austen", true, false));
		      assertEquals("Hello Mr. Orwell", teaParty.welcome("Orwell", false, false));
		      assertEquals("Hello Sir Isaac Newton", teaParty.welcome("Isaac Newton", false, true));
		 }
		}
}

