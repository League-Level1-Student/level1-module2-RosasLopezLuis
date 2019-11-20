package _02_sea_creature;

public class Sea_Creature_Runner {

	public static void main(String[] args) {
		SeaCreature sponge = new SeaCreature("Spongebob");
		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squid = new SeaCreature("Squidward");
		System.out.println(sponge.getName());
		sponge.eat();
		sponge.laugh();
		System.out.println(patrick.getName());
		patrick.eat();
		patrick.laugh();
		System.out.println(squid.getName());
		squid.eat();
		squid.laugh();
		
	}

}
