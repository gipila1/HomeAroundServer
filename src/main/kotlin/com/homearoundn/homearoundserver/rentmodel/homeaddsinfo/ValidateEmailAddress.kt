package com.homearoundn.homearoundserver.rentmodel.homeaddsinfo

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

open class ValidateEmailAddress {

    @GeneratedValue(strategy = GenerationType.IDENTITY)  //that means that it is autoincrimented
    var email: String? = null


    fun getemail() = email
    fun setemail(value: String) {
        email = value
    }

    override fun toString(): String {
        return "userregistrationinfo{" +
                ", Email='" + email + '\'' +
                '}'
    }


}