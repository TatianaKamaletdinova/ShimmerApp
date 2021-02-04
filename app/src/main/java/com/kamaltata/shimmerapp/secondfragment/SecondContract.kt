package com.kamaltata.shimmerapp.firstfragment

import com.kamaltata.shimmerapp.BasePresenter

interface SecondContract {

    interface Presenter : BasePresenter<Screen> {
        fun requestData()
    }

    interface Screen {
        fun showData(data: List<Pair<String, String>>)
    }
}