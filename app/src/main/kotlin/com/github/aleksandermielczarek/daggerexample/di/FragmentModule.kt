package com.github.aleksandermielczarek.daggerexample.di

import com.github.aleksandermielczarek.daggerexample.ui.content.ContentFragment
import com.github.aleksandermielczarek.daggerexample.ui.content.ContentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
@Module
abstract class FragmentModule {

    @ContributesAndroidInjector(modules = [ContentModule::class])
    abstract fun bindContentFragment(): ContentFragment
}