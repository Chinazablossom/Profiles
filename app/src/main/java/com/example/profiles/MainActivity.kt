package com.example.profiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profiles.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val slackProfileImageView = viewBinding.imageView
        val slackProfileImageUrl = "https://ca.slack-edge.com/T05FFAA91JP-U05RYP1PR32-dfb6ad62f5de-512"
        Picasso.get().load(slackProfileImageUrl).into(slackProfileImageView)

        viewBinding.btnOpenGithub.setOnClickListener{
            startActivity(Intent(this,UserProfileActivity::class.java))
        }

    }
}