package com.anniljing.jetpackviewmodel.model

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*

class DateWeatherViewModel(private val dataSource: DateWeatherDataSource) : ViewModel() {
    val currentTime = dataSource.getCurrentTime()
    val currentTimeTransformed = currentTime.switchMap {
        liveData {
            emit(timeStampToTime(it))
        }
    }

    val currentWeather: LiveData<String> = liveData {
        emitSource(dataSource.fetchWeather())
    }
    val cachedValue = dataSource.cachedData

    fun onRefresh() {
        // Launch a coroutine that reads from a remote data source and updates cache
        viewModelScope.launch {
            dataSource.fetchNewData()
        }
    }

    private suspend fun timeStampToTime(timestamp: Long): String {
        delay(500)
        val date = Date(timestamp)
        return date.toString()
    }
}

object DateWeatherVMFactory : ViewModelProvider.Factory{
    private val dataSource=DateWeatherDataSource(Dispatchers.IO)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return DateWeatherViewModel(dataSource) as T
    }

}
