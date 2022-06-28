package com.argedik.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.argedik.myapplication.dao.dao
import com.argedik.myapplication.models.Veri
import kotlinx.android.synthetic.main.activity_address.*

class Address : AppCompatActivity() {
    private lateinit var arrayList :ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_address)
        arrayList=dao().LogDumpGetUnique()

        //Kayabaşı mh, Botanik CD. (11. Bölge), Dy1 Blok, Daire-13, No:9G, Başakşehir, İstanbul
//veri.add(Veri(name = arrayList[i].substring(0,arrayList[i].indexOf(",")), username = arrayList[i].substring(arrayList[i].indexOf(",",)+1,index), email = arrayList[i].substring(index+1,arrayList[i].length-1)))

        button.setOnClickListener {
            if (addressText.text!=null &&  addressText.text.isNotEmpty() && addressText.text.length>20 ){
                var address=addressText.text
                var quarter =address.substring(0,address.indexOf(",",0))
                var street =address.substring(address.indexOf(",",0)+2,address.indexOf(",",address.indexOf(",",0)+1) )
                var bloc =address.substring(address.indexOf(",",address.indexOf(",",0)+1) +2,address.indexOf(",",address.indexOf(",",address.indexOf(",",0)+1)+1) )
                var index= address.indexOf(",",address.indexOf(",",address.indexOf(",",0)+1)+1)
                var apartment =address.substring(index+2,address.indexOf(",",index+2))
                index=address.indexOf(",",index+2)
                var apartmantNo =address.substring(index+2,address.indexOf(",",index+2))
                index=address.indexOf(",",index+2)
                var district =address.substring(index+2,address.indexOf(",",index+2))
                index=address.indexOf(",",index+2)
                var country =address.substring(index+2,address.length)
                mahalle.text=quarter
                cadde.text=street
                blok.text=bloc
                daire.text=apartment
                no.text=apartmantNo
                ilçe.text=district
                il.text=country

            }
            Toast.makeText(this,arrayList.toString().replace("[","").replace(" ","").replace(",,",",").replace("]",""), Toast.LENGTH_SHORT).show()

        }
    }
}