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

class Razvoliaev : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ruzvoliaev()
        }
    }

    @Composable
    fun ruzvoliaev() {
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
                    painter = painterResource(id = R.drawable.img_17), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Разволяев Иван Павлович ",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Гвардии капитан, командир 2-го сабельного эскадрона 61-го гвар\u00ADдейского кавалерийского полка 16-й гвардейской кавалерийской Черни\u00ADговской дивизии (1-й Белорусский фронт). Родился на станции Канчерово Кувандыкского района. Окончил 6 классов школы крестьянской молодежи в Кувандыке, работал на железной\" дороге, в колхозе \"Крас\u00ADный доброволец\". В 1936 году призван в армию. Участвовал в 1939 г., в походе советских войск на Западную Украину и в Западную Белорус\u00ADсию. Окончил кавалерийское училище в Минске (1940 г.), Саратовское бронетанковое училище (1941 г.).\n" +
                        "\n" +
                        "В годы Великой Отечественной войны воевал (с июня 1941 г.) на Западном, Юго-Западном, Сталинградском, Центральном, 1-м Бело\u00ADрусском фронтах. Участвовал в Сталинградской битве, освобождении Украины, в разгроме фашистов в Германии.\n" +
                        "\n" +
                        "И.П. Разволяев отличился в боях при освобождении Польши. 18 января 1945 года его эскадрон, находившийся в головном отряде, вброд и по льду преодолел реку Пилица, в числе первых ворвался в город Томашов. Эскадрон захватил станцию, освободил 13 эшелонов, подго\u00ADтовленных фашистами к отправке в Германию. Уничтожив отходящего противника, кавалеристы заняли населенные пункты Едлец и Голухов.\n" +
                        "\n" +
                        "Указом Президиума Верховного Совета СССР от 27 февраля 1945 года удостоен звания Героя Советского Союза.\n" +
                        "\n" +
                        "Принимал участие в параде Победы на Красной площади в Москве 24 июня 1945 года.\n" +
                        "\n" +
                        "После войны - командир стрелковой роты в Северо-Кавказском военном округе. В 1958 году вышел в запас в звании майора. Работал в Ростове инструктором по противопожарной профилактике при УВД горисполкома, старшим инженером в объединении “ Горизонт”.\n" +
                        "\n" +
                        "Похоронен в Ростове. На доме в Ростове, где жил Герой, установлена мемориальная доска.\n" +
                        "\n",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}

