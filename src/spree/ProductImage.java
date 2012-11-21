package spree;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

public class ProductImage {

	private String path;
	private Drawable image;
	private Drawable thumbnail;
	
	public ProductImage(String path) {
		this.path = path;
	}
	
	public Drawable getImage() {
		if (image == null) {
			//get the image
		}
		
		//if the image could not be obtained use the Spree logo as a dummy
		
		return image;
	}
	
	public Drawable getThumbnail() {
		if (thumbnail == null) {
			//get the thumbnail
		}
		
		//if the thumbnail could not be obtained use the Spree logo as a dummy
		
		return thumbnail;
	}

}
