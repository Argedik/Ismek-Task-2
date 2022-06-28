/*
package com.argedik.myapplication

fun main(){
    fun LogDumpGetUnique(): String {
        var log_dump : String = "name=John Trust, username=john3, email=john3@gmail.com, id=434453;" +
                " name=Hannah Smith, username=hsmith, email=hsm@test.com, id=23312;" +
                " name=Hannah Smith, username=hsmith, id=3223423, email=hsm@test.com;" +
                " name=Robert M, username=rm44, id=222342, email=rm@me.com;" +
                " name=Robert M, username=rm4411, id=5535, email=rm@me.com;" +
                " name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com;" +
                " name=Robert Nick, username=rnick33, id=23432, email=rnick@gmail.com;" +
                " name=Robert Nick II, username=rnickTemp34, id=23432, email=rnick@gmail.com;" +
                " name=Susan Vee, username=sv55, id=443432, email=susanv123@me.com;"


        //log_dump=log_dump.replace("\\s".toRegex(),"")
        println(log_dump )
        println(" heyyyyyyyyyyyyyyyy")
        var list = log_dump.split(";").toTypedArray()
        println(list.contentToString())
        //println(list.filter { it.contains("name")})

        //list.forEach { println(it.split("=")) }
        //var i =0
        //list.forEach { println(it + (i+1)) }
        println("**********************************")
        var absurt=list.joinToString(",")
        //absurt=absurt.replace("\\s".toRegex(),"")
        //absurt=absurt.replace("   ".toRegex(),"")
        //absurt=absurt.filter { !it.isWhitespace()}
        println(absurt)
        list =absurt.split(",").toTypedArray()

        println("************")
        println(list.contentToString())
        //println(list.forEach { println(it + "   absurt") })
        println("????????????????????????????")

        var newList= arrayListOf<String>()
        for (i in 0..list.size-2){
            var indexName=list[i].indexOf("=")
            var name =list[i].substring(indexName+1,list[i].length)
            var newItem = Test3(name,"adsf","assd")
            //newList.add(newItem.name)
            println(list[i])
        }
        println(newList)
        println(newList.size)
        return log_dump;
        //name= John Trust,username= john3,email= john3@gmail.com
    }

    LogDumpGetUnique()

}*/
