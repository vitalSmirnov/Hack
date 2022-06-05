package com.example.hakaton.model

class Data () {
    private var password : String  = ""

    fun changePassword(oldpassword : String, newPassword : String) : Boolean{
        if (password == oldpassword) {
            password = newPassword
            return true
        }

        else{
            return false
        }
    }

    fun setPassword(newPassword: String){
        password = newPassword
    }

    fun getPassword() : String {
        return password
    }
}