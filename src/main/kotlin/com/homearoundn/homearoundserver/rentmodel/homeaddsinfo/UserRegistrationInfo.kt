package com.homearoundn.homearoundserver.rentmodel.homeaddsinfo

import jakarta.persistence.*
import java.io.Serial
@Entity  //creates a sql table
open class UserRegistrationInfo {
     //creates a primary key in table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //that means that it is autoincrimented
    @Serial
     var id: Int = 0
    var fullName: String? = null
    var userName: String? = null
    var email: String? = null
    var phoneNumber: String? = null
    var code: String? = null
    var confirmationCode: String? = null



    override fun  toString(): String {
        return "userregistrationinfo{" +
                "id=" + id +
                ", Ονομεταπώνυμο='" + fullName + '\'' +
                ", Όνομα Χρήστη='" + userName + '\'' +
                ", Email='" + email + '\'' +
                ", Αριθμός Τηλεφώνου='" + phoneNumber + '\'' +
                ", Κωδικός='" + code + '\'' +
                ", Επιβεβαίωση Κωδικού='" + confirmationCode + '\'' +
                '}'
    }
    fun getid()=id
    fun setid(value: Int) {
        id=value
    }

    fun getfullName()=fullName
    fun setfullName(value: String) {
        fullName=value
    }

    fun getuserName()=userName
    fun setuserName(value: String) {
        userName=value
    }
    fun getemail()=email
    fun setemail(value: String) {
        email=value
    }
    fun getphoneNumber()=phoneNumber
    fun setphoneNumber(value: String) {
        phoneNumber=value
    }
    fun getcode()=code
    fun setcode(value: String) {
        code = value
    }
    fun getconfirmationCode()=confirmationCode
    fun setconfirmationCode(value: String) {
        confirmationCode = value
    }
}