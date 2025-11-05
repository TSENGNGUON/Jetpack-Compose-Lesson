package com.example.jetpackcomposecrashcourse.produce_state

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState

import kotlinx.coroutines.delay

@SuppressLint("ProduceStateDoesNotAssignValue")
@Composable
fun produceStateDemo(countUpTo: Int): State<Int>{
    return produceState(initialValue = 0) {
        while (value < countUpTo){
            delay(1000L)
            value++
        }
    }

}