package duel;

public class CharacterA implements Dueler {

	private int hp;
	public CharacterA() {
		
	}
	public void taunt() {
		System.out.println("Blood for the Blood God!");
	}

	public String getName() {
		return "Bob";
	}
	
	public void setStartingHP(int hp) {
			this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if (d.getHP() == hp) {
			return true;
		}
		return false;
	}
	
	public int getAction(Object caller) {
		if (caller instanceof Duel) {
			if (Math.random() < 0.08) {
				return 0;
			}
			if (Math.random() < .2) {
				return 1;
			}
			if (Math.random() < 1) {
				return 2;
			}
		}
		return 3;
	}
	
	public void hit(Object caller) {
		if (caller instanceof Duel) {
			this.hp -= 10;
		}
	}
}
