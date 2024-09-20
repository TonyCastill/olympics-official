package com.example.olympicsofficial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.hoverable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.olympicsofficial.ui.theme.OlympicsOfficialTheme
import com.example.olympicsofficial.classes.Country

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OlympicsOfficialTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        BottomAppBar(
                            contentColor = Color.Black,
                            containerColor= Color.Black
                            //contentColor = MaterialTheme.colorScheme.primary,
                        ) {
                            Footer()
                        }
                    }) {
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.spacedBy(16.dp),
                    ) {
                        VerticalHorizontalScroll()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OlympicsOfficialTheme {
        Greeting("Android")
    }
}
@Preview(showBackground=true)
@Composable
fun Footer(){

        Row( modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black),
            horizontalArrangement = Arrangement.SpaceAround){
            val interactionSource = remember { MutableInteractionSource() }
            /*Button(
                onClick = { /*TODO*/ println("This is a debug message")},
                modifier = Modifier

                    .hoverable(interactionSource = interactionSource)
                    .focusable(interactionSource = interactionSource)
                    .clip(shape = RoundedCornerShape(150.dp)),
                //elevation = ButtonDefaults.elevation(0.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                )
            ) {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "Favorite Icon",
                    tint = Color.White,
                    modifier=Modifier.size(20.dp)

                )
            }*/
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp),
            ){
                Icon(//ImageVector.vectorResource(id =R.drawable.customfavorite),
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }

            /*Button(
                onClick = { /*TODO*/ println("This is a debug message")},
                modifier = Modifier

                    .hoverable(interactionSource = interactionSource)
                    .focusable(interactionSource = interactionSource)
                    .clip(shape = RoundedCornerShape(10.dp)),
                elevation = ButtonDefaults.elevation(0.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                )
            ) {


                Icon(
                    imageVector = Icons.Outlined.DateRange,
                    contentDescription = "Favorite Icon",
                    tint = Color.White,
                    modifier=Modifier.size(20.dp)

                )




            }*/
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp),
            ){
                Icon(//ImageVector.vectorResource(id =R.drawable.customfavorite),
                    imageVector = Icons.Outlined.DateRange,
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }
            /*Button(
                onClick = { /*TODO*/ println("This is a debug message")},
                modifier = Modifier
                    .hoverable(interactionSource = interactionSource)
                    .focusable(interactionSource = interactionSource)
                    .clip(shape = RoundedCornerShape(10.dp)),
                elevation = ButtonDefaults.elevation(0.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                )
            ) {


                Icon(
                    imageVector = ImageVector.vectorResource(id =R.drawable.medal),
                    contentDescription = "Favorite Icon",
                    tint = Color.White,
                    modifier=Modifier.size(20.dp)

                )




            }*/
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp),
            ){
                Icon(//ImageVector.vectorResource(id =R.drawable.customfavorite),
                    imageVector = ImageVector.vectorResource(id =R.drawable.medal),
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }

            /*Button(
                onClick = { /*TODO*/ println("This is a debug message")},
                modifier = Modifier

                    .hoverable(interactionSource = interactionSource)
                    .focusable(interactionSource = interactionSource)
                    .clip(shape = RoundedCornerShape(10.dp)),
                elevation = ButtonDefaults.elevation(0.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                )
            ) {


                Icon(
                    imageVector = ImageVector.vectorResource(id =R.drawable.camera),
                    contentDescription = "Favorite Icon",
                    tint = Color.White,
                    modifier=Modifier.size(20.dp)

                )




            }*/
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp),
            ){
                Icon(//ImageVector.vectorResource(id =R.drawable.customfavorite),
                    imageVector = ImageVector.vectorResource(id =R.drawable.camera),
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }

            /*Button(
                onClick = { /*TODO*/ println("This is a debug message")},
                modifier = Modifier

                    .hoverable(interactionSource = interactionSource)
                    .focusable(interactionSource = interactionSource)
                    .clip(shape = RoundedCornerShape(10.dp)),
                elevation = ButtonDefaults.elevation(0.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                )
            ) {


                Icon(
                    imageVector = ImageVector.vectorResource(id =R.drawable.video),
                    contentDescription = "Favorite Icon",
                    tint = Color.White,
                    modifier=Modifier.size(20.dp)

                )




            }*/
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp),
            ){
                Icon(//ImageVector.vectorResource(id =R.drawable.customfavorite),
                    imageVector = ImageVector.vectorResource(id =R.drawable.video),
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }
            /*Button(
                onClick = { /*TODO*/ println("This is a debug message")},
                modifier = Modifier
                    .hoverable(interactionSource = interactionSource)
                    .focusable(interactionSource = interactionSource)
                    .clip(shape = RoundedCornerShape(10.dp)),
                elevation = ButtonDefaults.elevation(0.dp),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Transparent
                )
            ) {


                Icon(
                    imageVector = ImageVector.vectorResource(id =R.drawable.lines),
                    contentDescription = "Favorite Icon",
                    tint = Color.White,
                    modifier=Modifier.size(20.dp)

                )




            }*/
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.size(20.dp),
            ){
                Icon(//ImageVector.vectorResource(id =R.drawable.customfavorite),
                    imageVector = ImageVector.vectorResource(id =R.drawable.lines),
                    contentDescription = "Settings",
                    tint = Color.White,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }
            /*Row(
                modifier=Modifier
                    .align(Alignment.Center)
            ){
                Icon(
                    imageVector = Icons.Outlined.Favorite,
                    contentDescription = "Favorite Icon",
                    tint = Color.White

                )
                Icon(
                    imageVector = Icons.Outlined.ArrowDropDown,
                    contentDescription = "Favorite Icon",
                    tint = Color.White
                )
            }*/
        }


}

@Preview(showBackground = true)
@Composable
fun VerticalHorizontalScroll(){ // Main function to draw everything, inside the surface


    var countries = listOf(
        Country("USA", 39, 41, 33, R.drawable.flag_of_usa),
        Country("CHN", 38, 32, 18, R.drawable.flag_of_china),
        Country("JPN", 27, 14, 17, R.drawable.flag_of_japan),
        Country("UK", 22, 21, 22, R.drawable.flag_of_uk),
        Country("MEX", 10, 11, 16, R.drawable.flag_of_mexico)
    )
    var myCountry = Country("MEX",1,2,3, R.drawable.flag_of_mexico)

    Column( //Main column to display all
        modifier = Modifier
            .fillMaxSize()
            .background(Color.DarkGray)
    ){

        // Title Medallas
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF4A72D8), // Yellow
                            Color(0xFF0C1A8B), // Yellow
                            Color(0xFF040D4E)  // Orange*/
                             // rgba(9,9,121,1)
                            /*Color(0xFF1EB0D4), // rgba(30,176,212,1)
                            Color(0xFF0D86A4), // rgba(13,134,164,1)
                            Color(0xFF20B6DA), // rgba(32,182,218,1)
                            Color(0xFF00D4FF),  // rgba(0,212,255,1
                            Color(0xFF090979),
                            Color(0xFF020024), // rgba(2,0,36,1)
                            Color(0xFF03012C), // rgba(3,1,44,1)
                            Color(0xFF03012E), // rgba(3,1,46,1)
                            */



                        ),

                    )
                    /* brush = Brush.linearGradient(
                         colors = listOf(
                             Color(0xFF020024), // rgba(2,0,36,1)
                             Color(0xFF03012C), // rgba(3,1,44,1)
                             Color(0xFF03012E), // rgba(3,1,46,1)
                             Color(0xFF090979), // rgba(9,9,121,1)
                             Color(0xFF1EB0D4), // rgba(30,176,212,1)
                             Color(0xFF0D86A4), // rgba(13,134,164,1)
                             Color(0xFF20B6DA), // rgba(32,182,218,1)
                             Color(0xFF00D4FF)  // rgba(0,212,255,1)
                         ),
                         start = Offset(0f, 0f), // Start from the left (top-left)
                         end = Offset(Float.POSITIVE_INFINITY, 0f)
                     )*/
                ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                text ="Medallas",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier=Modifier.padding(0.dp,50.dp)

            )

        }

        //Options
        Column(modifier=Modifier.background(color = Color.Black)){
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween // Arrange items at both ends

            )
            {
                Column(horizontalAlignment = Alignment.Start
                ){
                    Box( //Favorites
                        modifier= Modifier
                            .size(58.dp) // Total size of the container
                            .padding(5.dp) // Inner padding around the icon
                            .border(2.dp, Color.White),

                        ){
                        val interactionSource = remember { MutableInteractionSource() }

                        /*Button(
                            onClick = { /*TODO*/ println("This is a debug message")},
                            modifier = Modifier
                                .fillMaxSize()
                                .hoverable(interactionSource = interactionSource)
                                .focusable(interactionSource = interactionSource),
                            colors = ButtonDefaults.buttonColors(
                                //buttonColors=Color.White,
                                containerColor=Color.Red
                                //backgroundColor = Color.Transparent
                            )
                        ) {

                            Icon(
                                imageVector = ImageVector.vectorResource(id =R.drawable.customfavorite),
                                contentDescription = "Favorite Icon",
                                tint = Color.White,
                                //contentScale=ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .size(70.dp)



                            )

                        }*/
                        IconButton(
                            onClick = { /*TODO*/ },
                            modifier = Modifier.size(60.dp),
                        ){
                            Icon(ImageVector.vectorResource(id =R.drawable.customfavorite), contentDescription = "Settings",tint = Color.White,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .size(70.dp))
                        }
                        /*Row(
                            modifier=Modifier
                                .align(Alignment.Center)
                        ){
                            Icon(
                                imageVector = Icons.Outlined.Favorite,
                                contentDescription = "Favorite Icon",
                                tint = Color.White

                            )
                            Icon(
                                imageVector = Icons.Outlined.ArrowDropDown,
                                contentDescription = "Favorite Icon",
                                tint = Color.White
                            )
                        }*/

                    }
                }

                Row(){
                    Column(horizontalAlignment = Alignment.End) {
                        Box( //Favorites
                            modifier= Modifier
                                .size(58.dp) // Total size of the container
                                .padding(5.dp) // Inner padding around the icon
                                .border(2.dp, Color.White),

                            ) {
                            val interactionSource = remember { MutableInteractionSource() }



                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.size(60.dp),
                            ){
                                Icon(imageVector = Icons.Outlined.Add, contentDescription = "Settings",tint = Color.White
                                ,modifier = Modifier
                                        .fillMaxSize()
                                        .size(70.dp))
                            }
                            /*Button(
                                onClick = { /*TODO*/ println("This is a debug message")},
                                modifier = Modifier
                                    .fillMaxSize()
                                    .hoverable(interactionSource = interactionSource)
                                    .focusable(interactionSource = interactionSource),
                                colors = ButtonDefaults.buttonColors(
                                    //backgroundColor = Color.Transparent
                                    containerColor = Color.Transparent
                                )
                            ) {
                                Text(text="Hello")
                            }*/
                            /*Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Favorite Icon",
                                tint = Color.White,
                            )*/

                        }
                    }
                    Column(horizontalAlignment = Alignment.End) {
                        Box( //Favorites
                            modifier= Modifier
                                .size(58.dp) // Total size of the container
                                .padding(5.dp) // Inner padding around the icon
                                .border(2.dp, Color.White),

                            ){
                            val interactionSource = remember { MutableInteractionSource() }
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.size(60.dp),
                            ){
                                Icon(ImageVector.vectorResource(id =R.drawable.updown), contentDescription = "Settings",tint = Color.White)
                            }
                            /*Button(
                                onClick = { /*TODO*/ println("This is a debug message")},
                                modifier = Modifier
                                    .fillMaxSize()
                                    .hoverable(interactionSource = interactionSource)
                                    .focusable(interactionSource = interactionSource),
                                colors = ButtonDefaults.buttonColors(
                                    //backgroundColor = Color.Transparent
                                    containerColor=Color.Red
                                )
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(id =R.drawable.updown),
                                    contentDescription = "Favorite Icon",
                                    tint = Color.White,
                                    modifier = Modifier.size(30.dp)
                                )
                            }*/

                        }
                    }
                    Column(horizontalAlignment = Alignment.End) {
                        Box( //Favorites
                            modifier= Modifier
                                .size(58.dp) // Total size of the container
                                .padding(5.dp) // Inner padding around the icon
                                .border(2.dp, Color.White),

                            ){
                            val interactionSource = remember { MutableInteractionSource() }
                            IconButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier.size(60.dp),
                            ){
                                Icon(ImageVector.vectorResource(id =R.drawable.configuration), contentDescription = "Settings",tint = Color.White)
                            }
                            /*Button(
                                onClick = { /*TODO*/ println("This is a debug message")},
                                modifier = Modifier
                                    .fillMaxSize()
                                    .hoverable(interactionSource = interactionSource)
                                    .focusable(interactionSource = interactionSource),
                                colors = ButtonDefaults.buttonColors(
                                    //backgroundColor = Color.Transparent
                                    containerColor=Color.Red
                                )
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(id =R.drawable.configuration),
                                    contentDescription = "Favorite Icon",
                                    tint = Color.White,
                                    modifier = Modifier.size(30.dp)
                                )
                            }*/

                        }
                    }
                }



            }
        }

        //Marcador - Score
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(0.9f) // Set the width to 70% of the parent
                    .background(color = Color.DarkGray),
                horizontalArrangement = Arrangement.SpaceBetween // Arrange items at both ends
            ){
                //NPCs
                Row(
                    modifier= Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Text(text = "#",
                        fontSize = 20.sp,
                        color = Color.White,
                        modifier = Modifier.padding(0.dp,0.dp,10.dp,0.dp))
                    Text(text = "NPCs",
                        color = Color.White,
                        fontSize = 20.sp,)
                }

                //Medals
                Row(
                    modifier= Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ){

                    Image(
                        painter = painterResource(id = R.drawable.goldmedal) ,
                        contentDescription = "Custom SVG Icon",
                        modifier = Modifier
                            .size(20.dp) // Adjust the size as needed
                            .fillMaxWidth(0.25f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.silvermedal) ,
                        contentDescription = "Custom SVG Icon",
                        modifier = Modifier
                            .size(20.dp) // Adjust the size as needed
                            .fillMaxWidth(0.25f)
                    )

                    Image(
                        painter = painterResource(id = R.drawable.broncemedal) ,
                        contentDescription = "Custom SVG Icon",
                        modifier = Modifier
                            .size(20.dp) // Adjust the size as needed
                            .fillMaxWidth(0.25f)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.threemedals) ,
                        contentDescription = "Custom SVG Icon",
                        modifier = Modifier
                            .size(20.dp) // Adjust the size as needed
                            .fillMaxWidth(0.25f)
                    )
                    Spacer(modifier = Modifier.width(40.dp))
                }

            }
        }

        LazyColumn(modifier=Modifier.fillMaxHeight(1f)){ //You can scroll them to the bottom


            //Horizontal Scroll View
            /*item{
                LazyRow {
                    items(count=10){ //put items on it
                        Card( // Pattern that applies to all the 10 items
                          modifier = Modifier
                              .width(110.dp)
                              .height(120.dp)
                              .padding(10.dp, 5.dp, 5.dp, 0.dp)
                              .clip(RoundedCornerShape(10.dp)) // Like border radius
                              .background(Color.White),
                            elevation = 6.dp // adds a shadow

                        ){
                            Column(
                                modifier= Modifier
                                    .padding(5.dp),
                                horizontalAlignment=Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ){
                                //Continuar 4:49 https://www.youtube.com/watch?v=wL9mVkgeFys
                                Image(painter=painterResource(id = R.drawable.sushi),
                                    contentDescription = "sushi",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(CircleShape)
                                    )
                                Spacer(modifier = Modifier.padding(5.dp)) //Leaves some space

                                Text(
                                    text="Test",
                                    color=Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                    )

                            }

                        }
                    }
                    item {
                        Card( // Pattern that applies to all the 10 items
                            modifier = Modifier
                                .width(110.dp)
                                .height(120.dp)
                                .padding(10.dp, 5.dp, 5.dp, 0.dp)
                                .clip(RoundedCornerShape(10.dp)) // Like border radius
                                .background(Color.White),
                            elevation = 6.dp // adds a shadow

                        ){
                            Column( //Array of elements ordered vertically
                                modifier= Modifier
                                    .padding(5.dp),
                                horizontalAlignment=Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ){
                                //Continuar 4:49 https://www.youtube.com/watch?v=wL9mVkgeFys
                                Image(painter=painterResource(id = R.drawable.rings2),
                                    contentDescription = "sushi",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(60.dp)
                                        .clip(CircleShape)
                                )
                                Spacer(modifier = Modifier.padding(5.dp)) //Leaves some space

                                Text(
                                    text="Test",
                                    color=Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )

                            }

                        }
                    }
                }
            }*/

            itemsIndexed(countries){ index,country ->
                Row( // Pattern that applies to all the 10 items
                    modifier = Modifier
                        //.width(110.dp)
                        .height(100.dp)
                        .padding(10.dp, 5.dp, 5.dp, 0.dp)
                        .clip(RoundedCornerShape(10.dp)) // Like border radius
                        .fillMaxWidth()
                        .background(Color.Black),

                    //elevation = 6.dp // adds a shadow

                ) {
                    Column(
                        modifier = Modifier
                            .padding(10.dp)

                    ) {
                        Row{
                            Row(
                                modifier= Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth(0.5f),
                                verticalAlignment = Alignment.CenterVertically
                            ){

                                Text(text = "${index+1}",
                                    fontSize = 20.sp,
                                    color = Color.White,
                                    modifier = Modifier.padding(0.dp,0.dp,10.dp,0.dp))

                                Image(
                                    painter = painterResource(id = country.flag) ,
                                    contentDescription = "Custom SVG Icon",
                                    modifier = Modifier
                                        .padding(0.dp, 0.dp, 10.dp, 0.dp)
                                        .size(30.dp) // Adjust the size as needed


                                )

                                Text(text = country.name,
                                    color = Color.White,
                                    fontSize = 20.sp,)
                            }

                            Row(
                                modifier= Modifier
                                    .fillMaxHeight()
                                    .fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceEvenly
                            ){

                                Text(
                                    modifier = Modifier
                                        .size(20.dp) // Adjust the size as needed
                                        .fillMaxWidth(0.20f),
                                    text="${country.goldMedals}"
                                )
                                Text(
                                    modifier = Modifier
                                        .size(20.dp) // Adjust the size as needed
                                        .fillMaxWidth(0.20f),
                                    text="${country.silverMedals}"
                                )

                                Text(
                                    modifier = Modifier
                                        .size(20.dp) // Adjust the size as needed
                                        .fillMaxWidth(0.20f),
                                    text="${country.bronceMedals}"
                                )
                                Text(
                                    modifier = Modifier
                                        .size(20.dp) // Adjust the size as needed
                                        .fillMaxWidth(0.20f),
                                    text="${country.totalMedals()}"
                                )

                                val interactionSource = remember { MutableInteractionSource() }

                                /*Box( //Favorites
                                    modifier= Modifier
                                        .fillMaxWidth(0.20f)
                                        .size(10.dp) // Total size of the container
                                        .padding(5.dp) // Inner padding around the icon
                                        .border(2.dp, Color.Red),

                                    ){
                                    val interactionSource = remember { MutableInteractionSource() }

                                    Button(
                                        onClick = { /*TODO*/ println("This is a debug message")},
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .hoverable(interactionSource = interactionSource)
                                            .focusable(interactionSource = interactionSource),
                                        colors = ButtonDefaults.buttonColors(
                                            backgroundColor = Color.Transparent
                                        )
                                    ) {
                                        Icon(
                                            imageVector = Icons.Outlined.Add,
                                            contentDescription = "Favorite Icon",
                                            tint = Color.White,


                                            )
                                    }

                                }*/

                                IconButton(
                                    onClick = { /*TODO*/ },
                                    modifier = Modifier //.size(60.dp),
                                        .border(2.dp, Color.White),
                                ){
                                    Icon(imageVector = Icons.Outlined.Add, contentDescription = "Settings",tint = Color.White
                                        ,modifier = Modifier
                                            .size(10.dp))
                                }

                                /*Button(
                                    onClick = { /*TODO*/ println("This is a debug message")},
                                    modifier = Modifier
                                        .width(40.dp)
                                        //.fillMaxWidth(0.20f)
                                        /*.hoverable(interactionSource = interactionSource)
                                        .focusable(interactionSource = interactionSource)*/
                                        .border(2.dp, Color.White),
                                    //elevation = ButtonDefaults.elevation(0.dp), // No elevation
                                    colors = ButtonDefaults.buttonColors(
                                        //backgroundColor = Color.Transparent
                                        containerColor=Color.Transparent
                                    )
                                ) {
                                    Icon(
                                        imageVector = Icons.Outlined.Add,
                                        contentDescription = "Favorite Icon",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(10.dp)
                                    )
                                    //Text("Like", Modifier.background(Color.Black))
                                }*/
                            }

                        }




                        /*Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier

                        ){
                            Image(painter=painterResource(id = R.drawable.sushi),
                                contentDescription = "sushi",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(60.dp)
                                    .clip(CircleShape)

                            )
                            Spacer(modifier = Modifier.padding(5.dp)) //Leaves some space
                            Column {
                                Text(
                                    text="Test",
                                    color=Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 16.sp
                                )
                                Text(
                                    text = "sdfsadfdasf"
                                )
                            }

                        }*/
                    }
                }
            }
        }


    }

}