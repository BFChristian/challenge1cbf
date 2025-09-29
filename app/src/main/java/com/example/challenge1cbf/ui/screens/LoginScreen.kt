package com.example.challenge1cbf.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge1cbf.ui.components.BodySecondary
import com.example.challenge1cbf.ui.components.PrimaryButton
import com.example.challenge1cbf.ui.components.PrimaryTitle
import com.example.challenge1cbf.ui.components.SocialButtonsRow
import com.example.challenge1cbf.ui.components.TextField

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PrimaryTitle(text = "Login here", modifier = Modifier.fillMaxWidth())
        BodySecondary(text = "Welcome back you’ve\nbeen missed!", modifier = Modifier.fillMaxWidth(), fontSize = 18.sp)
        TextField("Email", "Email", modifier = Modifier.fillMaxWidth())
        TextField("Password", "Password", modifier = Modifier.fillMaxWidth())
        PrimaryTitle(text = "Forgot your password?", textAlign = TextAlign.Right, fontSize = 16.sp)
        PrimaryButton(
            text = "Sign in",
            modifier = Modifier.fillMaxWidth()
        )
        BodySecondary(text = "Create new account")
        PrimaryTitle(text = "Or continue with", fontSize = 16.sp)
        SocialButtonsRow()
    }
}