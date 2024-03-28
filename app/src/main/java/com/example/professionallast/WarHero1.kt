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
import androidx.compose.foundation.layout.Box
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

class WarHero1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeroWar1()

        }
    }


    @Composable
    fun HeroWar1() {
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
                                Intent(this@WarHero1, Tabs::class.java)
                            )
                        })
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = "Герои Великой Отечественной войны",
                    color = Color.Yellow, fontSize = 16.sp)
            }

            Spacer(modifier = Modifier.size(20.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Grebennikov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, 
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {
                     
                    Image(painter = painterResource(id = R.drawable.img_8), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Борис Иванович Гребенников",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1924 - 1944)",
                            fontSize = 14.sp, color = Color.White)
                    }
                    

                    
                }

                

            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Gubin::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_11), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Губин Михаил Александрович ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1915 - 1943)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Gorban::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_7), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Горбань Василий Моисеевич",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1918 - 1977)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Davidov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_12), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Давыдов Павел Федорович",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1902 - 1994)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Evsukov::class.java)) }

                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_13), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Евсюков Николай Андреевич ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1921 - 1945)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Ezhov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_14), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Ежов Николай Герасимович",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1922 - 1945)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Kozenkov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_15), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Козенков Василий Георгиевич ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1924 - 1945)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Nazarov::class.java)) }
                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_16), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Назаров Иван Михайлович",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1922 - 1978)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(90.dp)
                .clickable { startActivity(Intent(this@WarHero1, Razvoliaev::class.java)) }

                .padding(horizontal = 10.dp),
                colors = CardDefaults.cardColors(PurpleGrey80),
                border = BorderStroke(1.dp, Color.Black)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .padding(horizontal = 15.dp)) {

                    Image(painter = painterResource(id = R.drawable.img_17), contentDescription ="",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Black, CircleShape))
                    Spacer(modifier = Modifier.size(15.dp))
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Разволяев Иван Павлович ",
                            fontSize = 16.sp,
                            color = Color.White)
                        Text(text = "(1915 - 1981)",
                            fontSize = 14.sp, color = Color.White)
                    }



                }



            }

            }



        }

    }
