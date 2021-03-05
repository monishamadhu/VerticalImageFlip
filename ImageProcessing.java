package week4.imageProcessing;

import java.lang.reflect.Array;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram {
	
	public void run() {
	    GImage image = new GImage("C:/Users/moni0/Pictures/milkmaid.gif");
		add(image,10,50);	//adding image to canvas
		
		GImage flipImage = verticalFlip(image);
		add(flipImage, 500,50); //adding modified image to canvas
	}
	private GImage verticalFlip(GImage img) {
		int[][] arr = img.getPixelArray();	//stores pixels of image as a 2 dimensional array
		
		int height = arr.length;
		int width= arr[0].length;
		int[][] modifiedArray = new int[height][width];
		
		for(int i=0;i<height;i++) {
			int k=0;
			for(int j=width-1;j>=0;j--) {
				int pixel=arr[i][j];
				
				int r = GImage.getRed(pixel);
				int g = GImage.getGreen(pixel);
				int b= GImage.getBlue(pixel);
				
				modifiedArray[i][k] = (GImage.createRGBPixel(r, g, b));
				k++;
			}
		}
		return new GImage(modifiedArray);
	}
}
 