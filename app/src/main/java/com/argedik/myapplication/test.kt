/*
package com.argedik.myapplication

import java.util.*

fun main() {
    var filterList: ArrayList<Int> = arrayListOf()
    filterList.add(12)
    filterList.add(6)
    filterList.add(1)
    filterList.add(1)
    filterList.filter { it > 5 }.forEach {
        println(it.toString())
    }



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
        var absurt=list.joinToString(",")
        absurt=absurt.replace("\\s".toRegex(),"")
        println(absurt)
        println("***************************************************************************")
        list =absurt.split(",").toTypedArray()
        println(list.contentToString())
        println("absürt-*****************")
        var test =""
        list.filter { it.contains("name")}.forEach {
            if (it.substring(0,4)=="name"){
                println(it)
                test=test+it
            }
        }
        list.filter { it.contains("username")}.forEach {
            println(it)
            test=test+it
        }
        list.filter { it.contains("email")}.forEach {
            println(it)
            test=test+it
        }
        println(test)
        return log_dump;
        //name= John Trust,username= john3,email= john3@gmail.com

    }

    LogDumpGetUnique()

}


class Test3 (val name:String,val username:String,val email:String){}


*/
