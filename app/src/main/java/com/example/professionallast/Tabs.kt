package com.example.professionallast

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Icon
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
import androidx.compose.ui.viewinterop.AndroidView
import com.example.professionallast.ui.theme.Pink40
import com.example.professionallast.ui.theme.ProfessionalLastTheme
import com.example.professionallast.ui.theme.Purple80
import com.example.professionallast.ui.theme.PurpleGrey80
import kotlinx.coroutines.launch

class Tabs : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val pagerState = rememberPagerState()
            val coroutineScope = rememberCoroutineScope()
            PagerTab(pagerState)
            Column(verticalArrangement = Arrangement.Bottom, modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 15.dp)
                .padding(horizontal = 15.dp)) {
                Box(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 1.dp)
                    .clip(shape = RoundedCornerShape(10.dp)),
                    ){
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .background(Purple80),
                        horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                            .padding(start = 20.dp)
                            .clickable {
                                coroutineScope.launch {
                                    when (pagerState.currentPage) {
                                        0 -> pagerState.animateScrollToPage(0)
                                        1 -> pagerState.animateScrollToPage(0)
                                        2 -> pagerState.animateScrollToPage(0)


                                    }
                                }
                            }) {
                            Icon(imageVector = Icons.Default.Home, contentDescription ="",
                                tint = if (pagerState.currentPage ==0) Color.Yellow else Color.Gray)
                            Text(text = "Главная", fontSize = 12.sp,
                                color = if (pagerState.currentPage ==0) Color.Yellow else Color.Gray)

                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .clickable {
                                    coroutineScope.launch {
                                        when (pagerState.currentPage) {
                                            0 -> pagerState.animateScrollToPage(1)
                                            1 -> pagerState.animateScrollToPage(1)
                                            2 -> pagerState.animateScrollToPage(1)
                                        }
                                    }
                                }) {
                            Icon(imageVector = Icons.Default.Email, contentDescription ="",
                                tint = if (pagerState.currentPage ==1) Color.Yellow else Color.Gray)
                            Text(text = "Обращение", fontSize = 12.sp,
                                color = if (pagerState.currentPage ==1) Color.Yellow else Color.Gray)

                        }
                        Column(horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier
                                .padding(end = 20.dp)
                                .clickable {
                                    coroutineScope.launch {
                                        when (pagerState.currentPage) {
                                            0 -> pagerState.animateScrollToPage(2)
                                            1 -> pagerState.animateScrollToPage(2)
                                            2 -> pagerState.animateScrollToPage(2)
                                        }
                                    }
                                }) {
                            Icon(imageVector = Icons.Default.Favorite, contentDescription ="" ,
                                tint = if (pagerState.currentPage ==2) Color.Yellow else Color.Gray)
                            Text(text = "О программе", fontSize = 12.sp,
                                color = if (pagerState.currentPage ==2) Color.Yellow else Color.Gray)

                        }


                    }
                }


            }

        }
    }

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun PagerTab(pagerState:PagerState) {
        HorizontalPager(pageCount = 3, state = pagerState) {page->
            when(page){
                0->ScreenHome()
                1->ScreenMessage()
                2->ScreenFavorite()
            }

        }


    }


    @Composable
    fun ScreenHome() {
        Column(verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(Brush.verticalGradient(listOf(Purple80, Color.Gray)))
                .padding(top = 30.dp)) {
            Image(painter = painterResource(id = R.drawable.img_4), contentDescription ="",
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                    .clickable { startActivity(Intent(this@Tabs, WarHero1::class.java)) }
                    .clip(shape = RoundedCornerShape(10.dp)))

            Text(text = "Герои Великой Отечественной войны",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 16.sp,
                color = Color.White)
            Spacer(modifier = Modifier.size(20.dp))

            Image(painter = painterResource(id = R.drawable.img_10), contentDescription ="",
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .clickable { startActivity(Intent(this@Tabs, WarHero2::class.java)) }
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(10.dp)))

            Text(text = "Герои Локальных войн",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 16.sp,
                color = Color.White)
            Spacer(modifier = Modifier.size(20.dp))
            Image(painter = painterResource(id = R.drawable.img_9), contentDescription ="",
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .clickable { startActivity(Intent(this@Tabs, WarHero3::class.java)) }
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(10.dp)))

            Text(text = "Герои СВО",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 16.sp,
                color = Color.White)

        }

    }

    @Composable
    fun ScreenMessage() {
        val url = "https://docs.google.com/forms/d/e/1FAIpQLSdRaYbGkAm2g4cNzYAzLBLnVuE8XxiiuYl_OlmeHiZKtTjJMA/viewform"
        AndroidView(factory = {
            WebView(it).apply {
                layoutParams = ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                )
                webViewClient = WebViewClient()
                loadUrl(url)
            }
        },
            update = {
                    it.loadUrl(url)
            })

    }
    @Composable
    fun ScreenFavorite() {
        Column(verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Purple80,
                            Color.Gray
                        )
                    )
                )
                .padding(top = 30.dp)) {
            Image(painter = painterResource(id = R.drawable.tank), contentDescription ="",
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(shape = RoundedCornerShape(10.dp)))
            Spacer(modifier = Modifier.size(20.dp))

            Text(text = "Приложение \" Герои Оренбуржья\" будет направлено на ознакомление каждого гражданина с настоящими героями нашей страны,  " +
                    "проживавшими Оренбургской области ",
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 16.sp, 
                color = Color.White)
            
            Spacer(modifier = Modifier.size(40.dp))
            Text(text = "Обращение к разработчикам: maximlicukov@gmail.com",
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(horizontal = 20.dp),
                fontSize = 16.sp, 
                color = Color.White)

        }

    }
}
