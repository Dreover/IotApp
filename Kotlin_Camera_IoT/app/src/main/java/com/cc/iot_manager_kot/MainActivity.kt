package com.cc.iot_manager_kot

import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout

import com.cc.iot_manager_kot.databinding.ActivityMainBinding

class MainActivity : NavigationPane() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        val mDrawerLayout:DrawerLayout = findViewById(R.id.drawer_layout)
        onCreateDrawer(mDrawerLayout)

    }
}


/*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
 */

/*
        val mAuth = FirebaseAuth.getInstance()

        val database = FirebaseDatabase.getInstance()
        val ref = database.reference.child("Users")

            val userID = mAuth.currentUser!!.uid
            val currentUser = ref.child(userID)

            currentUser.child("middleName").setValue("pippin")
            currentUser.child("Cameras").child("Camera1").child("Camera Name").setValue("bedroom")
 */