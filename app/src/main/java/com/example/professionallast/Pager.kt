package com.example.professionallast

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
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
import com.example.professionallast.ui.theme.Pink40
import com.example.professionallast.ui.theme.ProfessionalLastTheme
import com.example.professionallast.ui.theme.Purple80
import kotlinx.coroutines.launch

class Pager : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ProfessionalLastTheme {
                // A surface container using the 'background' color from the theme

            }
            val pagerState = rememberPagerState()
            val coroutineScope = rememberCoroutineScope()
            Pager1(pagerState)



            Column (verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 60.dp)
                ){
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp),
                    horizontalArrangement = Arrangement.SpaceBetween) {
                    if (pagerState.currentPage !=2){ Button(onClick = { startActivity(Intent(this@Pager, Tabs::class.java)) },
                        colors = ButtonDefaults.buttonColors(Purple80),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .width(150.dp)
                            .height(50.dp),

                        ) {
                        Text(text = "Пропустить",
                            color = Color.Yellow,
                            fontSize = 14.sp)

                    }}



                    Button(onClick = { coroutineScope.launch {
                        when(pagerState.currentPage){
                            0->pagerState.animateScrollToPage(1)
                            1->pagerState.animateScrollToPage(2)
                            else -> startActivity(Intent(this@Pager, Tabs::class.java))
                        }
                    }},
                        colors = ButtonDefaults.buttonColors(Purple80),
                        shape = RoundedCornerShape(10.dp),
                        border = BorderStroke(1.dp, if (pagerState.currentPage == 2)Color.Yellow else Purple80),
                        modifier =  if (pagerState.currentPage != 2) Modifier
                            .width(150.dp)
                            .height(50.dp) else Modifier
                            .fillMaxWidth()
                            .height(46.dp)) {

                        Text(text = if (pagerState.currentPage == 0 || pagerState.currentPage ==1) "Далее" else "Начать",
                            color = Color.Yellow,
                            fontSize = 16.sp)

                    }



                }

            }
        }

    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun Pager1(pagerState:PagerState){
        HorizontalPager(pageCount = 3, state = pagerState) {page ->
            when(page){
                0->Screen1()
                1->Screen2()
                2->Screen3()
            }

        }

    }




    @Composable
    fun Screen1(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Purple80,
                        Color.Gray,


                        )
                )
            )
            .padding(top = 20.dp),
            verticalArrangement = Arrangement.Top, 
            horizontalAlignment = Alignment.CenterHorizontally) {

            Box(modifier = Modifier.height(240.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp)).padding(horizontal = 20.dp)){
                Image(painter = painterResource(id = R.drawable.img_5), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize())
            }

            Text(text = "Россия - страна героев",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp))
            Spacer(modifier = Modifier.size(15.dp))
            Text(text = " За пять минут уж снегом талым\n" +
                    "Шинель запорошилась вся.\n" +
                    "Он на земле лежит, усталым\n" +
                    "Движеньем руку занеся.\n" +
                    "Он мертв. Его никто не знает.\n" +
                    "Но мы еще на полпути,\n" +
                    "И слава мертвых окрыляет\n" +
                    "Тех, кто вперед решил идти.\n" +
                    "\n" +
                    "В нас есть суровая свобода:\n" +
                    "На слезы обрекая мать,\n" +
                    "Бессмертье своего народа\n" +
                    "Своею смертью покупать.  ",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp))

           

        }

    }
    @Composable
    fun Screen2(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Purple80, Color.Gray)))
            .padding(top = 20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {

            Box(modifier = Modifier.height(240.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp)).padding(horizontal = 20.dp)){
                Image(painter = painterResource(id = R.drawable.img_6), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize())
            }
            Spacer(modifier = Modifier.size(30.dp))
            Text(text = "Оренбургская область ",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp))
            Spacer(modifier = Modifier.size(15.dp))
            Text(text = "Оренбургская область – один из крупнейших регионов Российской Федерации, " +
                    "входящий в состав Приволжского федерального округа Российской Федерации." ,
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp))



        }

    }
    @Composable
    fun Screen3(){
        Column(modifier = Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Purple80, Color.Gray)))
            .padding(top = 20.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.height(240.dp).fillMaxWidth().clip(RoundedCornerShape(10.dp))){
                Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "",
                    modifier = Modifier
                        .fillMaxSize())
            }


            Spacer(modifier = Modifier.size(30.dp))
            Text(text = "Кувандык",
                color = Color.White,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 40.dp))
            Spacer(modifier = Modifier.size(15.dp))
            Text(text = "Куванды́к — город Оренбургской области, является административным центром Кувандыкского района. " +
                    "Город располагается в в 100 километрах от Орска и 200 километрах от Оренбурга, в долине реки Сакмара и окружён отрогами Губерлинских гор. " +
                    "Кувандык с башкирского языка переводится «долина счастья». ",
                color = Color.White,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 30.dp))



        }

    }
}
