package com.example.challenge1cbf

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.challenge1cbf.ui.screens.LoginScreen
import com.example.challenge1cbf.ui.screens.WelcomeScreen
import com.example.challenge1cbf.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    //WelcomeScreen(modifier = Modifier.padding(innerPadding))
                    LoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}