package main;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;

import com.account.accountancy.R;

public class subject_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_screen);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.anim);
        //sign_in.startAnimation(myAnim);
    }
}