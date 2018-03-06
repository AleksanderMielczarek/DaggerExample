package com.github.aleksandermielczarek.daggerexample.usecase.name

import javax.inject.Inject

class GetName @Inject constructor() : GetNameUseCase {

    override fun getName(any: Any): String {
        return any.toString()
    }
}