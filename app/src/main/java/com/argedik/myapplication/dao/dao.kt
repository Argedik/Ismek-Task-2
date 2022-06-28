package com.argedik.myapplication.dao

import java.util.ArrayList

class dao {
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


        var list = log_dump.replace(";",",;").split(";" ).toTypedArray()
        var test =""
        var test2 = arrayListOf<String>()
        list.filter { it.contains("id")}.forEach {
            test+=it.replace(it.substring(it.indexOf("id"),it.indexOf(",",it.indexOf("id"))),"")
            test2.add(it.replace(it.substring(it.indexOf("id"),it.indexOf(",",it.indexOf("id"))),"").replace(" ","").replace(",,",","))
        }

        test=test.replace(" ","").replace(",,",",")

        return test2

    }

}