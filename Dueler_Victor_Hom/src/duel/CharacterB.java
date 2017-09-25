package duel;

public class CharacterB implements Dueler {

	private int hp;
	private boolean isLoaded;
	private String[] taunts = {"Seeing you makes me want to barf!", "You're terrible!", "Fight me!"}; 
	
	public CharacterB() {
		isLoaded = false;
		
	}
	public void taunt() {
		System.out.println(taunts[(int) Math.floor(Math.random()* taunts.length)]);
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
			
			if(isLoaded) {
				//1 or 2, not 0
				if(Math.random() < 0.5) {
					isLoaded = false;
					return 1;
				}
				else
					return 2;
			}else {
				//0 or 2, not 1
				if(Math.random() < 0.5) {
					isLoaded = true;
					return 0;
				}
				else
					return 2;
			}
			
//			int actionNumber = (int) Math.floor(Math.random() * 3);
//			if(isLoaded && actionNumber == 1)
//			{
//				isLoaded = false;
//				return 1;
//			}
//			while(!isLoaded)
//			{	if(actionNumber == 0)
//				{
//					isLoaded = true;
//					return 0;
//				}
//			
//				if(actionNumber == 1)
//					actionNumber = (int) Math.floor(Math.random() * 3);
//				else
//					return 2;
//			}
		} else
		return 3;
	}
	
	public void hit(Object caller) {
		if(caller instanceof Duel) {
			this.hp -= 10;
		}
	}

}
