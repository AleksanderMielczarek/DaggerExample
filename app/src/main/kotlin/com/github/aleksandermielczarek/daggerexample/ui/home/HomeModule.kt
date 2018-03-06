package com.github.aleksandermielczarek.daggerexample.ui.home

import dagger.Binds
import dagger.Module

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
@Module
abstract class HomeModule {

    @Binds
    abstract fun bindView(activity: HomeActivity): HomeContract.View

    @Binds
    abstract fun bindPresenter(presenter: HomePresenter): HomeContract.Presenter
}