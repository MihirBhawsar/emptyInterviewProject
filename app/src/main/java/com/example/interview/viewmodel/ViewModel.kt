package com.example.interview.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.interview.repository.Repository
import kotlinx.coroutines.launch

class ViewModel(private val repository: Repository) : ViewModel() {


}
