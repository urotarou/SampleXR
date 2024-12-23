package lab.uro.kitori.samplexr.space

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.xr.compose.platform.LocalHasXrSpatialFeature
import lab.uro.kitori.samplexr.component.FullSpaceModeIconButton
import lab.uro.kitori.samplexr.ui.theme.SampleXRTheme

// ホームスペース
@Composable
internal fun MainSpaceHome(onRequestFullSpaceMode: () -> Unit) {
    Surface(color = Color.Transparent) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MainSpaceContent(
                modifier = Modifier
                    .weight(1f)
                    .padding(48.dp),
            )

            if (LocalHasXrSpatialFeature.current) {
                FullSpaceModeIconButton(
                    onClick = onRequestFullSpaceMode,
                    modifier = Modifier
                        .align(alignment = Alignment.Top)
                        .padding(32.dp),
                )
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun PreviewMy2dContent() {
    SampleXRTheme {
        MainSpaceHome(onRequestFullSpaceMode = {})
    }
}
