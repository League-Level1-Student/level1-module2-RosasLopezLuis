package _03_smurf;

public class Smurf_Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa");
		Smurf smurf = new Smurf("Smurfette");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(papa.getName() + papa.getHatColor() + papa.isGirlOrBoy());
		System.out.println(smurf.getName() + smurf.getHatColor() + smurf.isGirlOrBoy());
	}

}
