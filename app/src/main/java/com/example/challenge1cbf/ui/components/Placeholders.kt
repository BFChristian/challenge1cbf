package com.example.challenge1cbf.ui.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextField(
    value: String,
    placeholder: String,
    modifier: Modifier = Modifier,
) {
    OutlinedTextField(
        value = value,
        onValueChange = {},
        modifier = modifier
            .height(52.dp),
        textStyle = MaterialTheme.typography.bodyMedium,
        placeholder = {
            Text(
                text = placeholder,
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.55f)
            )
        },
        shape = RoundedCornerShape(12.dp),
        colors = OutlinedTextFieldDefaults.colors(

            unfocusedContainerColor = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.25f),
            focusedContainerColor   = MaterialTheme.colorScheme.surface,
            disabledContainerColor  = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.25f),

            focusedTextColor   = MaterialTheme.colorScheme.onSurface,
            unfocusedTextColor = MaterialTheme.colorScheme.onSurface,
            cursorColor        = MaterialTheme.colorScheme.primary,

            focusedBorderColor   = MaterialTheme.colorScheme.primary,
            unfocusedBorderColor = MaterialTheme.colorScheme.outline.copy(alpha = 0.6f),
            errorBorderColor     = MaterialTheme.colorScheme.error,

            focusedPlaceholderColor   = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.45f),
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.55f)
        )
    )
}