package com.github.aleksandermielczarek.daggerexample.usecase

import com.github.aleksandermielczarek.daggerexample.usecase.name.GetName
import com.github.aleksandermielczarek.daggerexample.usecase.name.GetNameUseCase
import dagger.Binds
import dagger.Module

/**
 * Created by Aleksander Mielczarek on 06.03.2018.
 */
@Module
abstract class UseCaseModule {

    @Binds
    abstract fun bindGetName(getName: GetName): GetNameUseCase
}