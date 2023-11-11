package com.onurdemir.composefoodapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.onurdemir.composefoodapp.entity.Yemekler
import com.onurdemir.composefoodapp.repository.YemeklerDaoRepository

class AnasayfaViewModel : ViewModel() {
    var yemeklerListesi = MutableLiveData<List<Yemekler>>()
    var yrepo = YemeklerDaoRepository()

    init {
        yemekleriYukle()
        yemeklerListesi = yrepo.yemekleriGetir()
    }

    fun yemekleriYukle() {
        yrepo.tumYemekleriAl()
    }
}