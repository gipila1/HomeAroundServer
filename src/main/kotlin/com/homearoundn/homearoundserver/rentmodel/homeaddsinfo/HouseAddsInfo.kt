package com.homearoundn.homearoundserver.rentmodel.homeaddsinfo


import jakarta.persistence.*

@Entity  //creates a sql table
open class HouseAddsInfo { //annotation class Builder  //@Builder //@Data
    @Id  //creates a primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //that means that it is autoincrimented
    var id: Int = 0
    var houseName: String? = null
    var housePlace: String? = null
    var squeredMetres: Double = 0.00
    var costOfRent: Int = 0
    var houseDetails: String? = null
    var floor: String? = null
    var yearConstructed: Int = 0
    var addressRoadNum: String? = null
    var postalCode: Int = 0
    var bedrooms: Int = 0
    var bathrooms: Int = 0
    var state: String? = null
    var energyClass: String? = null
    var airConditioning: String? = null
    var costOfSharedExpenses: Double = 0.00
    //var type: String? = null
    //var name: String? = null  //for storing a photo to database
    //lateinit var image1: String  // this is the filepath of the pictures folder    (older) binary format for saving a photo to database

    override fun toString(): String {
        return "houseaddsinfo{" +
                "id=" + id +
                ", Είδος σπιτιού='" + houseName + '\'' +
                ", Περιοχή='" + housePlace + '\'' +
                ", Τετραγωνικά='" + squeredMetres + '\'' +
                ", Ποσό ενοικίου='" + costOfRent + '\'' +
                ", Περιγραφή σπιτιού='" + houseDetails + '\'' +
                ", Όροφος='" + floor + '\'' +
                ", Έτος κατασκευής='" + yearConstructed + '\'' +
                ", Διεύθυνση (Οδός)='" + addressRoadNum + '\'' +
                ", TK='" + postalCode + '\'' +
                ", Αριθμός υπνοδωματίων='" + bedrooms + '\'' +
                ", Αριθμός μπάνιων='" + bathrooms + '\'' +
                ", Κατάσταση (Άριστη/Υπό ανακαίνιση)='" + state + '\'' +
                ", Ενεργειακή Κλάση='" + energyClass + '\'' +
                ", Kλιματισμός='" + airConditioning + '\'' +
                ", Κοινόχρηστα (αν υπάρχουν μ.ο. κόστους)='" + costOfSharedExpenses + '\'' +
                '}'
    }

    fun getid()=id
    fun setid(value: Int) {
        id=value
    }
    fun gethouseName()=houseName
    fun sethouseName(value: String?) {
        houseName=value
    }
    fun gethousePlace()=housePlace
    fun sethousePlace(value: String?) {
        housePlace=value
    }
    fun getsqueredMetres()=squeredMetres
    fun setsqueredMetres(value: Double) {
        squeredMetres=value
    }
    fun getcostOfRent()=costOfRent
    fun setcostOfRent(value: Int) {
        costOfRent=value
    }
    fun gethouseDetails()=houseDetails
    fun sethouseDetails(value: String?) {
        houseDetails=value
    }
    fun getfloor()=floor
    fun setfloor(value: String?) {
        floor=value
    }
    fun getyearConstructed()=yearConstructed
    fun setyearConstructed(value: Int) {
        yearConstructed=value
    }
    fun getaddressRoadNum()=addressRoadNum
    fun setaddressRoadNum(value: String?) {
        addressRoadNum=value
    }
    fun getpostalCode()=postalCode
    fun setpostalCode(value: Int) {
        postalCode=value
    }
    fun getbedrooms()=bedrooms
    fun setbedrooms(value: Int) {
        bedrooms=value
    }
    fun getbathrooms()=bathrooms
    fun setbathrooms(value: Int) {
        bathrooms=value
    }
    fun getstate()=state
    fun setstate(value: String?) {
        state=value
    }
    fun getenergyClass()=energyClass
    fun setenergyClass(value: String?) {
        energyClass=value
    }
    fun getairConditioning()=airConditioning
    fun setairConditioning(value: String?) {
        airConditioning=value
    }
    fun getcostOfSharedExpenses ()=costOfSharedExpenses
    fun setcostOfSharedExpenses (value: Double) {
        costOfSharedExpenses =value
    }

}


