package com.kamaltata.shimmerapp

interface BasePresenter<T> {
    var screen: T?
}

open class BasePresenterImpl<T> : BasePresenter<T> {
    override var screen: T? = null
}