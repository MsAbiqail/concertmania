package com.Abby.concertmania

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
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
import com.Abby.concertmania.ui.theme.ConcertManiaTheme

class RegisterActivvity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConcertManiaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    Reg()
                }
            }
        }
    }
}

@Composable
fun Reg(){
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }
    val context= LocalContext.current
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Black)) {
        Text(text = "ConcertMania",
            color=Color.Green,
            fontFamily = FontFamily.SansSerif
        )
        OutlinedTextField(value = name,
            onValueChange = {name=it},
            label={Text(text="Name")},

            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default ),
            keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = email,
            onValueChange = {email=it},
            label={Text(text="Email Address")},
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default ),
            keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = password,
        onValueChange = {password=it},
        label={Text(text="Enter Password")},
        modifier= Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default ),
        keyboardActions = KeyboardActions()
        )
        OutlinedTextField(value = confirmpassword,
            onValueChange = {confirmpassword=it},
            label={Text(text="Confirm Password")},
            modifier= Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Default ),
            keyboardActions = KeyboardActions()
        )
        Button(onClick = { /*TODO*/ } ,
            modifier = Modifier.fillMaxWidth())
        {
            Text(text = "Log in",
                color = Color.Magenta)

        }
        Button(onClick = {
            val  intent = Intent(context,MainActivity::class.java)
            context.startActivity(intent)
        }) {
            Text(text="Click to login")

        }


    }
    }

    @Preview
    @Composable
    private fun Registerprev() {
       Reg()
    }
