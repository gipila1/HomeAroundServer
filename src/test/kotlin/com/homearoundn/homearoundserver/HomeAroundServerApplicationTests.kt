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
		houseAddsInfo.houseName = "Γκαρσονιέρα 35τμ"
		houseAddsInfo.housePlace = "Θεσσαλονίκη"
		houseAddsInfo.squeredMetres = 35.00
		houseAddsInfo.costOfRent = 300
		houseAddsInfo.houseDetails = "Γκαρσονιέρα με 1 υπνοδωμάτιο,1 μπάνιο, 35 τμ"
		houseAddsInfo.floor = "1ος"
		houseAddsInfo.yearConstructed = 2001
		houseAddsInfo.addressRoadNum = "Νίκης 7"
		houseAddsInfo.postalCode = 17553
		houseAddsInfo.bedrooms = 1
		houseAddsInfo.bathrooms = 1
		houseAddsInfo.state = "Νέο"
		houseAddsInfo.energyClass = "Δ'"
		houseAddsInfo.airConditioning = "Κεντρική Θέρμανση"
		houseAddsInfo.costOfSharedExpenses = 20.00
		//houseAddsInfo.image1 ="\\Users\\HP\\Downloads\\paper-2023-24\\PictureUploads\\"
		repositorytest.save(houseAddsInfo)
	}

	@Test
	fun contextLoads1() {
		val userregistrationinfo = UserRegistrationInfo()
		userregistrationinfo.fullName = "Γεωργίου"
		userregistrationinfo.userName = "Tom"
		userregistrationinfo.email = "tom2003@gmail.com"
		userregistrationinfo.phoneNumber = "30697445500"
		userregistrationinfo.code = "tom2003"
		userregistrationinfo.confirmationCode = "tom2003"
		//houseAddsInfo.image1 ="\\Users\\HP\\Downloads\\paper-2023-24\\PictureUploads\\"
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

}
