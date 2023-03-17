package com.example.mandatoryassignment

import android.content.ClipData.Item
import androidx.lifecycle.LiveData

class ItemsViewModel {

    private val repository = ItemsRepository()
   val ItemsLiveData: LiveData<List<Item>> = repository.ItemsLiveData
   val errorMessageLiveData: LiveData<String> = repository.errorMessageLiveData
    val updateMessageLiveData: LiveData<String> = repository.updateMessageLiveData

    init{
        reload()
    }
    fun reload() {
        repository.getItems()
    }
    operator fun get(index: Int): Item? {

        return itemsLiveData.value?.get(index)
    }

    fun add(item: Item) {
        repository.add(item)
    }

    fun delete(id: Int) {
        repository.delete(id)
    }

    fun update(item: Item: Item) {
        repository.update(item)
    }


}