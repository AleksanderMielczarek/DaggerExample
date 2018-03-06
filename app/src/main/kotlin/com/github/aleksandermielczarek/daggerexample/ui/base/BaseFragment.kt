package com.github.aleksandermielczarek.daggerexample.ui.base

import dagger.android.support.DaggerFragment

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
abstract class BaseFragment<P : BaseContract.Presenter> : DaggerFragment(), BaseContract.View {

    abstract var presenter: P
}