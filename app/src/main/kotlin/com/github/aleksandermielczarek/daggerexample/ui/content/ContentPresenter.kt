package com.github.aleksandermielczarek.daggerexample.ui.content

import com.github.aleksandermielczarek.daggerexample.ui.base.BasePresenter
import com.github.aleksandermielczarek.daggerexample.usecase.name.GetNameUseCase
import javax.inject.Inject

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
class ContentPresenter @Inject constructor(
        view: ContentContract.View,
        private val getName: GetNameUseCase
) : BasePresenter<ContentContract.View>(view), ContentContract.Presenter {

    override fun loadName() {
        view.showName(getName.getName(this))
    }

}