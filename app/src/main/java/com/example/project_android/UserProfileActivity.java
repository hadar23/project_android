package com.example.project_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class UserProfileActivity extends AppCompatActivity {
    private GridLayout mainGrid;
    private fragment_message fragment_mess = new fragment_message();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.message_fragment, fragment_mess);
        transaction.commit();

    mainGrid=findViewById(R.id.mainGrid);
    //set Event
    setSingleEven(mainGrid);
    }

    private void setSingleEven(GridLayout mainGrid) {
    //loop for child in gridlayout
        for (int i=0; i<mainGrid.getChildCount();i++){
            CardView card=(CardView)mainGrid.getChildAt(i);
            card.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(UserProfileActivity.this,"click",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
