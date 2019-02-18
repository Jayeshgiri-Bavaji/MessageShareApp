package com.jbavaji.messageshareapp.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.jbavaji.messageshareapp.adapters.HobbiesAdapter
import com.jbavaji.messageshareapp.R
import com.jbavaji.messageshareapp.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setUpRecyclerView()
    }

    private fun setUpRecyclerView() {
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)
        recyclerView.adapter = adapter
    }
}
