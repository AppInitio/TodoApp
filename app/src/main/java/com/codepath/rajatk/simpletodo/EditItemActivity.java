package com.codepath.rajatk.simpletodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String text = getIntent().getStringExtra("currentVal");
        index = getIntent().getIntExtra("index",0);

        EditText textItem = (EditText) findViewById(R.id.txtItem);
        textItem.setText(text);
    }

    public void onSave(View v){
        Intent data = new Intent();
        data.putExtra("index", index);
        EditText textItem = (EditText) findViewById(R.id.txtItem);
        String newValue = textItem.getText().toString();
        data.putExtra("newValue", newValue);
        setResult(RESULT_OK, data);
        finish();
    }
}
