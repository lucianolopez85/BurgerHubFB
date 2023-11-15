package com.example.burger_hub_fb.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.burger_hub_fb.data.repository.BurgerRepository
import com.example.burger_hub_fb.domain.converter.BurgerConverter
import com.example.burger_hub_fb.domain.usecase.BurgerUseCase
import com.example.burger_hub_fb.domain.vo.BurgerVO
import kotlinx.coroutines.launch
import javax.inject.Inject

class BurgerViewModel @Inject constructor(
    private val useCase: BurgerUseCase
) : ViewModel() {

    private val _listBurgers = MutableLiveData<List<BurgerVO>>()
    val listBurger: LiveData<List<BurgerVO>> = _listBurgers

    private val _burger = MutableLiveData<BurgerVO>()
    val burgerId: LiveData<BurgerVO> = _burger

    private val _burgerName = MutableLiveData<List<BurgerVO>>()
    val burgerName: LiveData<List<BurgerVO>> = _burgerName

    fun fetchListBurgers() {
        viewModelScope.launch {
            _listBurgers.value = useCase.getBurgers()
        }
    }

    fun getBurgerById(id: Int) {
        viewModelScope.launch {
            _burger.value = useCase.getBurgerById(id)
        }
    }

    fun getBurgerByName(name: String) {
        viewModelScope.launch {
            _burgerName.value = useCase.getBurgerByName(name)
        }
    }
}
