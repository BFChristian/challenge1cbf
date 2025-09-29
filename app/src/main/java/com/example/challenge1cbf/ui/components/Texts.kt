package com.example.challenge1cbf.ui.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun PrimaryTitle(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 35.sp,
    textAlign: TextAlign = TextAlign.Center
) {
    Text(
        text = text,
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary,
        textAlign = textAlign,
        style = MaterialTheme.typography.headlineSmall.copy(
            fontSize = fontSize,
            fontWeight = FontWeight.SemiBold
        )
    )
}

@Composable
fun Subtitle(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 16.sp,
    textAlign: TextAlign? = TextAlign.Center
) {
    Text(
        text = text,
        modifier = modifier,
        color = MaterialTheme.colorScheme.onBackground,
        textAlign = textAlign,
        style = MaterialTheme.typography.titleMedium.copy(
            fontSize = fontSize,
            fontWeight = FontWeight.SemiBold
        )
    )
}

@Composable
fun BodySecondary(
    text: String,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 14.sp,
    textAlign: TextAlign? = TextAlign.Center
) {
    Text(
        text = text,
        modifier = modifier,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        textAlign = textAlign,
        style = MaterialTheme.typography.bodyMedium.copy(
            fontSize = fontSize,
            fontWeight = FontWeight.Normal
        )
    )
}