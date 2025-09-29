package com.example.challenge1cbf.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.challenge1cbf.R

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {},
        modifier = modifier.height(52.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        Text(text)
    }
}

@Composable
fun SecondaryButton(
    text: String,
    modifier: Modifier = Modifier
) {
    OutlinedButton(
        onClick = {},
        modifier = modifier.height(52.dp),
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            contentColor = MaterialTheme.colorScheme.secondary
        ),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.primary)
    ) {
        Text(text)
    }
}

@Composable
fun SocialButton(
    icon: Painter,
    contentDesc: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit = {}
) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.6f),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)),
        modifier = modifier
            .width(60.dp)
            .height(44.dp)
            .clip(RoundedCornerShape(10.dp))
            .clickable { onClick() }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 12.dp, vertical = 10.dp),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = icon,
                contentDescription = contentDesc,
                tint = Color.Unspecified,
                modifier = Modifier.size(32.dp)
            )
        }
    }
}

@Composable
fun SocialButtonsRow(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        SocialButton(painterResource(R.drawable.ic_google), "Google", onClick = {})
        SocialButton(painterResource(R.drawable.ic_facebook), "Facebook", onClick = {})
        SocialButton(painterResource(R.drawable.ic_apple), "Apple", onClick = {})
    }
}