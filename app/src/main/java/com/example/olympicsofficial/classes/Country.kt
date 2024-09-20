package com.example.olympicsofficial.classes
import androidx.compose.ui.res.painterResource

class Country(var name:String, var goldMedals:Int, var silverMedals : Int, var bronceMedals:Int, var flag: Int){
    fun totalMedals(): Int{
        return goldMedals+silverMedals+bronceMedals
    }
}

