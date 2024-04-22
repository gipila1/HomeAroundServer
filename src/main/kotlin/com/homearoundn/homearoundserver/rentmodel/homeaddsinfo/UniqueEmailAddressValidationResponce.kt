package com.homearoundn.homearoundserver.rentmodel.homeaddsinfo

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType

open class UniqueEmailAddressValidationResponce {

    @GeneratedValue(strategy = GenerationType.IDENTITY)  //that means that it is autoincrimented
    var isUnique: Boolean? = null
    var userRegistrationInfo: String? = null


    fun getisUnique() = isUnique
    fun setisUnique(value: Boolean) {
        isUnique = value
    }
    fun getuser() = userRegistrationInfo
    fun setemail(value: String) {
        userRegistrationInfo = value
    }

    override fun toString(): String {
        return "uniqueemailaddressvalidationresponce{" +
                ", isUnique='" + isUnique + '\'' +
                ", userRegistrationInfo='" + userRegistrationInfo + '\'' +
                '}'
    }
}