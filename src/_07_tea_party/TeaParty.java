package _07_tea_party;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;

		String Welcome(String name, boolean isWoman, boolean isKnighted) {
			this.name = name;
			this.isWoman = isWoman;
			this.isKnighted = isKnighted;	
			return null;
		}
		 public String setName() {
		if(isKnighted == true && isWoman == false) {
				 name = "Sir " + name;
			 }
			 else if(isKnighted == false && isWoman == false) {
				 name = "Mr. " + name;
			 }
			 if(isKnighted == true && isWoman == true) {
				 name = "Lady " + name;
			 }
			 else if(isKnighted == false && isWoman == true) {
				 name = "Ms. " + name;
			 }
			 return name;
		 }
		 
		public class TeaPartyTest {
		 /**
		  * Jane Austen is a woman, so say “Hello Ms. Austen”. 
		  * George Orwell is a man, so say “Hello Mr. Orwell”. 
		  * Isaac Newton was knighted, so say "Hello Sir Isaac Newton".
		  **/

		 @Test
		 public void test() {
		     TeaParty teaParty = new TeaParty();
		      String greeting = teaParty.Welcome(null, false, false);
		      assertEquals("Hello Ms. Austen", teaParty.Welcome("Austen", true, false));
		      assertEquals("Hello Mr. Orwell", teaParty.Welcome("Orwell", false, false));
		      assertEquals("Hello Sir Isaac Newton", teaParty.Welcome("Isaac Newton", false, true));
		      
		 }
		}
}