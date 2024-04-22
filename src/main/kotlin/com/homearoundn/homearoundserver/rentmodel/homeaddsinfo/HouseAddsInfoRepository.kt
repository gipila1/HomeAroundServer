package com.homearoundn.homearoundserver.rentmodel.homeaddsinfo

import org.apache.el.stream.Optional
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface HouseAddsInfoRepository : CrudRepository<HouseAddsInfo, Int> {
    //Repository is an interface, not a class and CrudRepository a fixed "pre-code" from Spring Boot that does some basic jobs/functionalities
    //fun findByName(name: String) {

    //}

}

interface UserRegistrationInfoRepository : CrudRepository<UserRegistrationInfo, Int> {
    //Repository is an interface, not a class and CrudRepository a fixed "pre-code" from Spring Boot that does some basic jobs/functionalities
    //fun findByName(name: String) {

    //}

}