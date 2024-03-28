package com.example.professionallast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professionallast.ui.theme.ProfessionalLastTheme
import com.example.professionallast.ui.theme.Purple80

class Raskatov : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            raskatov()

        }
    }

    @Composable
    fun raskatov() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(Brush.verticalGradient(listOf(Purple80, Color.Gray)))
                .padding(top = 20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .height(240.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp))
                    .padding(horizontal = 20.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_29), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Раскатов Александр",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text ="Звание: Сержант\n" +
                        "Воинская должность: старший стрелок\n" +
                        "Регион: Оренбургская область\n" +
                        "Населенный пункт: посёлок Адамовка\n" +
                        "Дата рождения: 11.12.1981\n" +
                        "Дата смерти: 02.11.2023\n" +
                        "Ушел добровольцем 07.09.2022г. Погиб 02.11.2023г. в боях за Авдеевку ДНР. " +
                        "Вынес 10 раненых товарищей с поля боя. Сам погиб в штурме под Крсногоровкой.",
                fontSize = 16.sp,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(horizontal = 30.dp),
                color = Color.White
            )


        }

    }
}

