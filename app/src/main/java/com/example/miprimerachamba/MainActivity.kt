package com.example.miprimerachamba
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miprimerachamba.ui.theme.MIPRIMERACHAMBATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MIPRIMERACHAMBATheme  {

            }
        }
    }
}

@Composable
fun CertificatingCourse(nombre:String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp),

        verticalArrangement = Arrangement.Center,
        //  horizontalAlignment = Alignment.CenterHorizontally
    ) {



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(id = R.drawable.avengersa), // Imagen del escudo izquierdo
                contentDescription = null,
                modifier = Modifier.size(50.dp) // Tamaño del escudo
            )
            Spacer(modifier = Modifier.width(25.dp))
            Text(
                text = "Academia de Heroes de SHIELD",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
//ola

            )
            Spacer(modifier = Modifier.width(25.dp))
            Image(
                painter = painterResource(id = R.drawable.shield), // Imagen del escudo derecho
                contentDescription = null,
                modifier = Modifier.size(50.dp) // Tamaño del escudo
            )



        }
        Box(

        ) {
            Image(
                painter =
                painterResource(id = R.drawable.logo),
                contentDescription = null,

                modifier = modifier.fillMaxWidth()

            )

            Text(
                text = "$nombre",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = modifier.fillMaxWidth()
            )
        }



        Text(
            text = "has successfully completed " +
                    "a 2 hours  course on")
    }
}

@Composable
@Preview(showBackground = true)
fun CertificatingCoursePreview(){

    CertificatingCourse(nombre = "Jesús Manuel Hernández García")
}
