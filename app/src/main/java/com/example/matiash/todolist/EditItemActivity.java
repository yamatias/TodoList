package com.example.matiash.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {

    private final int REQUEST_CODE = 20;
    EditText textEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String string = getIntent().getStringExtra("string");
        textEdit = (EditText)findViewById(R.id.editText);
        textEdit.setText(string);



    }

    public void onSave(View view) {
        textEdit = (EditText)findViewById(R.id.editText);
        String field = textEdit.getText().toString();
        //Toast.makeText(this,field,Toast.LENGTH_SHORT).show();
        Intent data = new Intent();
        data.putExtra("field",textEdit.getText().toString());
        setResult(RESULT_OK,data);
        this.finish();
    }
}
