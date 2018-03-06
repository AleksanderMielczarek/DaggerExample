package com.github.aleksandermielczarek.daggerexample.ui.home

import android.os.Bundle
import com.github.aleksandermielczarek.daggerexample.R
import com.github.aleksandermielczarek.daggerexample.ui.base.BaseActivity
import kotlinx.android.synthetic.main.activity_home.*
import javax.inject.Inject

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
class HomeActivity : BaseActivity<HomeContract.Presenter>(), HomeContract.View {

    @Inject
    override lateinit var presenter: HomeContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(toolbar)
        presenter.loadName()
    }

    override fun showName(name: String) {
        this.name.text = name
    }
}