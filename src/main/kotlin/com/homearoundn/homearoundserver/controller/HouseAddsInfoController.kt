package com.homearoundn.homearoundserver.controller

import com.homearoundn.homearoundserver.rentmodel.homeaddsinfo.*
import org.apache.catalina.connector.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController   // A different kind of Repository
class HouseAddsInfoController {

    @Autowired
    lateinit var houseaddsinfoDao: HouseAddsInfoRepository

    @Autowired
    lateinit var userregistrationinfoDao: UserRegistrationInfoRepository

    @GetMapping("/houseaddsinfo/get-all")   // In order to get all housesinfo from server

    fun getAllHouses(): List<HouseAddsInfo>{
        val houses = mutableListOf<HouseAddsInfo>()
        houseaddsinfoDao.findAll().forEach { houses.add(it) }

        return houses
    }

    /*@GetMapping("/houseaddsinfo/get-housedetails")
    fun gethouseDetails(): HouseAddsInfo {
        val house = HouseAddsInfo()
        houseaddsinfoDao.findById(house.id)

        return house
    }
    @GetMapping("/houseaddsinfo/getfromsearch")   // In order to get all housesinfo from server

    @Query("SELECT HouseAddsInfo FROM HouseAddsInfo WHERE housePlace LIKE :search ")

    fun getallfromfliter(searchT: String): List<HouseAddsInfo>{
        val house = mutableListOf<HouseAddsInfo>()

            houseaddsinfoDao.findAll().forEach { house.add(it) }
        return house
    }*/


    @PostMapping("/houseaddsinfo/save")   // In order to get all housesinfo from server

    fun save(@RequestBody  houseaddsInfo: HouseAddsInfo): HouseAddsInfo {

        return houseaddsinfoDao.save(houseaddsInfo)            //Saving/send a houseaddsinfo object Posting it to server - Post Endpoint
    }
    /*@PutMapping("/houseaddsinfo/update/{id}")   // In order to get all housesinfo from server

    fun update(@PathVariable  id: Int,  @RequestBody  houseaddsInfo: HouseAddsInfo): String {
        val  updatedhouseaddsinfo: HouseAddsInfo = houseaddsinfoDao.findById(id).get()
        updatedhouseaddsinfo.sethouseName(houseaddsInfo.gethouseName())
        updatedhouseaddsinfo.sethousePlace(houseaddsInfo.gethousePlace())
        updatedhouseaddsinfo.setsqueredMetres(houseaddsInfo.getsqueredMetres())
        updatedhouseaddsinfo.setcostOfRent(houseaddsInfo.getcostOfRent())
        updatedhouseaddsinfo.sethouseDetails(houseaddsInfo.gethouseDetails())
        updatedhouseaddsinfo.setfloor(houseaddsInfo.getfloor())
        updatedhouseaddsinfo.setyearConstructed(houseaddsInfo.getyearConstructed())
        updatedhouseaddsinfo.setaddressRoadNum(houseaddsInfo.getaddressRoadNum())
        updatedhouseaddsinfo.setpostalCode(houseaddsInfo.getpostalCode())
        updatedhouseaddsinfo.setbedrooms(houseaddsInfo.getbedrooms())
        updatedhouseaddsinfo.setbathrooms(houseaddsInfo.getbathrooms())
        updatedhouseaddsinfo.setstate(houseaddsInfo.getstate())
        updatedhouseaddsinfo.setenergyClass(houseaddsInfo.getenergyClass())
        updatedhouseaddsinfo.setairConditioning(houseaddsInfo.getairConditioning())
        //updatedhouseaddsinfo.setimage1(houseaddsInfo.getimage1())

        houseaddsinfoDao.save(updatedhouseaddsinfo)
        return "..update finished"         //Updating a houseaddsinfo object Posting it to server - Post Endpoint
    }*/
    //@PostMapping("/userregistrationinfo/validate-unique-email")  //for email validation
   // fun validateEmailAddress(email: ValidateEmailAddress): Response<UniqueEmailAddressValidationResponce>{
        //val email = mutableListOf<HouseAddsInfo>()
        //houseaddsinfoDao.findAll().forEach { email.add(it) }
        //if (mutableListOf(HouseAddsInfo).isNotEmpty()) {
        //    return  houseaddsinfoDao.existsById(true)
       // }
    //}
    @PostMapping("/userregistrationinfo/save")

    fun save(userregistrationinfo: UserRegistrationInfo): UserRegistrationInfo {
        //In order to save, retrieve & project the object instance from the server i tranform it from void to "return" fun
        return userregistrationinfoDao.save(userregistrationinfo)
    }
}