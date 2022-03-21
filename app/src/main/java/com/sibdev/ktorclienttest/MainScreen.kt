package com.sibdev.ktorclienttest.ui.theme

import android.util.Log
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sibdev.ktorclienttest.KtorClientRepo
import com.sibdev.ktorclienttest.MainScreenViewModel
import com.sibdev.ktorclienttest.UnsplashModel

@Composable
fun MainScreen(){
val vm = MainScreenViewModel()
    vm.loadPosts()
    var b by remember {
        mutableStateOf(value = listOf(UnsplashModel()))
    }
    LaunchedEffect(key1 = true){
       b = KtorClientRepo().getPosts()
        Log.d("images", b.toString())
    }
   LazyColumn{
       items(b){
           i->
           Spacer(modifier = Modifier.height(10.dp))
           AsyncImage(model = i.urls?.regular, contentDescription = null)
           Spacer(modifier = Modifier.height(10.dp))
           Divider()
       }
   }
}