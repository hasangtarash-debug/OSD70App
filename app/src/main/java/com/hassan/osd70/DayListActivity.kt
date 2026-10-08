package com.hassan.osd70

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DayListActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: DayAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitydaylist)

        recyclerView = findViewById(R.id.recyclerDays)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val days = DayDataProvider.getDays()
        adapter = DayAdapter(days) { day ->
            val intent = Intent(this, DayDetailActivity::class.java)
            intent.putExtra("dayId", day.id)
            startActivity(intent)
        }
        recyclerView.adapter = adapter
    }
}
