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

class Davidov : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            davidov()

        }
    }

    @Composable
    fun davidov() {
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
                    painter = painterResource(id = R.drawable.img_12), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Давыдов Павел Федорович",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Гвардии подполковник, заместитель командира 140-го гвардейско\u00ADго стрелкового полка по политической части 47-й гвардейской стрелко\u00ADвой дивизии 8-й гвардейской армии 1-го Белорусского фронта. Родил\u00ADся в селе Верхняя Платовка Новосергиевского района в крестьянской семье. Окончил 7 классов, батрачил, трудился на железной дороге. В 1924 - 27 годах служил в Красной Армии, участвовал в ликвидации басмачей в Средней Азии. Работал на станции Кувандык помощником машиниста, а затем машинистом паровоза. Был избран секретарем парт\u00ADийной организации железнодорожного узла, потом секретарем Куван\u00ADдыкского райкома партии. Окончил областную партшколу.\n" +
                        "\n" +
                        "В 1941 г. призван в армию и направлен в военно-политическое училище. С марта 1942 г. - на фронте. С передовым батальоном форсировал реку Одер близ города Кюстрин. Противник бросил на участок обороны около сорока танков. При личном участии Давыдова были уничтожены сотни гитлеровцев, 12 танков и 40 бронетранспортеров, а остальные обращены в бегство. В боях за овладение высотой в районе города Зеелов в апреле 1945 г., когда выбыл из строя командир, Давыдов принял командование пол\u00ADком на себя и во главе полка форсировал реку Шпре.\n" +
                        "\n" +
                        "\n" +
                        "В 1946 г. демобилизовался в Кувандык. Был на партийной, советс\u00ADкой работе, работал председателем Кувандыкского райисполкома, за\u00ADведующим райорсом, зав. столовой райпотребсоюза.\n" +
                        "\n" +
                        "Награжден орденами Ленина, Красного Знамени, Отечественной во\u00ADйны 1 степени (2) и 2 степени, Красной Звезды (2), медалями. Звание Героя Советского Союза присвоено Указом Президиума Верховного Со\u00ADвета СССР от 15 мая 1946 г.\n" +
                        "\n" +
                        "Последние годы жил в Орске, был председателем штаба ветеранов Советского района.\n" +
                        "\n" +
                        " \n" +
                        "\n ",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}

