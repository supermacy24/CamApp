package com.techDev.camapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.fragment.app.DialogFragment;


public class dialog extends DialogFragment {
    private static final int REQUEST_IMAGE_CAPTURE =101;
    private static final int PICK_IMAGE=100;
    Uri imageUri;
    private MainActivity ma;
    int requestCode;
    int resultCode;
    Intent data;
    Context context;
    AlertDialog.Builder builder;
public Dialog onCreateDialog(Bundle savedInstanceState) {


// setup the alert builder
    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
    builder.setTitle("Adicionar foto");

// add a list
    String[] options = {"Galeria", "camara"};
    builder.setItems(options, new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            switch (which) {
                //---------------------------OPEN GALLERY---------------------------------//
                case 0:
                    Intent pickPhoto = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult(pickPhoto, 1);
                    break;
                //-------------------------------------------------------------------//


                //------------------------------OPEN CAMERA--------------------------//
                case 1:
                    picOption p = new picOption();

                    p.cam();
                   // p.onActivityResult(requestCode,resultCode,data);
//TODO---------------------------------------------------------------------------------------------
                    break;

                //------------------------------------------------------------------//

            }
        }


//            if(requestCode==PICK_IMAGE && resultCode==getActivity().RESULT_OK){
//            imageUri = data.getData();
//           iv.setImageURI(imageUri);
//        }
//            }
    });

// create and show the alert dialog
    AlertDialog dialog = builder.create();
    dialog.show();
    dialog.dismiss();
    return builder.create();
}
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        iv= iv.findViewById(R.id.profile_image);
//
//        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == getActivity().RESULT_OK) {
//            Bundle extras = data.getExtras();
//            Bitmap ib = (Bitmap) extras.get("data");
//            iv.setImageBitmap(ib);
//            System.out.println("guardou a foto");
//        }}





}