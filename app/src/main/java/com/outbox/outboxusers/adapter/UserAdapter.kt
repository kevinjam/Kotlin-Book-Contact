package com.outbox.outboxusers.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.outbox.outboxusers.R
import com.outbox.outboxusers.model.Users

/**
 * Created by kevinjanvier on 20/04/2018.
 */
class UserAdapter (var arrayList: ArrayList<Users>, var mcontext:Context) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
	
	//3 method
	override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserViewHolder {
		val viewL = LayoutInflater.from(parent!!.context).inflate(R.layout.users_item, parent, false)
		return UserViewHolder(viewL)
		
	}
	
	/**
	 * Get ArraySize
	 */
	override fun getItemCount(): Int {
		return arrayList.count()
	}
	
	override fun onBindViewHolder(holder: UserViewHolder?, position: Int) {
		//
		holder!!.bindView(arrayList[position], mcontext)
	
	}
	
	//inner class
inner class UserViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView){
		 
		 var phoneNumber = itemView!!.findViewById<TextView>(R.id.phone_txt)
		 var fullName = itemView!!.findViewById<TextView>(R.id.name_txt)
		 var image = itemView!!.findViewById<ImageView>(R.id.img_txt)
		fun bindView(users: Users, mcont:Context) {
			phoneNumber.text = users.phoneNumber
			fullName.text = users.name
			
			val resourceId =  mcont.resources.getIdentifier(users.img, "drawable", mcont.packageName)
			image.setImageResource(resourceId)
		}
		
		
		//bindvies
		
		
	
	}
	
	
	

}