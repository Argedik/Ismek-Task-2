package com.argedik.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.argedik.myapplication.adapter.UserAdapter
import com.argedik.myapplication.dao.dao
import com.argedik.myapplication.databinding.ActivityMainBinding
import com.argedik.myapplication.models.Veri
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {


    private lateinit var veri:ArrayList<Veri>
    private lateinit var arrayList :ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        veri = ArrayList<Veri>()

        arrayList= dao().LogDumpGetUnique()


/*        arrayList.forEach {
            veri.add(Veri(name = it.substring(0,it.indexOf(",")), username = it.substring(it.indexOf(",",)+1,index), email = it.substring(index+1,it.length-1)))
        }*/




        for(i in 0..arrayList.size-1){
            var index = arrayList[i].indexOf(",",arrayList[i].indexOf(",")+1)
            veri.add(Veri(name = arrayList[i].substring(0,arrayList[i].indexOf(",")), username = arrayList[i].substring(arrayList[i].indexOf(",",)+1,index), email = arrayList[i].substring(index+1,arrayList[i].length-1)))
        }

/*
        var index = arrayList[1].indexOf(",",arrayList[1].indexOf(",")+1)
        veri.add(Veri(name = arrayList[1].substring(0,arrayList[1].indexOf(",")), username = arrayList[1].substring(arrayList[1].indexOf(",",)+1,index), email = arrayList[1].substring(index+1,arrayList[1].length-1)))
        veri.add(Veri(name = arrayList[3].substring(0,arrayList[3].indexOf(",")), username = arrayList[3].substring(arrayList[3].indexOf(",",)+1,index), email = arrayList[3].substring(index+1,arrayList[1].length-1)))
*/

/*        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))
        veri.add(Veri(name="absürt",username="test",email="afds"))*/
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val adapter=UserAdapter(veri)
        binding.recyclerView.adapter = adapter


        binding.addAddress.setOnClickListener{
            println("test")
            var intent=Intent(this@MainActivity,Address::class.java)
            startActivity(intent)
        }

    }




}