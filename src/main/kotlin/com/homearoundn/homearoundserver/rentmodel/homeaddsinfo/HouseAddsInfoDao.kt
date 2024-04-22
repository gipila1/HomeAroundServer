package com.homearoundn.homearoundserver.rentmodel.homeaddsinfo

import org.apache.catalina.connector.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.RequestBody


@Service
class HouseAddsInfoDao {   //DAO means Data Access Object
    @Autowired
    lateinit var houseaddsinfoDao: HouseAddsInfoRepository

    @Autowired
    lateinit var userregistrationinfoDao: UserRegistrationInfoRepository
    //interface HousesAddsInfoRepository {  //to check
     //    var repository: HouseAddsInfoRepository

   // @Configuration
   // @ComponentScan("com.homearoundn.homearoundserver") to check
   // class AppConfig

    fun save(houseAddsInfo: HouseAddsInfo): HouseAddsInfo {
          //In order to save, retrieve & project the object instance from the server i tranform it from void to "return" fun
        return houseaddsinfoDao.save(houseAddsInfo)
    }

    fun save(userregistrationinfo: UserRegistrationInfo): UserRegistrationInfo {
        //In order to save, retrieve & project the object instance from the server i tranform it from void to "return" fun
        return userregistrationinfoDao.save(userregistrationinfo)
    }

    //fun uploadImage(file : MultipartFile)

        //@Part image: Part, //which is right? Multipart.Part or retrofit2.http.Part
        //@Part("desc") desc: RequestBody,
     //: String {
        //houseaddsinfoDao.save(HouseAddsInfo.bulder())
    //}


   // private final var FOLDER_PATH : String = "\\Users\\HP\\Downloads\\paper-2023-24\\PictureUploads\\"
   // @Throws(IOException::class)
    /*fun uploadImage(file: MultipartFile): String? {
        var filePath = FOLDER_PATH + file.originalFilename
        val houseaddsInfo: HouseAddsInfo = houseaddsinfoDao.save(
            HouseAddsInfo.Builder()
                .name(file.originalFilename)
                .type(file.contentType)
                .image1(filePath)
                .build()
        )
        file.transferTo(File(filePath))
        return if (houseaddsInfo != null) {
            "file uploaded successfully: $filePath"
        } else {
            null
        }
    }*/

   /* @Throws(IOException::class)
    fun downloadImage(fileName: String): ByteArray {
        val houseaddsInfo= houseaddsinfoDao.findByName(fileName)
        val filePath: String = houseaddsInfo.
        return Files.readAllBytes( Files filePath)).toPath())
    }*/


    fun getAllHouses(): List<HouseAddsInfo> {
        val houses = mutableListOf<HouseAddsInfo>()
        houseaddsinfoDao.findAll().forEach { houses.add(it) }
        return houses
    }

    //@Query("SELECT HouseAddsInfo FROM HouseAddsInfo WHERE housePlace LIKE :search ")

    //fun getallfromfliter(search: String): List<HouseAddsInfo>{
    //    val house = mutableListOf<HouseAddsInfo>()
    //    houseaddsinfoDao.findAll().forEach { house.add(it) }
    //    return house
    //}
   //fun gethouseDetails(): HouseAddsInfo {
    //   val house = HouseAddsInfo()
    //   houseaddsinfoDao.findById(house.id)
    //   return house
    //}

    fun delete(houseAddsInfo: HouseAddsInfo) {
        houseaddsinfoDao.delete(houseAddsInfo)
    }

    fun deleteById(houseAddsInfoId: Int) {
        houseaddsinfoDao.deleteById(houseAddsInfoId)     //to check delete by Id
    }

    /*@PutMapping("/houseaddsinfo/update/{id}")   // In order to get all housesinfo from server

    fun update(@PathVariable id: Int, @RequestBody  houseaddsInfo: HouseAddsInfo): String {
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
    } */

   // fun validateEmailAddress(@RequestBody emailAddress: ValidateEmailAddress): Response<UserRegistrationInfo>
   //     val emailAddress = mutableListOf<ValidateEmailAddress>()
    //    houseaddsinfoDao.findAll()
    //    return emailAddress.println("Το email υπάρχει ήδη")
}