package com.example.miprimerachamba
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miprimerachamba.ui.theme.MIPRIMERACHAMBATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MIPRIMERACHAMBATheme {


                }
            }
        }
    }

@Composable
fun CertificatingCourse (nombre: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
    )
    Text(
        text = "$nombre",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold

    )
    Text(text = "te preseno top 10 madrizas mas epicas del anime ")
}


@Composable
@Preview(showBackground = true)
fun CertificatingCoursePreview(){
    CertificatingCourse(nombre = "memo ")
}