package com.techDev.camapp;

import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;


public class MainActivity<boolRecd> extends AppCompatActivity {

    private ImageView iv;
    private Spinner s;
    private Boolean boolRecd;
    Uri imageUri;

    private static final int REQUEST_IMAGE_CAPTURE = 101;
    private static final int PICK_IMAGE = 100;
    dialog d = new dialog();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.profile_image);
        s = (Spinner) findViewById(R.id.spinner);

        Intent intent = getIntent();

        boolRecd = intent.getBooleanExtra("testBool", true);
        System.out.println(boolRecd);
        if (boolRecd == false) {
            String gatos[] = getResources().getStringArray(R.array.gatos_array);

            ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, gatos);
            spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            s.setAdapter(spinnerArrayAdapter);
        } else {
            String caes[] = getResources().getStringArray(R.array.caes_array);

            ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, caes);
            spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            s.setAdapter(spinnerArrayAdapter);
        }


        //----------------Nova instancia do calendario--------------------//
        Calendar rightNow = Calendar.getInstance();
        //-----------------Encontra a data atual(wed apr 29  hh:mm:ss gmt yyyy)-------------------------//
        Date a = rightNow.getTime();
        System.out.println("a sua data" + a);
    }


    public void newPic(View view) {

        d.show(getSupportFragmentManager(), "ola");
        System.out.println("abriu dialogo");


        //---------------------------------------Open gallery------------------------------------//
//        Intent pickPhoto = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
//        startActivityForResult(pickPhoto , 1);
////-----------------------------------------------------------------------------------------------//
//           Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
//            if (imageTakeIntent.resolveActivity(getPackageManager())!=null)
//            {
//                startActivityForResult(imageTakeIntent,REQUEST_IMAGE_CAPTURE);
//            }
//
//
    }


//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
//            Bundle extras = data.getExtras();
//            Bitmap ib = (Bitmap) extras.get("data");
//            iv.setImageBitmap(ib);
//            System.out.println("guardou a foto1111");
//        }


//   protected void onActivityResult(int requestCode, int resultCode, Intent data)
//   {
//        if(requestCode==REQUEST_IMAGE_CAPTURE && resultCode==RESULT_OK )
//       {
//            Bundle extras = data.getExtras();
//            Bitmap ib = (Bitmap) extras.get("data");
//            iv.setImageBitmap(ib);
//        }
//
//        if(requestCode==PICK_IMAGE && resultCode==RESULT_OK){
//            imageUri = data.getData();
//            iv.setImageURI(imageUri);
//        }
//
//   }

}


