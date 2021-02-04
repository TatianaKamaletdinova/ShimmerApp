package com.kamaltata.shimmerapp.secondfragment

import android.os.Handler
import android.os.Looper
import android.util.Log
import com.kamaltata.shimmerapp.BasePresenterImpl
import com.kamaltata.shimmerapp.firstfragment.SecondContract
import kotlin.concurrent.thread

class SecondPresenter : BasePresenterImpl<SecondContract.Screen>(), SecondContract.Presenter {

    override fun requestData() {
        thread(true) {
            val data = mutableListOf<Pair<String, String>>()
            for (i in 0..20) {
                Thread.sleep(100)  //имитация загрузки из сети
                data.add(Pair("Данные $i", "Описание $i"))
            }
            Handler(Looper.getMainLooper()).post {
                screen?.showData(data)
            }
        }
    }
}