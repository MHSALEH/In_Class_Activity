package com.example.in_class_activity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity<puplic> extends AppCompatActivity {
    private Button btnSave;
    private Button btnAdd;
    private EditText edtBook;
    private EditText edtName;
    private EditText edtPage;
    private boolean savedIns = false;
    private SharedPreferences pref;
    private SharedPreferences.Editor editor;
    public static final String NAME = "NAME";
    public static final String BOOK = "BOOK";
    public static final String PAGE = "PAGE";
    public static final boolean FLAG = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd.findViewById(R.id.btnAdd);
        btnSave.findViewById(R.id.btnSave);
        edtBook.findViewById(R.id.edtBook);
        edtName.findViewById(R.id.edtName);
        edtPage.findViewById(R.id.edtPage);

        setUpShard();
    }

    private void setUpShard(){
        SharedPreferences pref = PreferenceManager.getDefaultSharedPreferences(this);
        editor = pref.edit();
    }

    private void checkData() {
        boolean f = pref.getBoolean("FLAG" , false);
        if(f){
            String name = pref.getString(NAME,"");
            String Book = pref.getString(BOOK,"");
            String Page = pref.getString(PAGE,"");
            edtName.setText(name);
            edtBook.setText(Book);
            edtPage.setText(Page);
        }
    }

    protected void SaveIns(){

    }

    protected void AddOnClick(){

    }

    protected void SaveOnClick(){


    }


}