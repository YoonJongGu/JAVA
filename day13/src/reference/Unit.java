package reference;

public class Unit {
	private String name;	// 이름
	private int atk;		// 공격력
	private int def;		// 방어력	
	private int hp;			// 체력
	
	//오른쪽 클릭 - s - r - alt - a 
	
	public Unit(String name, int atk, int def, int hp) {
		this.name = name;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void attack(Unit ob) {
		ob.hp -= this.atk;
	}
	
}
