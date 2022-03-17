package com.sibdev.ktorclienttest.ui.theme

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.sibdev.ktorclienttest.KtorClientRepo
import com.sibdev.ktorclienttest.MainScreenViewModel
import com.sibdev.ktorclienttest.PostResponseModel

@Composable
fun MainScreen(){
val vm = MainScreenViewModel()
    vm.loadPosts()
    var b by remember {
        mutableStateOf(value = listOf(PostResponseModel("",0,"",0)))
    }
    LaunchedEffect(key1 = true){
       b = KtorClientRepo().getPosts()
    }
   LazyColumn{
       items(b){
           i->
           Spacer(modifier = Modifier.height(10.dp))
           Text(text = i.toString())
           Spacer(modifier = Modifier.height(10.dp))
           Divider()
       }
   }
}