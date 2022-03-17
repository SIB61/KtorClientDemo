package com.sibdev.ktorclienttest

import android.util.Log
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sibdev.ktorclienttest.KtorClientRepo
import com.sibdev.ktorclienttest.PostResponseModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainScreenViewModel : ViewModel() {
    private val repo = KtorClientRepo()
    var list = mutableStateListOf<PostResponseModel>()
    fun loadPosts() {
        viewModelScope.launch (Dispatchers.IO){
          // list = KtorClientRepo().getPosts()
        }
    }

}