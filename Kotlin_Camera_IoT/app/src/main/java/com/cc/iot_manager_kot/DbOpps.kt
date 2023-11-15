package com.cc.iot_manager_kot

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*

import android.content.Context
import android.content.Intent

class DbOpps {
    companion object {
        // Static function
        fun removeCameras(cameraToRemove: String, context:Context) {

            // Reference to the Firebase Database
            val databaseReference: DatabaseReference = FirebaseDatabase.getInstance().reference

            // Get the current user ID
            val userId: String = FirebaseAuth.getInstance().currentUser?.uid ?: ""

            // Reference to the Cameras node for the current user
            val camerasReference = databaseReference.child("Users").child(userId).child("Cameras").child(cameraToRemove)

            camerasReference.removeValue()
            DbOpps.refreshActivity(context)
        }

        fun refreshActivity(context: Context) {
            val intent = Intent(context, UserCameras::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        }

        // filler static property
        val staticProperty: String = "Static property value"
    }



}