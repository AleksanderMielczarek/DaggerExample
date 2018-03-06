package com.github.aleksandermielczarek.daggerexample.ui.base

import dagger.android.support.DaggerAppCompatActivity

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
abstract class BaseActivity<P : BaseContract.Presenter> : DaggerAppCompatActivity(), BaseContract.View {

    abstract var presenter: P

}