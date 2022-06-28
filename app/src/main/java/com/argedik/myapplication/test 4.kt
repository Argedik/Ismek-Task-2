/*
package com.argedik.myapplication

import java.util.ArrayList

fun main(){

    fun LogDumpGetUnique(): ArrayList<String> {
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
        var list = log_dump.replace(";",",;").split(";" ).toTypedArray()
        println(list.contentToString())
        println("????????????????????????????")
        var test =""
        var test2 = arrayListOf<String>()
        list.filter { it.contains("id")}.forEach {
            test+=it.replace(it.substring(it.indexOf("id"),it.indexOf(",",it.indexOf("id"))),"")
            test2.add(it.replace(it.substring(it.indexOf("id"),it.indexOf(",",it.indexOf("id"))),"").replace(" ","").replace(",,",","))
            println(test2)

        }
       */
/* list.filter { it.contains("username")}.forEach {
            println(it)
            test=test+it
        }
        list.filter { it.contains("email")}.forEach {
            println(it)
            test=test+it
        }*//*

        println("****************")
        test=test.replace(" ","").replace(",,",",")
        println(test2[0])
        println(test2[1])
        println(test2[2])
        println(test2[8])

        println(test2)
        return test2
        //name= John Trust,username= john3,email= john3@gmail.com

    }

    LogDumpGetUnique()


}*/
