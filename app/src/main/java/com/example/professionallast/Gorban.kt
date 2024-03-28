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

class Gorban : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            gorban()

        }
    }

    @Composable
    fun gorban() {
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
                    painter = painterResource(id = R.drawable.img_7), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Горбань Василий Моисеевич",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Майор, командир батальона 152-й танковой бригады (8-я армия, Ленинградский фронт)." +
                        " Родился в селе Федосеевка Кувандыкского рай\u00ADона в семье крестьянина. " +
                        "Окончил Орское педагогическое училище. Работал в совхозе “Акжарский” Домбаровского района комбайнером." +
                        " В армии с 1937 года. Окончил Саратовское танковое училище (1939 г.). " +
                        "Участвовал в советско-финляндской войне.\n" +
                        "\n" +
                        "С начала Великой Отечественной - на фронте. Отличился 17-26 сентября 1944 г." +
                        " в ходе прорыва обороны врага севернее Тарту и в боях за освобождение Таллина и порта Хаапсалу." +
                        " Передовой танковый отряд под его командованием уничтожил несколько бронетранспортеров, 2 штурмовых орудия," +
                        " более 150 гитлеровцев.\n" +
                        "\n" +
                        "Окончил военную академию генштаба (1956 г.). Занимал руководя\u00ADщие посты в Киевском военном округе," +
                        " в штабе Объединенных воору\u00ADженных сил стран Варшавского Договора. Генерал-лейтенант танковых войск." +
                        " Награжден орденами Ленина (2), Красного Знамени (2), Суво\u00ADрова 3-й степени, Александра Невского," +
                        " Отечественной войны 1-й сте\u00ADпени (2), Отечественной войны 2-й степени, Красной Звезды (2), медалями. " +
                        "Звания Героя Советского Союза удостоен Указом Президи\u00ADума Верховного Совета СССР от 24 марта 1945 г." +
                        " Похоронен в Москве.",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}
