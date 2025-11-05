package com.example.jetpackcomposecrashcourse.remember_updated_state

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import kotlinx.coroutines.delay


@Composable
fun RememberUpdatedStateDemo(
    onTimeout: () -> Unit
){

    LaunchedEffect(true) {
        delay(3000L)
        onTimeout()
    }



}