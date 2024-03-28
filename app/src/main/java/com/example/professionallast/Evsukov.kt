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

class Evsukov : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            evsukov()

        }
    }

    @Composable
    fun evsukov() {
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
                    painter = painterResource(id = R.drawable.img_13), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Евсюков Николай Андреевич",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Старший лейтенант, командир эскадрильи 66-го штурмового авиа\u00ADционного полка 266-й " +
                        "штурмовой авиационной дивизии 1-го штурмо\u00ADвого авиационного корпуса 5-й воздушной армии 2-го " +
                        "Украинского фронта. Родился в селе Сара Кувандыкского района. Получил непол\u00ADное среднее образование. С 1940 г. - в армии. Окончил Оренбургскую военную школу пилотов. С 1942 г. на фронте.\n" +
                        "\n" +
                        "Свершил более сотни боевых вылетов на бомбардировку стратеги\u00ADческих объектов, скоплений войск. " +
                        "Награжден орденами Ленина, Крас\u00ADного Знамени (1942 г.), Александра Невского (дважды), " +
                        "Отечественной войны 2 степени (1942 г.), Красной Звезды, медалями. Звание Героя Советского Союза присвоено" +
                        " Указом Президиума Верховного Совета СССР 1.7.44 г.\n" +
                        "\n" +
                        "Погиб 8 марта 1945 г. в автомобильной катастрофе, похоронен в г. Болеславец (Польша). " +
                        "Имя Героя присвоено средней школе села Но- вопокровка Кувандыкского района. " +
                        "Около школы установлен бюст Н.А. Евсюкова.",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}

