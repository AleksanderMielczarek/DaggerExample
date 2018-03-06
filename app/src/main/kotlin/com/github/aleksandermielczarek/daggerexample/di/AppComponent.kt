package com.github.aleksandermielczarek.daggerexample.di

import com.github.aleksandermielczarek.daggerexample.DaggerExampleApplication
import com.github.aleksandermielczarek.daggerexample.usecase.UseCaseModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule


/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityModule::class,
    FragmentModule::class,
    UseCaseModule::class
])
interface AppComponent : AndroidInjector<DaggerExampleApplication>