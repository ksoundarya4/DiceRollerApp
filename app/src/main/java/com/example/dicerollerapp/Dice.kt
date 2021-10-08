package com.example.dicerollerapp

class Dice(val sides: Int) {

    fun roll(): Int {
        return (0..sides).random()
    }
}