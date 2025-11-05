package com.example.jetpackcomposecrashcourse.derived_state_of

import android.annotation.SuppressLint
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@SuppressLint("UnrememberedMutableState")
@Composable
fun DerivedStateOfDemo(){
    var counter by remember {
        mutableStateOf(0)
    }

    val counterText by derivedStateOf {  "The counter is $counter" }
    Button(
        onClick = {counter++}
    ) {
        Text(text = counterText)
    }
}