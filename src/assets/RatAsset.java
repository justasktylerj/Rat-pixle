package assets;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RatAsset 
{
	private static BufferedImage spriteSheet;
    private static final int TILE_SIZE = 32;
    

    public static BufferedImage loadSprite(String file) {

        BufferedImage Sprite = null;

        try {
            Sprite = ImageIO.read(new File("src/" + file + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return Sprite;
    }

    public static BufferedImage getSprite(int xGrid, int yGrid) {

        if (spriteSheet == null) {
            spriteSheet = loadSprite("rat");
        }

        return spriteSheet.getSubimage(xGrid * TILE_SIZE, yGrid * TILE_SIZE, TILE_SIZE, TILE_SIZE);
    }
}
