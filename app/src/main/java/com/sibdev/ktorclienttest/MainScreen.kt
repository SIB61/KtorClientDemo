package com.sibdev.ktorclienttest.ui.theme

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sibdev.ktorclienttest.KtorClientRepo
import com.sibdev.ktorclienttest.MainScreenViewModel
import com.sibdev.ktorclienttest.UnsplashModel
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@Composable
fun MainScreen(){
val vm = MainScreenViewModel()
    vm.loadPosts()
    var b by remember {
        mutableStateOf(value = listOf(UnsplashModel()))
    }
    var s by remember {
        mutableStateOf("")
    }
    LaunchedEffect(key1 = true){
       b = KtorClientRepo().getImages()
        Log.d("images", b.toString())
    }
    val scope = rememberCoroutineScope()

   LazyColumn{
       item { Row() {
           TextField(value = s, onValueChange = {s=it})
           Button(onClick = {
               scope.launch {
                  b=KtorClientRepo().getSearchedImages(s)
               }
           }) {
               Text(text = "Search")
           }
       } }
       items(b){
           i->
           Spacer(modifier = Modifier.height(10.dp))
           AsyncImage(model = i.urls?.regular, contentDescription = null)
           Spacer(modifier = Modifier.height(10.dp))
           Divider()
       }
   }
}