package com.github.aleksandermielczarek.daggerexample

import com.github.aleksandermielczarek.daggerexample.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication


/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
class DaggerExampleApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder()
                .build()
    }
}