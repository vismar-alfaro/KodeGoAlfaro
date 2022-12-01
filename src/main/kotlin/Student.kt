open class Student {
    var firstName = ""
        get() = field
        private set(value) {
            field = value
        }
    var middleName = ""
    var lastName = ""
    var nickName = ""
    var idNumber = ""
    var yearEnrolled = ""
}