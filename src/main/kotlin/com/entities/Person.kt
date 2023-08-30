package com.entities

class Person(var Name:String) {
    fun speak(textToSpeech: String): String { //would be a com.entities.Voice entity
        return textToSpeech
    }

    fun displayWithLambda(func: (s:String) -> Unit){
        func(Name)
    }
}