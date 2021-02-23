package com.akjaw.flavor_multibinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.flavor_multibinding.R
import com.akjaw.flavor_multibinding.view.adapter.basketball.BasketballMatch
import com.akjaw.flavor_multibinding.view.adapter.football.FootballMatch
import com.akjaw.flavor_multibinding.view.adapter.basketball.basketballMatchesAdapterDelegate
import com.akjaw.flavor_multibinding.view.adapter.football.footballMatchesAdapterDelegate
import com.hannesdorfmann.adapterdelegates4.ListDelegationAdapter


class MainActivity : AppCompatActivity() {

    private val adapter = ListDelegationAdapter(
        footballMatchesAdapterDelegate(),
        basketballMatchesAdapterDelegate(),
    )
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        adapter.items = listOf(
            FootballMatch("Home", "Away"),
            BasketballMatch("1", "2"),
            BasketballMatch("Home", "Away"),
            FootballMatch("1", "2"),
            BasketballMatch("Home", "Away"),
            BasketballMatch("1", "2"),
            FootballMatch("Home", "Away"),
        )
    }
}