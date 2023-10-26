package com.example.capstoneproject.favorite

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.capstoneproject.core.ui.TeamAdapter
import com.example.capstoneproject.favorite.databinding.ActivityFavoriteBinding
import com.example.capstoneproject.favorite.di.favoriteModule
import com.example.capstoneproject.ui.detail.DetailActivity
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding
    private val favoriteViewModel: FavoriteViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = getString(com.example.capstoneproject.R.string.menu_favorite)

        loadKoinModules(favoriteModule)

        val teamAdapter = TeamAdapter()

        teamAdapter.onItemClick = { selectedData ->
            val intent = Intent(this@FavoriteActivity, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
            startActivity(intent)
        }

        favoriteViewModel.favoriteTeam.observe(this@FavoriteActivity) { dataTeams ->
            teamAdapter.setData(dataTeams)
            binding.viewEmpty.root.visibility =
                if (dataTeams.isNotEmpty()) View.GONE else View.VISIBLE
        }

        with(binding.rvTeams) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = teamAdapter
        }
    }
}