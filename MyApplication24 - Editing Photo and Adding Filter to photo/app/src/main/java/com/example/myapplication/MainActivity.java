package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView shubhamsImageView;
    Drawable shubhamsFace;
    Bitmap bitmapImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shubhamsImageView = (ImageView) findViewById(R.id.shubhamsImageView);

//        shubhamsFace = getResources().getDrawable(R.mipmap.images);
//        bitmapImage = ((BitmapDrawable) shubhamsFace).getBitmap();
//        Bitmap newPhoto = invertImage(bitmapImage);
//        shubhamsImageView.setImageBitmap(newPhoto);

        Drawable[] layers = new Drawable[2];
        layers[0]=getResources().getDrawable(R.mipmap.images);
        layers[1]=getResources().getDrawable(R.mipmap.bokehflter);
        LayerDrawable layerDrawable = new LayerDrawable(layers);
        shubhamsImageView.setImageDrawable(layerDrawable);

        //Saves image to phone storage
        //MediaStore.Images.Media.insertImage(getContentResolver(),newPhoto,"title","description");
    }

    public static Bitmap invertImage(Bitmap original){
        Bitmap finalImage = Bitmap.createBitmap(original.getWidth(),original.getHeight(),original.getConfig());

        int A,R,G,B;
        int pixelColor;
        int height = original.getHeight();
        int width = original.getWidth();

        for(int y = 0 ;y < height ;y++){
            for(int x=0; x< width ;x++){
                pixelColor = original.getPixel(x,y);
                A= Color.alpha(pixelColor);
                R = 255 - Color.red(pixelColor);
                G = 255 - Color.green(pixelColor);
                B = 255 - Color.blue(pixelColor);
                finalImage.setPixel(x,y,Color.argb(A,R,G,B));
            }
        }
        return finalImage;
    }
}
