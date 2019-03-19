package arrays1;

public class Pixel {
	public APreviewPixel[][] generatePixelArray(int[][] reds, int[][] greens, int[][] blues)
	{ 
APreviewPixel [][] draw = new APreviewPixel [reds.length][reds.length];
for (int g= 0; g<draw.length; g++) {
	for (int h =0; h< draw[0].length; h++) {
draw[g][h] = new APreviewPixel(reds [g][h],blues[g][h],greens [g][h]);
	}
}
return draw;
	}






public APreviewPixel[][] flipimage(APreviewPixel[][] image, boolean horiz) {
	APreviewPixel [][] flipped = new APreviewPixel[image.length][image.length];
	if(horiz == true ) {
		for (int l =0; l< image.length; l++) {
			for (int f =0; f<image[0].length; f++) {
				flipped [l][f] = image [image.length -1 - l] [image.length -1 -f]  ;
			}
		}
	}
		else {
			for (int e =0; e<image[0].length; e++) {
				for(int p =0; p<image.length; p++) {
					flipped [e][p] = image [image.length -1 - e] [image.length -1 -p];
				}
			}
		}
	
return flipped;
	}
}
	
	