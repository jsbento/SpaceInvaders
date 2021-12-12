package ships;

import projectiles.Projectile;
import utils.Position;

public class ShooterShip extends InvaderShip {
  /**
   * Constructs a ShooterShip
   * @param p The initial position
   * @param armor The initial armor level
   */
	public ShooterShip(Position p, int armor) {
		super(p, armor);
	}

	public Projectile[] fire() {
		if(!canFire())
			return null;
		return new Projectile[] {new Projectile(super.getPosition(), 0, -1*SpaceShip.PROJECTILE_SPEED, Projectile.GRAVITY)};
	}

	@Override
	public String imgPath() {
		return "res/monster.png";

	}

	@Override
	public int getPoints() {
		return 50;
	}
}
