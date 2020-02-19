package _99_extra;

public class PixelPartyRunner {

	public static void main(String[] args) {
		PixelParty pixel = new PixelParty();
		pixel.getRandomColor();
		pixel.drawCircle(2, 2, 5);
		pixel.drawRectangle(5, 6, 10, 20);
		pixel.drawTriangle(5, 5, 10, 10, 15, 5);
		pixel.drawLine(10, 15, 20, 15);
		pixel.saveImage();
		pixel.displayImage();
	}

}
