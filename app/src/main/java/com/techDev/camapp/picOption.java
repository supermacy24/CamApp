package com.techDev.camapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class picOption extends AppCompatActivity {

    //---------------------------VARIAVEIS-------------------------//
    private ImageView iv = findViewById(R.id.profile_image);
    private final static int REQUEST_IMAGE_CAPTURE = 1;
    //-------------------------------------------------------------//

    public void cam() {

        Intent imageTakeIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (imageTakeIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(imageTakeIntent, REQUEST_IMAGE_CAPTURE);
        }
    }


    public void gallery() {

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap ib = (Bitmap) extras.get("data");
            iv.setImageBitmap(ib);
            System.out.println("guardou a foto1111");
        }
    }
}
