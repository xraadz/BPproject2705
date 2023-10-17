package com.example.projectbp2705

class Login {
    var username = ""
    var password = ""

    fun loginCheck():Boolean{
        if (username.equals("ditzu")&&password.equals("1234")){
            return true
        }else{
            return false
        }
    }
}