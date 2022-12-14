package com.example.myapp.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapp.R
import kotlinx.android.synthetic.main.res_item_person.view.*

class PersonalAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<PersonalData> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return PersonalViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_person, parent, false)
        )

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder){
            is PersonalViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(people: List<PersonalData>){

        this.items = people

    }

    class PersonalViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        private val personalName = itemView.input_name
        private val personalPhone = itemView.input_phone
        private val personalCPF = itemView.input_CPF
        private val personalEmail = itemView.input_email
        private val personalImageUrl = itemView.profile_person

        fun bind(personalData: PersonalData){

            personalName.text = personalData.name
            personalPhone.text = personalData.phone
            personalCPF.text = personalData.cpf
            personalEmail.text = personalData.email

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(personalData.imageUrl)
                .into(personalImageUrl)

        }

    }

}