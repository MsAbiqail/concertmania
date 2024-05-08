
package com.Abby.concertmania.ui.theme.ConcertManiaTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SimpleListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleList()
        }
    }
}
private val namelist= mutableListOf("Erick","Victor","Kelly","John","Joan","Purity")

private val listModifier= Modifier
    .fillMaxSize()
    .background(Color.Cyan)
    .padding(30.dp)

private val textstyle=TextStyle(fontSize = 25.sp, color = Color.Red)

@Composable
fun SimpleList() {
    LazyColumn(modifier = listModifier){
        items(namelist){

                jina ->
            Text(text = jina, style = textstyle)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MyList() {
    SimpleList()
}
