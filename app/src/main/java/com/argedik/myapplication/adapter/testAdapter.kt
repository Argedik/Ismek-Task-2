package com.argedik.myapplication

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.argedik.myapplication.dao.dao
import com.argedik.myapplication.databinding.RecyclerRowBinding
import com.argedik.myapplication.models.Veri
import kotlinx.android.synthetic.main.recycler_row.view.*

class TestAdapter:RecyclerView.Adapter<TestAdapter.TestHolder>() {
    
    private var list: ArrayList<Veri> = arrayListOf()
    var arrayList= dao().LogDumpGetUnique()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= TestHolder (
        LayoutInflater.from(parent.context).inflate(R.layout.recycler_row, parent, false)
    )

    override fun onBindViewHolder(holder: TestAdapter.TestHolder, position: Int) {
        holder.bind(list[position] )
    }

    override fun getItemCount()=list.size
    inner class TestHolder(view: View):RecyclerView.ViewHolder(view){

        fun bind(userItem:Veri){
            itemView.name.text=userItem.name
            itemView.username.text=userItem.username
            itemView.email.text=userItem.email

        }

    }
    @SuppressLint("NotifyDataSetChanged")
    fun list(namelist:ArrayList<Veri>){
        //list.clear()
        //list.addAll(namelist)
        println("asdasdasd")
        notifyDataSetChanged()
        var index = arrayList[1].indexOf(",",arrayList[1].indexOf(",")+1)
        list.add(Veri(name = arrayList[1].substring(0,arrayList[1].indexOf(",")), username = arrayList[1].substring(arrayList[1].indexOf(",",)+1,index), email = arrayList[1].substring(index+1,arrayList[1].length-1)))
        list.add(Veri(name = arrayList[3].substring(0,arrayList[3].indexOf(",")), username = arrayList[3].substring(arrayList[3].indexOf(",",)+1,index), email = arrayList[3].substring(index+1,arrayList[1].length-1)))

/*        for(i in 0..arrayList.size){
            var index = arrayList[1].indexOf(",",arrayList[1].indexOf(",")+1)
            list.add(Veri(name = arrayList[i].substring(0,arrayList[i].indexOf(",")), username = arrayList[i].substring(arrayList[i].indexOf(",",)+1,index), email = arrayList[i].substring(index+1,arrayList[i].length-1)))
        }*/



    }

}

/*
class TestAdapter(val list:ArrayList<Veri>):RecyclerView.Adapter<TestAdapter.TestHolder>() {
    private lateinit var veri:ArrayList<Veri>

    var arrayList= dao().LogDumpGetUnique()
    var index = arrayList[1].indexOf(",",arrayList[1].indexOf(",")+1)

    fun userlist(list2:ArrayList<Veri>){
        veri.add(Veri(name = arrayList[1].substring(0,arrayList[1].indexOf(",")), username = arrayList[1].substring(arrayList[1].indexOf(",",)+1,index), email = arrayList[1].substring(index+1,arrayList[1].length-1)))
        veri.add(Veri(name = arrayList[3].substring(0,arrayList[3].indexOf(",")), username = arrayList[3].substring(arrayList[3].indexOf(",",)+1,index), email = arrayList[3].substring(index+1,arrayList[1].length-1)))

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        println("test")
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TestHolder(binding)
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        println("test2")
        holder.binding.name.text=list.get(position).name
        holder.binding.username.text=list.get(position).username
        holder.binding.email.text=list.get(position).email
    }

    override fun getItemCount()=list.size
    inner class TestHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

}
*/
