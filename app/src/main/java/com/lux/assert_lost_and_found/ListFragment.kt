package com.lux.assert_lost_and_found

import android.app.Activity
import android.os.Bundle
import android.view.*
import android.widget.Adapter
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lux.assert_lost_and_found.databinding.FragmentListBinding

class ListFragment:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return binding.root
    }
    val binding:FragmentListBinding by lazy { FragmentListBinding.inflate(layoutInflater) }
    val recycler:RecyclerView by lazy { binding.recyclerList }
    val spinner_category1 by lazy { binding.spinnerCategory1 }
    val spinner_category2 by lazy { binding.spinnerCategory2 }
    val spinner_received by lazy { binding.spinnerReceived }



    var items = mutableListOf<List_Item>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

        spinner_category1.adapter=ArrayAdapter.createFromResource(activity as SecondActivity,R.array.category1,R.layout.spinner_sample2)
        (spinner_category1.adapter as ArrayAdapter<CharSequence>).setDropDownViewResource(R.layout.spinner_sample)

        when(spinner_category1.selectedItemPosition){
            1->{

            }
        }

        items.add(List_Item("에어팟","서울시 성동구 어저구","2022-03-02","01","ㅁㄴㅇㄹ",R.drawable.button_blue))

        recycler.adapter=RecyclerAdapter(activity as SecondActivity,items)
        recycler.layoutManager=LinearLayoutManager(activity,LinearLayoutManager.VERTICAL,false)


    }









    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.option_list,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option_report->{

            }
        }
        return super.onOptionsItemSelected(item)
    }



}