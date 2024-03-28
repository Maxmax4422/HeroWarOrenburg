package com.example.professionallast

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professionallast.ui.theme.Pink40
import com.example.professionallast.ui.theme.ProfessionalLastTheme
import com.example.professionallast.ui.theme.Purple80

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfessionalLastTheme {
                // A surface container using the 'background' color from the theme
                
            }
            Handler().postDelayed({startActivity(Intent(this@MainActivity, Pager::class.java))},  3000)
            Splash()
        }



    }
    
    @Composable
    fun Splash(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Purple80),
            verticalArrangement = Arrangement.Center, 
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.tank), contentDescription = "",
                modifier = Modifier
                    .width(450.dp)
                    .height(250.dp))
            Spacer(modifier = Modifier.size(20.dp))

            Text(text = "Герои Оренбуржья",
                fontSize = 30.sp,
                color = Color.Yellow,
                )
            
        }
    }
}

