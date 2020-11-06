package com.example.madlevel6task1.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.madlevel6task1.models.ColorItem
import com.example.madlevel6task1.repository.ColorRepository

class ColorViewModel: ViewModel() {
    private val colorRepository: ColorRepository = ColorRepository()

    val colorItems: LiveData<List<ColorItem>>
        get() = _colorItems

    private val _colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorRepository.getColorItems()
    }
}