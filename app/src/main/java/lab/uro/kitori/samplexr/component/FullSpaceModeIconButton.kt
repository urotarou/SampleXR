package lab.uro.kitori.samplexr.component

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import lab.uro.kitori.samplexr.R
import lab.uro.kitori.samplexr.ui.theme.SampleXRTheme

@Composable
fun FullSpaceModeIconButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    IconButton(onClick = onClick, modifier = modifier) {
        Icon(
            painter = painterResource(id = R.drawable.ic_full_space_mode_switch),
            contentDescription = stringResource(R.string.switch_to_full_space_mode),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewFullSpaceModeButton() {
    SampleXRTheme {
        FullSpaceModeIconButton(onClick = {})
    }
}
