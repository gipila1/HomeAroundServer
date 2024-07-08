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
    var costOfSale: Int = 0
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
    var rentOrSell: String? = null
    var dateleaving: String? = null
    

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
                ", Ενοικίαση ή Πώληση='" + rentOrSell + '\'' +
                ", Ημ.Αποχώρησης='" + dateleaving + '\'' +
                ", Τιμή πώλησης='" + costOfSale + '\'' +
                '}'
    }

//    fun getId()=id
//    fun setId(value: Int) {
//        id=value
//    }
//    fun getHouseName()=houseName
//    fun setHouseName(value: String?) {
//        houseName=value
//    }
//    fun getHousePlace()=housePlace
//    fun setHousePlace(value: String?) {
//        housePlace=value
//    }
//    fun getSqueredMetres()=squeredMetres
//    fun setSqueredMetres(value: Double) {
//        squeredMetres=value
//    }
//    fun getCostOfRent()=costOfRent
//    fun setCostOfRent(value: Int) {
//        costOfRent=value
//    }
//    fun getHouseDetails()=houseDetails
//    fun setHouseDetails(value: String?) {
//        houseDetails=value
//    }
//    fun getFloor()=floor
//    fun setFloor(value: String?) {
//        floor=value
//    }
//    fun getYearConstructed()=yearConstructed
//    fun setYearConstructed(value: Int) {
//        yearConstructed=value
//    }
//    fun getAddressRoadNum()=addressRoadNum
//    fun setAddressRoadNum(value: String?) {
//        addressRoadNum=value
//    }
//    fun getPostalCode()=postalCode
//    fun setPostalCode(value: Int) {
//        postalCode=value
//    }
//    fun getBedrooms()=bedrooms
//    fun setBedrooms(value: Int) {
//        bedrooms=value
//    }
//    fun getBathrooms()=bathrooms
//    fun setBathrooms(value: Int) {
//        bathrooms=value
//    }
//    fun getState()=state
//    fun setstate(value: String?) {
//        state=value
//    }
//    fun getenergyClass()=energyClass
//    fun setenergyClass(value: String?) {
//        energyClass=value
//    }
//    fun getAirConditioning()=airConditioning
//    fun setAirConditioning(value: String?) {
//        airConditioning=value
//    }
//    fun getCostOfSharedExpenses ()=costOfSharedExpenses
//    fun setCostOfSharedExpenses (value: Double) {
//        costOfSharedExpenses =value
//    }

}


