package com.example.challenge1cbf.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.challenge1cbf.R

@Composable
fun WelcomeScreen(modifier: Modifier){
    Column(modifier = Modifier.fillMaxSize()) {
        Image( modifier = Modifier,
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "welcome"
        )
    }
}