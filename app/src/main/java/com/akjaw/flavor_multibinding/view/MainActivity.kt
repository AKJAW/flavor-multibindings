package com.akjaw.flavor_multibinding.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.akjaw.flavor_multibinding.R
import com.akjaw.football.view.adapter.MatchListAdapter
import com.akjaw.football.view.adapter.MatchListAdapterFactory
import com.akjaw.framework.domain.MatchesProvider
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: MatchListAdapter
    private lateinit var recyclerView: RecyclerView

    @Inject
    lateinit var  matchesListAdapterFactory: MatchListAdapterFactory
    @Inject
    lateinit var  matchesProvider: MatchesProvider

    override fun onCreate(savedInstanceState: Bundle?) {
        val component = (application as FlavorMultibindingApp).applicationComponent
        component.inject(this)
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

        adapter.setItems(matchesProvider.get())
    }
}