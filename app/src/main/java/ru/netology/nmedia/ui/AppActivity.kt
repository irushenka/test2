package ru.netology.nmedia.ui

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.netology.nmedia.R

class AppActivity : AppCompatActivity(R.layout.activity_app) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = findViewById<StatsView>(R.id.stats)
        view.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )

        val textView = findViewById<ru.netology.nmedia.ui.TextView>(R.id.text)
        textView.data = listOf(
            500F,
            500F,
            500F,
            500F,
        )

        view.startAnimation(
        AnimationUtils.loadAnimation(this, R.anim.view_animation)
        )
    }
}