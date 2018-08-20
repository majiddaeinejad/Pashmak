package app.pashmak.com.pashmak.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import app.pashmak.com.pashmak.R
import com.google.firebase.iid.FirebaseInstanceId

class SplashActivity: AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
    }
}