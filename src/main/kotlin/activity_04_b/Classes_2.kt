package activity_04_b

class Book{
    var title:String? = null
    var authors:String? = null
    var yearPublished:Int? = null
    var edition:Int? = null
    var isbn:String? = null
    var publisher:ArrayList<Publisher> = ArrayList()
    var chapters:HashMap<Int,String> = HashMap<Int,String>()
    var pageNumber:Int? = null
}

class Magazine{
    var title:String? = null
    var editor:String? = null
    var monthPublished:Int? = null
    var yearPublished:Int? = null

    var article:ArrayList<Article> = ArrayList()
}

class NewsPaper{
    var name:String? = null
    var dayPublished:Int? = null
    var monthPublished:Int? = null
    var yearPublished:Int? = null
    var headLine:String? = null

    var article:ArrayList<Article> = ArrayList()
}

class Author{
    var firstName:String? = null
    var lastName:String? = null
    var middleName:String? = null
    var birthDate:String? = null
}

class Comics{
    var title:String? = null
    var monthPublished:Int? = null
    var yearPublished:Int? = null
    var publisher:ArrayList<Publisher> = ArrayList()
    var illustrator:ArrayList<Illustrator> = ArrayList()

    inner class Illustrator(var firstName:String?= null,
            var middleName:String? = null,
            var lastName:String? = null,
            var birthDate:String? = null){
        constructor()
        :this("","","","")
    }
}

class Article(
    var title:String? = null,
    var content:String? = null,
    var author:String? = null){
    constructor():this("","","")

}

class Publisher(
    var name:String? = null,
    var address:String? = null,
    var dateEstablished:String? = null){
    constructor():this("","","")
}




