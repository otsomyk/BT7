package tank.tanks;

import tank.behavior.ActionField;
import tank.behavior.Direction;
import tank.objects.BattleField;

public class BT7 extends AbstractTank {

	final int speed = super.getSpeed() * 2;

	public BT7(ActionField af, BattleField bf) {
		super(af, bf);

	}

	public BT7(ActionField af, BattleField bf, int X, int Y, Direction direction) {
		super(af, bf, X, Y, direction);
	}

	public int getSpeed() {
		return speed;
	}
	
	public void attack() throws Exception {
		moveToQuadrant(5, 9);
	}
}