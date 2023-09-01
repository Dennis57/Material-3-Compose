package com.example.m3_buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.m3_buttons.ui.theme.M3ButtonsTheme

class TextMaterialActivity : ComponentActivity() {
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
                        var filledText by remember {
                            mutableStateOf("")
                        }
                        TextField(
                            value = filledText,
                            onValueChange = { filledText = it },
                            enabled = true,
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            label = {
                                Text(
                                    text = "Enter Your Weight"
                                )
                            },
                            placeholder = {
                                Text(
                                    text = "Weight"
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight"
                                )
                            },
                            suffix = {
                                Text(text = "KG")
                            },
                            supportingText = {
                                Text(text = "* required")
                            },
                            isError = false,
//                            visualTransformation = PasswordVisualTransformation()
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println(filledText)
                                }
                            ),
                            maxLines = 1
                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        var outlinedText by remember {
                            mutableStateOf("")
                        }
                        OutlinedTextField(
                            value = outlinedText,
                            onValueChange = { outlinedText = it },
                            enabled = true,
                            textStyle = LocalTextStyle.current.copy(
                                textAlign = TextAlign.Right
                            ),
                            label = {
                                Text(
                                    text = "Enter Your Weight"
                                )
                            },
                            placeholder = {
                                Text(
                                    text = "Weight"
                                )
                            },
                            leadingIcon = {
                                Icon(
                                    imageVector = Icons.Outlined.MonitorWeight,
                                    contentDescription = "Weight"
                                )
                            },
                            suffix = {
                                Text(text = "KG")
                            },
                            supportingText = {
                                Text(text = "* required")
                            },
                            isError = false,
//                            visualTransformation = PasswordVisualTransformation()
                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Decimal,
                                imeAction = ImeAction.Next
                            ),
                            keyboardActions = KeyboardActions(
                                onNext = {
                                    println(outlinedText)
                                }
                            ),
                            maxLines = 1
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    M3ButtonsTheme {
        Greeting2("Android")
    }
}