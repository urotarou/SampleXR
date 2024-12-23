package lab.uro.kitori.samplexr.space

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.xr.compose.spatial.EdgeOffset
import androidx.xr.compose.spatial.Orbiter
import androidx.xr.compose.spatial.OrbiterEdge
import androidx.xr.compose.spatial.Subspace
import androidx.xr.compose.subspace.SpatialPanel
import androidx.xr.compose.subspace.layout.SpatialRoundedCornerShape
import androidx.xr.compose.subspace.layout.SubspaceModifier
import androidx.xr.compose.subspace.layout.height
import androidx.xr.compose.subspace.layout.movable
import androidx.xr.compose.subspace.layout.resizable
import androidx.xr.compose.subspace.layout.width
import lab.uro.kitori.samplexr.component.HomeSpaceModeIconButton

// フルスペース
@Composable
internal fun MainSpaceFull(onRequestHomeSpaceMode: () -> Unit) {
    Subspace {
        SpatialPanel(
            modifier = SubspaceModifier
                .width(1280.dp)
                .height(800.dp)
                .resizable()
                .movable(),
        ) {
            Surface {
                MainSpaceContent(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(48.dp),
                )
            }

            Orbiter(
                position = OrbiterEdge.Top,
                offset = EdgeOffset.inner(offset = 20.dp),
                alignment = Alignment.End,
                shape = SpatialRoundedCornerShape(CornerSize(28.dp)),
            ) {
                HomeSpaceModeIconButton(
                    onClick = onRequestHomeSpaceMode,
                    modifier = Modifier.size(56.dp),
                )
            }
        }
    }
}
