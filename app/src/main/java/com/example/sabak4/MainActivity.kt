package com.example.sabak4

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sabak4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer = MediaPlayer.create(this, R.raw.asqat_amangeldy)

        binding.btnStart.setOnClickListener {
            mediaPlayer.start()
        }

        binding.btnPause.setOnClickListener {
            mediaPlayer.pause()
        }

        binding.btnStop.setOnClickListener {
            mediaPlayer.stop()
            mediaPlayer.prepare()
        }
    }
}