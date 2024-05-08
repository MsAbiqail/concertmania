package com.Abby.concertmania

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Abby.concertmania.ui.theme.ConcertManiaTheme
import com.Abby.concertmania.ui.theme.ConcertManiaTheme.SimpleListActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConcertManiaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
                    Register()
                }
            }
        }
    }
}
@Composable
fun Register(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var context = LocalContext.current

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
            .background(Color.DarkGray)
    ){
        Text(
            text ="ConcertMania",
            color=Color.Blue,
            fontSize = 39.sp,
            fontFamily = FontFamily.Serif
            )
        OutlinedTextField(value =email ,
            onValueChange ={email=it},
            label={Text(text="email address")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription ="Email" )},
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default),
            keyboardActions = KeyboardActions()
            )
    OutlinedTextField(value = password,
        onValueChange ={password=it},
        label={Text(text="Password")},
        modifier= Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default),
        keyboardActions = KeyboardActions()
    )
 Button(onClick = { /*TODO*/ },
     modifier = Modifier.fillMaxWidth()) {
     Text(text = "Login",
         color=Color.Magenta
     )
 }
 Button(onClick = {
     val  intent = Intent(context,RegisterActivvity::class.java)
     context.startActivity(intent)
 }) {
     Text(text="Click to register")

 }
        Button(onClick = {
            val  intent = Intent(context,IntentActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text="Intent")}
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val  intent = Intent(context,CalculatorActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text="Calculator")}
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val  intent = Intent(context,SimpleListActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text="SimpleList")}
        Button(onClick = {
            val  intent = Intent(context,CustomListActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text="CustomList")}

    }
}
@Preview
@Composable
private fun Loginprev(){
    Register()
}