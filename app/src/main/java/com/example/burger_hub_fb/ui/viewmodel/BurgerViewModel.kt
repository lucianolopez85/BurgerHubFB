package com.example.burger_hub_fb.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.burger_hub_fb.data.repository.BurgerRepository
import com.example.burger_hub_fb.domain.converter.BurgerConverter
import com.example.burger_hub_fb.domain.vo.BurgerVO
import javax.inject.Inject

class BurgerViewModel @Inject constructor(
    private val repository: BurgerRepository,
    private val converter: BurgerConverter
): ViewModel() {

    private val _listBurgers = MutableLiveData<List<BurgerVO>>()
    val listBurger: LiveData<List<BurgerVO>> = _listBurgers



}