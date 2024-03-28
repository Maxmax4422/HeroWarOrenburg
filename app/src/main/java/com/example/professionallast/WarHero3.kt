package com.example.professionallast

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.professionallast.ui.theme.ProfessionalLastTheme
import com.example.professionallast.ui.theme.Purple80
import com.example.professionallast.ui.theme.PurpleGrey80

class WarHero3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroWar3()

        }
    }
    @Composable
    fun HeroWar3() {
        Column(verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color.Gray,
                            Purple80
                        )
                    )
                )
                .padding(top = 40.dp)
                .padding(horizontal = 20.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically){
                Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = "",
                    tint = Color.Yellow,
                    modifier = Modifier
                        .clip(shape = RoundedCornerShape(10.dp))
                        .clickable {
                            startActivity(
                                Intent(this@WarHero3, Tabs::class.java)
                            )
                        })
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = "Герои Специальной военной операции",
                    color = Color.Yellow, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.size(20.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Struev::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_27), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Антон Струев ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Hamsin::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_28), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Айдар Робертович Хамзин",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Raskatov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_29), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Раскатов Александр",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Liholetov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_30), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Лихолетов Андрей Владимирович",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Muhtubaev::class.java)) }

                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_31), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Мухтубаев Айболат  ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Tumishev::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_32), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Тумишев Еламан",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Ozerov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_33), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Озеров Артем",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Samuratov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_34), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Самуратов Айват",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero3, Denis::class.java)) }

                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_35), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Атнагулов Денис ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }

        }



    }
}

