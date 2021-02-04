package com.kamaltata.shimmerapp.tgreefragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.kamaltata.shimmerapp.R
import com.kamaltata.shimmerapp.firstfragment.ThreeContract
import com.kamaltata.shimmerapp.secondfragment.ThreeAdapterRecycleView

class ThreeFragment: Fragment(), ThreeContract.Screen {

    private val presenter: ThreeContract.Presenter = ThreePresenter()
    private lateinit var shimmer: ShimmerFrameLayout

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.screen = this
        shimmer = view.findViewById(R.id.shimmer_view_container3)
        shimmer.startShimmer()
        presenter.requestData()
    }

    override fun showData(data: List<String>) {
        shimmer.stopShimmer()
        shimmer.visibility = View.GONE
        val rv = view?.findViewById<RecyclerView>(R.id.rv_three_fragment)
        rv?.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = ThreeAdapterRecycleView(data)
        }
    }

    override fun onPause() {
        super.onPause()
        shimmer.stopShimmer()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        presenter.screen = null
    }
}