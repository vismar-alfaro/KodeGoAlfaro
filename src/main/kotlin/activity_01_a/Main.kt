package activity_01_a

import java.time.LocalDate
import java.time.Month
import java.time.format.DateTimeFormatter
import java.util.Date

fun main (){

    var programEnrolled: String? = null
    var classStartDate = LocalDate.parse("2022-10-06")
    var dateFormat = DateTimeFormatter.ofPattern("MM-dd-yyy")
    var formattedWorkStartDate = classStartDate.format(dateFormat)
    var firstName: String? = null
    var lastName: String? = null
    var middleName: String? = null

    var emailAddress: String? = null




}