package main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.account.accountancy.HomeActivity;
import com.account.accountancy.R;

public class subject_screen extends AppCompatActivity {

    private Button accountancy ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_screen);
        accountancy =  findViewById(R.id.accountancy_button);
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.anim);
        //sign_in.startAnimation(myAnim);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent intent = new Intent(subject_screen.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },3300);
    }
}