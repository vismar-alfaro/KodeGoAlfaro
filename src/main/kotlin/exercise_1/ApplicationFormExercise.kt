package exercise_1

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.Date

fun main (){

    var positionApplyingFor: String? = null
    var desiredSalary: String? = null
    var workStartDate = LocalDate.parse("2022-10-06")
    var dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyy")
    var formattedWorkStartDate = workStartDate.format(dateFormat)
    var firstName: String? = null
    var lastName: String? = null
    var middleName: String? = null
    var address: String? = null
    var city: String? = null
    var sate: String? = null
    var zip: Int? = null
    var age: Int? = null
    var birthDate = LocalDate.parse("")
    var formattedBirthday = birthDate.format(dateFormat)
    var sex: String? = null
    var homePhone: Long? = null
    var cellPhone: Long? = null
    var emailAddress: String? = null
    var ssNumber: Long? = null
    var question1: String? = "No"
    var question2: String? = "No"
    var question3: String? = "Yes"
    var schoolName1: String? = null
    var schoolLocation1: String? = null
    var yearsAttended1: String? = null
    var degreeReceived1: String? = null
    var major1: String? = null
    var schoolName2: String? = null
    var schoolLocation2: String? = null
    var yearsAttended2: String? = null
    var degreeReceived2: String? = null
    var major2: String? = null
    var schoolName3: String? = null
    var schoolLocation3: String? = null
    var yearsAttended3: String? = null
    var degreeReceived3: String? = null


}