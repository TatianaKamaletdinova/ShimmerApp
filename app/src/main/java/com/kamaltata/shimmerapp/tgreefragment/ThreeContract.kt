package com.kamaltata.shimmerapp.firstfragment

import com.kamaltata.shimmerapp.BasePresenter

interface ThreeContract {

    interface Presenter : BasePresenter<Screen> {
        fun requestData()
    }

    interface Screen {
        fun showData(data: List<String>)
    }
}