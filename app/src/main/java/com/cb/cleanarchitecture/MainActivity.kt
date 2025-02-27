package com.cb.cleanarchitecture

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.cb.cleanarchitecture.Presentation.Navigation.AppNavController
import com.cb.cleanarchitecture.Presentation.screen.HomeScreen.HomeScreen
import com.cb.cleanarchitecture.Presentation.ui.theme.CleanArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CleanArchitectureTheme {

                            AppNavController()
            }
        }
    }
}

