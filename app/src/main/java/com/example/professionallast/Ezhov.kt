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

class Ezhov : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ezhov()

        }
    }

    @Composable
    fun ezhov() {
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
                    painter = painterResource(id = R.drawable.img_14), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Ежов Николай Герасимович ",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text = "Сержант, командир орудия 571-го артиллерийского полка 154-й стрелковой дивизии 2-й гвардейской армии 3-го Белорусского фронта . Родился в селе Рамазаново Кувандыкского района. Окончил семь классов в селе Ибрагимово, работал электриком на Медногорском медно-сер\u00ADном комбинате и на Рамазановской насосной станции этого комбина\u00ADта.\n" +
                        "\n" +
                        "18 июня 1941 года призван в армию. На фронте с 1941 г. Член КПСС с 1944 г. Во время ожесточенных боев в 30 километрах к востоку от польского города Бранево 1 марта 1945 г. участвовал в отражении шести контратак фашистов. Будучи раненым не оставил поле боя, за\u00ADменил наводчика, который выбыл из строя, и продолжал ведение огня по,танкам и пехоте противника. В этом бою погиб.\n" +
                        "\n" +
                        "Награжден орденами Ленина, Красной Звезды, Славы 3-й степени, медалями. Звание Героя Советского Союза присвоено посмертно 29 июня 1945 г. Указом Президиума Верховного Совета СССР.\n" +
                        "\n" +
                        "Похоронен в братской могиле в городе Бранево (Польша). В селе Ибрагимово и у центральной проходной Медногорского медно-серно\u00ADго комбината установлены памятники Герою, его именем названа ули\u00ADца " +
                        "в Медногорске, на одном из домов которой установлена мемориаль\u00ADная доска.",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}

