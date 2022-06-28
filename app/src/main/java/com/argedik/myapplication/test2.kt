/*
package com.argedik.myapplication

import java.util.*

fun main() {
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


        println(log_dump )
        println("**********************************")
        var list = log_dump.split(";" ).toTypedArray()
        println(list.contentToString())
        println("????????????????????????????")
        var newList= arrayListOf<String>()
        var location=0
        var index = 0
        for (i in 0..list.size-2){
            var name= ""
            var userName= ""
            var email =""
                index = list[i].indexOf("name",location-1)
                location=list[i].indexOf(",",index)+1
                name =list[i].substring(index,location-1)
                index=list[i].indexOf("username",location-1)
                location=list[i].indexOf(",",index)+1
                userName = list[i].substring(index,location-1)
                index=list[i].indexOf("email",location-1)
                location=list[i].indexOf(",",index)+1
                email = list[i].substring(index,location-1)
                index = list[i].indexOf("id",location-1)
                location=list[i].indexOf(",",index)+1
            println(index.toString() + " ****" + location+ "qwdqwdwq")
            var newItem = Test2(name,userName,email)
            newItem.name.let { newList.add(it) }
            newItem.username.let { newList.add(it) }
            newItem.email.let { newList.add(it) }
            println(list[i])
            println(newList.toString())
        }
        println("-----------------------------")
        println(newList)
        println(newList.size)
        return log_dump;
        //name= John Trust,username= john3,email= john3@gmail.com

    }

    LogDumpGetUnique()

}


class Test2 (val name:String,val username:String,val email:String){}*/
