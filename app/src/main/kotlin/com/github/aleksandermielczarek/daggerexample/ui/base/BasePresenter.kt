package com.github.aleksandermielczarek.daggerexample.ui.base

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
open class BasePresenter<out V : BaseContract.View>(protected val view: V) : BaseContract.View