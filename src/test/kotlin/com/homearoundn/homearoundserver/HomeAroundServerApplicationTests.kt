package com.homearoundn.homearoundserver

import com.homearoundn.homearoundserver.rentmodel.homeaddsinfo.HouseAddsInfo
import com.homearoundn.homearoundserver.rentmodel.homeaddsinfo.HouseAddsInfoDao
import com.homearoundn.homearoundserver.rentmodel.homeaddsinfo.HouseAddsInfoRepository
import com.homearoundn.homearoundserver.rentmodel.homeaddsinfo.UserRegistrationInfo
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.awt.PageAttributes.MediaType.C

@SpringBootTest
class HomeAroundServerApplicationTests {


	@Autowired
	private lateinit var houseAddsInfoDao: HouseAddsInfoDao

	@Autowired
	private lateinit var repositorytest: HouseAddsInfoDao


	//interface HousesAddsInfoRepository {  //to check
		//var repository: HouseAddsInfoRepository
	//@Test
	fun contextLoads() {
		val houseAddsInfo = HouseAddsInfo()
		houseAddsInfo.houseName = "Διαμέρισμα 45τμ"
		houseAddsInfo.housePlace = "Αμπελόκηποι"
		houseAddsInfo.squeredMetres = 45.00
		houseAddsInfo.costOfRent = 430
		houseAddsInfo.costOfSale = 0
		houseAddsInfo.houseDetails = "Διαμέρισμα ιδανικό για φοιτητές, κοντά στο μετρό με 1 υπνοδωμάτια,1 μπάνιο, στον 2ο όροφο"
		houseAddsInfo.floor = "2ος"
		houseAddsInfo.yearConstructed = 1982
		houseAddsInfo.addressRoadNum = "Λουίζης Ριανκούρ 41"
		houseAddsInfo.postalCode = 11523
		houseAddsInfo.bedrooms = 1
		houseAddsInfo.bathrooms = 1
		houseAddsInfo.state = "Καλή"
		houseAddsInfo.energyClass = "Β'"
		houseAddsInfo.airConditioning = "Κεντρική Θέρμανση"
		houseAddsInfo.costOfSharedExpenses = 18.00
		houseAddsInfo.rentOrSell = "Ενοικίαση"
		houseAddsInfo.dateleaving = "Άμεσα"
		//houseAddsInfo.userName = "Tom"
		//houseAddsInfo.image1 ="\\Users\\HP\\Downloads\\paper-2023-24\\PictureUploads\\"
		repositorytest.save(houseAddsInfo)
	}

	@Test
	fun contextLoads1() {
		val userregistrationinfo = UserRegistrationInfo()
		userregistrationinfo.fullName = "Στέλιος Σωτηρόπουλος"
		userregistrationinfo.userName = "sotir.s"
		userregistrationinfo.email = "sotir.s@gmail.com"
		userregistrationinfo.phoneNumber = "6973302487"
		userregistrationinfo.code = "sotir.s1"
		userregistrationinfo.confirmationCode = "sotir.s1"
		//houseAddsInfo.image1 ="\\Users\\HP\\ownloads\\paper-2023-24\\PictureUploads\\"
		repositorytest.save(userregistrationinfo)
	}

	//@Test
	fun getAllHouses() {
		val houses = repositorytest.getAllHouses()
		println(houses)
	}

	//@Test
	fun getAllHousesAndDeleteThem() {
		val houses = repositorytest.getAllHouses().toList()
		for (houseaddsinfo: HouseAddsInfo  in houses ){
			repositorytest.delete(houseaddsinfo)
		}


	}

	//@Test
	fun delete() {
		val houseAddsInfo = HouseAddsInfo()
			repositorytest.delete(houseAddsInfo)
	}

	//@Test
	fun getAllUsers() {
		val users = repositorytest.getAllUsers()
		println(users)
	}

	//@Test

}
