package com.example.m3_buttons

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m3_buttons.ui.theme.M3ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            M3ButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(
                            onClick = {
                                val intent = Intent(this@MainActivity, TextMaterialActivity::class.java)
                                startActivity(intent)
                            }
                        ) {
                            Text(text = "Text Material 3")
                        }
                        ElevatedButton(
                            onClick = {
                                val intent = Intent(this@MainActivity, SelectionActivity::class.java)
                                startActivity(intent)
                            }
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add to cart",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(
                                modifier = Modifier.width(8.dp)
                            )
                            Text(text = "Selection Activity")
                        }
                        FilledTonalButton(
                            onClick = {
                                val intent = Intent(this@MainActivity, TopAppBarActivity::class.java)
                                startActivity(intent)
                            }
                        ) {
                            Text(text = "Open in browser")
                        }
                        OutlinedButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Back")
                        }
                        TextButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Learn More")
                        }
                        ExtendedFloatingActionButton(
                            onClick = { /*TODO*/ }
                        ) {
                            Text(text = "Do Something")
                        }
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
    M3ButtonsTheme {
        Greeting("Android")
    }
}