package com.example.rotraudchristoph.todo.store
import android.arch.lifecycle.LiveData

interface Renderer <T> {

    fun render(model: LiveData<T>)
}