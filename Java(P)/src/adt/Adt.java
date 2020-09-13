package adt;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Adt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedImage image = null;
		try {
			File file = new File("/Users/pjsc/Pictures/param.jpg");
			image = ImageIO.read(file);
//			int y = image.getHeight();
//			int x = image.getWidth();
//			for(int i = 0; i<y; i++) {
//				for(int j = 0; j<x; j++) {
//			Color c = new Color(image.getRGB(j, i));
//			int red = (int)(c.getRed()*299);
//			int green = (int)(c.getGreen()*0.587);
//			int blue = (int)(c.getBlue()*0.114);
//			Color nC = new Color(red + green + blue);
//			image.setRGB(j, i, nC.getRGB());
//				}
//			}
			
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		int y = image.getHeight();
		int x = image.getWidth();
		
		BufferedImage image1 = new BufferedImage(x,y,BufferedImage.TYPE_INT_ARGB);
		
		for(int i = 0; i<y; i++) {
			for(int j = 0; j<x; j++) {
				Color c = new Color(image.getRGB(j, i));
				image1.setRGB(j, y-i-1, c.getRGB());
			}
		}
		
		try {
			File file = new File("/Users/pjsc/Pictures/paramjot2.jpg");
//			ImageIO.write(image, "jpg", file);
			ImageIO.write(image1, "jpg", file);
		}catch(IOException e){
				System.out.println(e);
			}
	}

}
