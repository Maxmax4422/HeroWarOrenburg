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

class Zhantas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            zantas()


        }
    }

    @Composable
    fun zantas() {
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
                    painter = painterResource(id = R.drawable.img_19), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(
                text = "Жолдинов Жантас Бахитжанович ",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                text ="Стрелок сводного полка Сибирского округа внутренних войск МВД России, рядовой. Родился в Оренбургской области. После школы работал в акционерном обществе «Красный чабан». В армию призван в декабре 1994 года Домбаровским РВК Оренбургской области. Службу проходил в Сибирском округе внутренних войск МВД России. В составе сводного полка выполнял задачи в Чеченской республике. 11.08.1996г. находился в группе прикрытия, которая обеспечивала коридор для вывода мирных жителей: стариков, детей. С перебитыми ногами прикрывал отход товарищей уничтожил 5 боевиков. Истекая кровью, он вел огонь по боевикам до тех пор, пока не кончились патроны. Бандиты не смогли его взять в плен, " +
                        "так как он отбивался штык-ножом. Отважный воин был расстрелян в упор.",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp)
            )


        }

    }
}
