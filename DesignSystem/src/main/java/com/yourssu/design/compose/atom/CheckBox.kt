package com.yourssu.design.compose.atom

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourssu.design.R
import com.yourssu.design.compose.YdsTheme
import com.yourssu.design.compose.base.noRippleClickable
import com.yourssu.design.compose.foundation.IconSize
import com.yourssu.design.compose.foundation.YdsIcon
import com.yourssu.design.compose.states.ButtonSizeState

enum class CheckBoxSize {
    Small, Medium, Large
}

@Stable
@Composable
private fun checkBoxSizeStateBySize(
    size: CheckBoxSize
): ButtonSizeState = when (size) {
    CheckBoxSize.Small -> ButtonSizeState(
        typo = YdsTheme.typography.button4,
        iconSize = IconSize.ExtraSmall,
        betweenSpace = 4.dp
    )
    CheckBoxSize.Medium -> ButtonSizeState(
        typo = YdsTheme.typography.button3,
        iconSize = IconSize.Small,
        betweenSpace = 8.dp
    )
    CheckBoxSize.Large -> ButtonSizeState(
        typo = YdsTheme.typography.button3,
        iconSize = IconSize.Small,
        betweenSpace = 8.dp
    )
}

@Stable
@Composable
private fun checkBoxColor(
    checked: Boolean,
    isDisabled: Boolean,
): Color = when {
    isDisabled -> YdsTheme.colors.buttonDisabled
    checked -> YdsTheme.colors.buttonPoint
    else -> YdsTheme.colors.buttonNormal
}

@Composable
fun CheckBox(
    checked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
    modifier: Modifier = Modifier,
    text: String = "",
    isDisabled: Boolean = false,
    sizeType: CheckBoxSize = CheckBoxSize.Medium,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val icon = when {
        checked -> R.drawable.ic_checkcircle_filled
        else -> R.drawable.ic_checkcircle_line
    }
    val contentColor = checkBoxColor(checked = checked, isDisabled = isDisabled)

    val sizeState = checkBoxSizeStateBySize(size = sizeType)
    val iconSize = sizeState.iconSize
    val typo = sizeState.typo
    val betweenSpace = sizeState.betweenSpace

    val clickableModifier = if (isDisabled) Modifier else
        Modifier.noRippleClickable(interactionSource) { onCheckedChange(!checked) }

    Row(
        modifier = modifier
            .wrapContentWidth()
            .then(clickableModifier),
        verticalAlignment = Alignment.CenterVertically
    ) {
        YdsIcon(
            id = icon,
            iconSize = iconSize,
            tint = contentColor
        )

        Spacer(Modifier.width(betweenSpace))

        Text(
            text = text,
            style = typo,
            color = contentColor
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CheckBoxPreview() {
    var checked1 by remember { mutableStateOf(false) }
    var disabled by remember { mutableStateOf(false) }
    var checked2 by remember { mutableStateOf(false) }

    YdsTheme {
        Column {
            CheckBox(
                checked = checked1,
                onCheckedChange = { checked1 = it },
                text = "test",
                isDisabled = disabled
            )
            CheckBox(
                checked = checked2,
                onCheckedChange = {
                    checked2 = it
                    disabled = it
                },
                text = "disabled",
                sizeType = CheckBoxSize.Large
            )
        }
    }
}