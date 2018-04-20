package com.outbox.outboxusers

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import com.outbox.outboxusers.adapter.UserAdapter
import com.outbox.outboxusers.model.Users

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
	
	lateinit var recycler :RecyclerView
	lateinit var linear : LinearLayoutManager
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		setSupportActionBar(toolbar)
		
//		recycler.findViewById<RecyclerView>(R.id.user_recycler)
//
		linear = LinearLayoutManager(this)
		user_recycler.layoutManager = linear
		
        val adapter = UserAdapter(getItem(), this)
        user_recycler.adapter = adapter
		
		
		//add People Contact Book
		fab.setOnClickListener {
			Toast.makeText(this, "Add Contact Please", Toast.LENGTH_LONG).show()
		}
		
	}
	
	
	
	fun getItem():ArrayList<Users>{
		val addArrayList = ArrayList<Users>()
		addArrayList.add(Users("ic_people", "Solomon Opio", "+256785077853"))
		addArrayList.add(Users("ic_girl", "Brian Mutebi", "+256785077853"))
		addArrayList.add(Users("ic_two", "Ali Ayuba", "+256785077853"))
		addArrayList.add(Users("ic_four", "Anthony Nata Opio", "+256785077853"))
		addArrayList.add(Users("ic_account_circle_black_24dp", "Innocent M", "+256785077853"))
		addArrayList.add(Users("ic_five", "Yusuf K", "+256785077853"))
		
		return addArrayList
		
	}
	
}
