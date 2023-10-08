package com.example.projectbp2705

class Login {
    var username = ""
    var password = ""

    fun loginCheck():Boolean{
        if (username.equals("raditz")&&password.equals("amikom")){
            return true
        }else{
            return false
        }
    }
}