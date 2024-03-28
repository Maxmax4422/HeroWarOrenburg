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

class Gubin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            gubin()

        }
    }


    @Composable
    fun gubin() {
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
                    painter = painterResource(id = R.drawable.img_11), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Губин Михаил Александрович",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Командир роты, лейтенант 1120-го стрелкового полка 333-й стрел\u00ADковой дивизии " +
                        "6-й армии 3-го Украинского фронта. Родился в селе Ильинка Кувандыкского района. Окончил 6 классов," +
                        " работал тракто\u00ADристом, бригадиром.\n" +
                        "\n" +
                        "Участник Великой Отечественной войны с июня 1941 г. Отличился в бою 26 ноября 1943 г. " +
                        "к югу от села Алексеевская (Запорожский рай\u00ADон Запорожской области) на правом берегу Днепра." +
                        " Рота автоматчиков под его командованием отбила многократные вражеские контратаки и вынудила гитлеровцев отойти." +
                        " Погиб в бою 27 ноября 1943 г.\n" +
                        "\n" +
                        "Звание Героя Советского Союза присвоено Указом Президиума Верховного Совета СССР от 22 апреля 1944 г." +
                        " посмертно.\n" +
                        "\n" +
                        "Похоронен в селе Каневское Запорожской области. На могиле М.А. Губина установлен памятник." +
                        " Имя героя носила пионерская дружина восьмилетней школы поселка Краснощеково Кувандыкского района.",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}

