package com.example.jetpackcomposecrashcourse.side_effect

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

@Composable
fun SideEffectDemo(
    onNonComposeCounter: Int
){

    SideEffect {
        println("Called after every successful composition")
    }


}