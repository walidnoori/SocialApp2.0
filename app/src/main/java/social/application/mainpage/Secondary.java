package social.application.mainpage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import pl.droidsonroids.gif.GifImageView;
import social.application.R;


public class Secondary extends AppCompatActivity {
    GifImageView gifImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);


       /* ImageView imageView = (ImageView)findViewById(R.id.gif_imageview);

        // load with glide
        Glide.with(this)
                .load(R.drawable.giphy)
                .asGif() // load image
                .placeholder(R.drawable.giphy)
                .crossFade()
                .into(imageView);
*/


    }


}
