package com.example.challenge1cbf.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = BrandBlue,
    onPrimary = OnBrandBlue,
    primaryContainer = BrandBlueContainer,
    onPrimaryContainer = BrandBlue,
    secondary = BrandBlack,
    onSecondary = OnBrandBlack
)

private val DarkColors = darkColorScheme(
    primary = BrandBlue,
    onPrimary = OnBrandBlue,
    primaryContainer = BrandBlue,
    onPrimaryContainer = OnBrandBlue,
    secondary = BrandBlack,
    onSecondary = OnBrandBlack
)

@Composable
fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = if (darkTheme) DarkColors else LightColors,
        typography = MaterialTheme.typography,
        content = content
    )
}