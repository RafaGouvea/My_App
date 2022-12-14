package com.example.myapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp.model.DataSource
import com.example.myapp.model.PersonalAdapter

class ListFragment : Fragment() {

    private lateinit var personalAdapter: PersonalAdapter
    private lateinit var recyclerview: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_recycle_view, container, false)

        initRecycleView(view)
        addDataSource()

        return view
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.personalAdapter.setDataSet(dataSource)
    }

    private fun initRecycleView(view: View) {
        this.personalAdapter = PersonalAdapter()
        recyclerview = view.findViewById(R.id.fragment_recycle_view)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())
        recyclerview.adapter = this.personalAdapter
    }
}
