package com.csci4320.iotmanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class appState extends Login {

   

   
    public void armApp(View view) {
        
        
        if(User != false){
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            email = String.valueOf(editTextEmail.getText());
            password = String.valueOf(editTextPassword.getText());
         if (Toast.TextUtils.isEmpty(password)){
            Toast.makeText(armApp.this, "Enter Password" Toast.LENGTH_SHORT).show();
            return;
            finish();
        }
    }

    public void disarmApp(@NonNull Task<AuthResult> task ) {
    	   if(User != false) {
    		   Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
            email = String.valueOf(editTextEmail.getText());
            password = String.valueOf(editTextPassword.getText());
         }
          if(task.isSuccessful()){
             Toast.makeText(getApplicationContext(), "Login success", Toast.LENGTH_SHORT).show();
             Intent intent = new Intent(getApplicationContext(), Login.class);
             finish();
             }else{
                Toast.makeText(armApp.this, "No Authentication", Toast.LENGTH_SHORT).show();
          }
            
            	
    	}
    }
