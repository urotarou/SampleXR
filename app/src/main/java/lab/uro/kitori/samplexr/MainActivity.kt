package lab.uro.kitori.samplexr

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import lab.uro.kitori.samplexr.space.MainSpace
import lab.uro.kitori.samplexr.ui.theme.SampleXRTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            SampleXRTheme {
                MainSpace()
            }
        }
    }
}
