package lab.uro.kitori.samplexr.space

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import lab.uro.kitori.samplexr.R
import lab.uro.kitori.samplexr.ui.theme.SampleXRTheme

@Composable
internal fun MainSpaceContent(modifier: Modifier = Modifier) {
    var hasBackgroundImage by remember {
        mutableStateOf(false)
    }
    val text = if (hasBackgroundImage) {
        "背景 OFF"
    } else {
        "背景 ON"
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Button(
            onClick = {
                hasBackgroundImage = !hasBackgroundImage
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0x77FF0000),
                contentColor = Color.White,
            ),
        ) {
            Text(text = text)
        }

        Spacer(modifier = Modifier.height(16.dp))
        Box {
            if (hasBackgroundImage) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                )
            }
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun PreviewMainSpaceContent_() {
    SampleXRTheme {
        MainSpaceContent()
    }
}
