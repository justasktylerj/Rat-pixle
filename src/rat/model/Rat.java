package rat.model;

import assets.RatAsset;
import assets.Animation;
import assets.Frame;
import java.awt.image.BufferedImage;


public class Rat 
{
		  private BufferedImage[] attack = {Sprite.getSprite(2, 3, 4, 5, 0 )};
		  private Animation attack = new Animation(attack, 15);
		  private Animation animation = attack;
}

