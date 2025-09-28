package com.example.challenge1cbf.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.challenge1cbf.R
import com.example.challenge1cbf.ui.components.BodySecondary
import com.example.challenge1cbf.ui.components.PrimaryButton
import com.example.challenge1cbf.ui.components.PrimaryTitle
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import com.example.challenge1cbf.ui.components.SecondaryButton

@Composable
fun WelcomeScreen(
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
        Image(
            painter = painterResource(id = R.drawable.welcome),
            contentDescription = "welcome",
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1.15f),
            contentScale = ContentScale.FillWidth
        )

        PrimaryTitle(
            text = "Discover Your\nDream Job here",
            modifier = Modifier.fillMaxWidth()
        )

        BodySecondary(
            text = "Explore all the existing job roles based on your interest and study major",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.weight(1f))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .navigationBarsPadding()
                .padding(bottom = 16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            PrimaryButton(
                text = "Login",
                modifier = Modifier.width(160.dp)
            )

            Spacer(Modifier.weight(1f))

            SecondaryButton(
                text = "Register",
                modifier = Modifier.width(160.dp)
            )
        }
    }
}