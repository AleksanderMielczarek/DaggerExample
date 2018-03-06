package com.github.aleksandermielczarek.daggerexample.ui.content

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.aleksandermielczarek.daggerexample.R
import com.github.aleksandermielczarek.daggerexample.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_content.*
import javax.inject.Inject

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
class ContentFragment : BaseFragment<ContentContract.Presenter>(), ContentContract.View {

    @Inject
    override lateinit var presenter: ContentContract.Presenter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_content, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.loadName()
    }

    override fun showName(name: String) {
        this.name.text = name
    }
}