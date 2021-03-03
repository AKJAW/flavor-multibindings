package com.akjaw.flavor_multibinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.bastketball.view.adapter.BasketballMatch
import com.akjaw.flavor_multibinding.R
import com.akjaw.football.view.adapter.MatchListAdapter
import com.akjaw.football.view.adapter.football.FootballMatch

class MainActivity : AppCompatActivity() {

    private val matchesListAdapterFactory by lazy {
        val component = (application as FlavorMultibindingApp).applicationComponent
        component.matchListAdapterFactory()
    }
    private lateinit var adapter: MatchListAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = matchesListAdapterFactory.create()
        recyclerView = findViewById<RecyclerView>(R.id.match_recycler_view).apply {
            val layoutManager = LinearLayoutManager(context)
            this.layoutManager = layoutManager
            setHasFixedSize(true)
            val dividerItemDecoration = DividerItemDecoration(
                context,
                layoutManager.orientation
            )
            addItemDecoration(dividerItemDecoration)

        }
        recyclerView.adapter = adapter

        adapter.setItems(
            listOf(
                FootballMatch("Home", "Away"),
                BasketballMatch("1", "2"),
                BasketballMatch("Home", "Away"),
                FootballMatch("1", "2"),
                BasketballMatch("Home", "Away"),
                BasketballMatch("1", "2"),
                FootballMatch("Home", "Away"),
            )
        )
    }
}