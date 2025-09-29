package com.example.challenge1cbf.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.challenge1cbf.ui.components.BodySecondary
import com.example.challenge1cbf.ui.components.PrimaryButton
import com.example.challenge1cbf.ui.components.PrimaryTitle
import com.example.challenge1cbf.ui.components.SocialButtonsRow
import com.example.challenge1cbf.ui.components.TextField

@Composable
fun RegisterScreen(
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
        PrimaryTitle(text = "Create Account", modifier = Modifier.fillMaxWidth())
        BodySecondary(text = "Create an account so you can explore all the\n existing jobs", modifier = Modifier.fillMaxWidth(), fontSize = 18.sp)
        TextField("Email", "Email", modifier = Modifier.fillMaxWidth())
        TextField("Password", "Password", modifier = Modifier.fillMaxWidth())
        TextField("Confirm Password", "Confirm Password", modifier = Modifier.fillMaxWidth())
        PrimaryButton(
            text = "Sign up",
            modifier = Modifier.fillMaxWidth()
        )
        BodySecondary(text = "Already have an account")
        PrimaryTitle(text = "Or continue with", fontSize = 16.sp)
        SocialButtonsRow()
    }
}