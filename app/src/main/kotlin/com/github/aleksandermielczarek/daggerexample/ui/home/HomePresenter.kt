package com.github.aleksandermielczarek.daggerexample.ui.home

import com.github.aleksandermielczarek.daggerexample.ui.base.BasePresenter
import com.github.aleksandermielczarek.daggerexample.usecase.name.GetNameUseCase
import javax.inject.Inject

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
class HomePresenter @Inject constructor(
        view: HomeContract.View,
        private val getName: GetNameUseCase
) : BasePresenter<HomeContract.View>(view), HomeContract.Presenter {

    override fun loadName() {
        view.showName(getName.getName(this))
    }
}