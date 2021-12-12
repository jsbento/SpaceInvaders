package ships;

import projectiles.Projectile;
import utils.Position;

public class MultiShooterShip extends ShooterShip {
	public static final int NUM_CANNONS = 5;
	public static final double SPREAD = 0.25;

  /**
   * Constructs a MultiShooterShip
   * @param p The initial position
   * @param armor The initial armor level
   */
	public MultiShooterShip(Position p, int armor) {
		super(p, armor);
	}

  /**
   * Fires NUM_CANNONS projectiles, that spread out as they fall
   * @return An array of projectiles
   */
	public Projectile[] fire() {
		if(!canFire())
			return null;
		Projectile[] projectiles = new Projectile[NUM_CANNONS];
		
		for(int i = 0; i < NUM_CANNONS; i++)
			projectiles[i] = new Projectile(super.getPosition(), ((i++)-(NUM_CANNONS/2))*SPREAD, -1*SpaceShip.PROJECTILE_SPEED, Projectile.GRAVITY);
		return projectiles;
	}

	@Override
	public String imgPath() {
		return "res/monster3.png";
	}
}
