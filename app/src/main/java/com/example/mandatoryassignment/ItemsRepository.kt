package com.example.mandatoryassignment


import android.content.ClipData.Item

import androidx.lifecycle.MutableLiveData

class ItemsRepository {


    private val url =" https://anbo-salesitems.azurewebsites.net/api/"
   // private val itemStore: ItemStoreService
    val itemsLiveData: MutableLiveData<List<Item>> = MutableLiveData<List<Item>>()
    val errorMessageLiveData: MutableLiveData<String> = MutableLiveData()
    val updateMessageLiveData: MutableLiveData<String> = MutableLiveData()

}