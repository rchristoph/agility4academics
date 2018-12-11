package com.example.rotraudchristoph.todo.store

import android.arch.core.util.Function
import com.example.rotraudchristoph.todo.model.Action

interface Store <T> {
    fun dispatch(action:Action)
    fun subscribe(renderer:Renderer<T>, func: Function <T, T> = Function { it })
}
