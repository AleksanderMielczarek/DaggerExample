package com.github.aleksandermielczarek.daggerexample.di

import com.github.aleksandermielczarek.daggerexample.ui.home.HomeActivity
import com.github.aleksandermielczarek.daggerexample.ui.home.HomeModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
@Module
abstract class ActivityModule {

    @ContributesAndroidInjector(modules = [HomeModule::class])
    abstract fun bindHomeActivity(): HomeActivity
}