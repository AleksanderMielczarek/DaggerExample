package com.github.aleksandermielczarek.daggerexample.ui.content

import com.github.aleksandermielczarek.daggerexample.ui.base.BaseContract

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
interface ContentContract {

    interface View : BaseContract.View {

        fun showName(name: String)
    }

    interface Presenter : BaseContract.Presenter {

        fun loadName()
    }
}