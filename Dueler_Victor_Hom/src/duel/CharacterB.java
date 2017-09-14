package duel;

public class CharacterB implements Dueler {

	private int hp;
	public CharacterB() {
		
	}
	public void taunt() {
		System.out.println("You're terrible!");
	}

	public String getName() {
		return "Joker";
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		
	}

}
