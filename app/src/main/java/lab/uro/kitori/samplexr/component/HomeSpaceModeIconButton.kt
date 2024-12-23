package lab.uro.kitori.samplexr.component

import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.PreviewLightDark
import lab.uro.kitori.samplexr.R
import lab.uro.kitori.samplexr.ui.theme.SampleXRTheme

@Composable
fun HomeSpaceModeIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    FilledTonalIconButton(onClick = onClick, modifier = modifier) {
        Icon(
            painter = painterResource(id = R.drawable.ic_home_space_mode_switch),
            contentDescription = stringResource(R.string.switch_to_home_space_mode),
        )
    }
}

@PreviewLightDark
@Composable
private fun PreviewHomeSpaceModeButton() {
    SampleXRTheme {
        HomeSpaceModeIconButton(onClick = {})
    }
}
