package com.github.aleksandermielczarek.daggerexample.ui.content

import dagger.Binds
import dagger.Module

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
@Module
abstract class ContentModule {

    @Binds
    abstract fun bindView(fragment: ContentFragment): ContentContract.View

    @Binds
    abstract fun bindPresenter(presenter: ContentPresenter): ContentContract.Presenter
}