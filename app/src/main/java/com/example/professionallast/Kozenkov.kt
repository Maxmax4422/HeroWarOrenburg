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

class Kozenkov : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            kozenkov()

        }
    }

    @Composable
    fun kozenkov() {
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
                    painter = painterResource(id = R.drawable.img_15), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Козенков Василий Георгиевич",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Гвардии старший лейтенант, командир эскадрильи 136-го гвардей\u00ADского штурмового авиационного полка 1-й гвардейской штурмовой ави\u00ADационной дивизии 1-й воздушной армии 3-го Белорусского фронта. Родился в Кувандыке в семье рабочего. Учился в Кувандыкской желез\u00ADнодорожной школе. С 1934 года жил в Актюбинске : окончил 7 классов, аэроклуб, школу ФЗУ, работал на строительстве завода ферросплавов. В армии с 1942 г. Окончил военную авиационную школу пилотов в Актюбинске. На фронте с октября 1942 г. К ноябрю 1944 г. совершил на само\u00ADлете У-2 - 115 боевых вылетов на штурмовку скопления войск, укреп\u00ADлений противника. Всего на его счету 308 боевых вылетов. 7 апреля 1945 г. при штурме Кеннигсберга совершил огненный таран, направив свой горящий самолет на здание артиллерийского завода “Остверке“. Награжден орденами Ленина, Красного Знамени (4), Александра Невского, Отечественной войны 1-й степени, медалями. Звание Героя Советского Союза присвоено Указом Президиума Верховного Совета СССР от 19 апреля 1945 г. посмертно. Имя Героя носит улица в" +
                        " Калининграде, большой морозильный рыболовный траулер Калининградского управления рыбной промыш\u00ADленности.",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}

