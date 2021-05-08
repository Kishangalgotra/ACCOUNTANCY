package main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.account.accountancy.HomeActivity;
import com.account.accountancy.R;

import maes.tech.intentanim.CustomIntent;

public class subject_screen extends AppCompatActivity {

    private Button accountancy ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_screen);
        accountancy =  findViewById(R.id.accountancy_button);
        //accountancy.setOnClickListener(this);

    }
    public void next(View view) {
        final Animation myAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim);
        accountancy.startAnimation(myAnim);
        Intent intent = new Intent(subject_screen.this, HomeActivity.class);
        startActivity(intent);
        CustomIntent.customType(this,"left-to-right");
    }
}