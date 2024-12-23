package lab.uro.kitori.samplexr.space

import androidx.compose.runtime.Composable
import androidx.xr.compose.platform.LocalSession
import androidx.xr.compose.platform.LocalSpatialCapabilities

@Composable
internal fun MainSpace() {
    val isSpatialUiEnabled = LocalSpatialCapabilities.current.isSpatialUiEnabled
    val session = LocalSession.current

    if (isSpatialUiEnabled) {
        MainSpaceFull(
            onRequestHomeSpaceMode = {
                session?.requestHomeSpaceMode()
            },
        )
    } else {
        MainSpaceHome(
            onRequestFullSpaceMode = {
                session?.requestFullSpaceMode()
            },
        )
    }
}
