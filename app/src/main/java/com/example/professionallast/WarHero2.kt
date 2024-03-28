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

class WarHero2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroWar2()

            }
        }

    @Composable
    fun HeroWar2() {
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
                                Intent(this@WarHero2, Tabs::class.java)
                            )
                        })
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = "Герои Локальных Войн",
                    color = Color.Yellow, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.size(20.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero2, Kobin::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_18), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Кобин Александр Иванович ",
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
                .clickable { startActivity(Intent(this@WarHero2, Zhantas::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_19), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Жолдинов Жантас Бахитжанович ",
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
                .clickable { startActivity(Intent(this@WarHero2, Bersenev::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_20), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Берсенев Роман Генрихович ",
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
                .clickable { startActivity(Intent(this@WarHero2, Zarov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_21), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Жаров Алексей Викторович ",
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
                .clickable { startActivity(Intent(this@WarHero2, Morozov::class.java)) }

                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_22), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Морозов Андрей Игоревич  ",
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
                .clickable { startActivity(Intent(this@WarHero2, Petrov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_23), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Петров Сергей Васильевич ",
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
                .clickable { startActivity(Intent(this@WarHero2, Ozhegov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_24), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Ожегов Сергей Анатольевич",
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
                .clickable { startActivity(Intent(this@WarHero2, Mustafin::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_25), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Мустафин Раис Рауфович ",
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
                .clickable { startActivity(Intent(this@WarHero2, Zelenko::class.java)) }

                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_26), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Зеленко Андрей Жаннович  ",
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
