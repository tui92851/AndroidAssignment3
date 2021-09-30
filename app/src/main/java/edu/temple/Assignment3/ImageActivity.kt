package edu.temple.Assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uni.image.R

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "Kyle Hrivnak's Movies"

        val manager = GridLayoutManager(this, 2)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = manager
        recyclerView.adapter = ImageAdapter(this, getMovieData())
    }

    private fun getMovieData():ArrayList<MovieModel>{
        val list = ArrayList<MovieModel>()
        list.add(MovieModel("Deadpool", R.drawable.deadpool))
        list.add(MovieModel("Hobbs and Shaw", R.drawable.fast_furious_presents_hobbs_shaw))
        list.add(MovieModel("Free Guy", R.drawable.free_guy))
        list.add(MovieModel("Deadpool 2", R.drawable.deadpool_2))
        list.add(MovieModel("Green Lantern", R.drawable.green_lantern))
        list.add(MovieModel("Life", R.drawable.life_theatrical))
        list.add(MovieModel("Pokemon Detective Pikachu", R.drawable.pokemon_detective_pikachu))
        list.add(MovieModel("The Amityville Horror", R.drawable.the_amityville_horror))
        list.add(MovieModel("The Croods", R.drawable.the_croods))
        list.add(MovieModel("The Hitman's Bodyguard", R.drawable.the_hitmans_bodyguard))
        return list
    }
}