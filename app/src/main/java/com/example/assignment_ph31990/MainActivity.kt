package com.example.assignment_ph31990

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.assignment_ph31990.BottomNav.BottomMainScreen
import com.example.assignment_ph31990.ui.theme.Assignment_PH31990Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Assignment_PH31990Theme {
                BottomMainScreen()
            }
        }
    }
}

