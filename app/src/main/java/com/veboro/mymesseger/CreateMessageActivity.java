package com.veboro.mymesseger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Call onSendMessage() when the button is clicked
    public void onSendMessage(View view){
        EditText messageView = findViewById(R.id.message);
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra("Message",messageView.toString());
        startActivity(intent);

    }
}
