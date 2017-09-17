package duel;

public class CharacterB implements Dueler {

	private int hp;
	public CharacterB() {}
	public void taunt() {
		System.out.println("Seeing you makes me want to barf!");
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
		if(d.getHP() == hp)
			return true;
		else
			return false;
	}
	
	public int getAction(Object caller) {
		if (caller instanceof Duel) {
			return (int) Math.floor(Math.random() * 3);
			} else
			return 3;
	}
	
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			this.hp -= 10;
		}
	}

}
