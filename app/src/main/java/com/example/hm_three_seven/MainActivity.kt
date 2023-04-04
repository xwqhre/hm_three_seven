package com.example.hm_three_seven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hm_three_seven.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: CatsAdapter
    var arrayListCats: ArrayList<CatsModel> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillRecycleView()
        binding.recycleView.adapter = adapter
    }

    private fun fillRecycleView() {
        arrayListCats.add(CatsModel("Persian cat",10000,R.drawable.persian))
        arrayListCats.add(CatsModel("Siamese cat",2900,R.drawable.img))
        arrayListCats.add(CatsModel("Pixie bob",1950,R.drawable.pixie))
        arrayListCats.add(CatsModel("Cornish Rex",1060,R.drawable.cornish))
        arrayListCats.add(CatsModel("Maine Coon",2400,R.drawable.maine))
        arrayListCats.add(CatsModel("Abyssinian cat",3800,R.drawable.abyssinian))
        arrayListCats.add(CatsModel("Burmese cat",5300,R.drawable.burmese))

        adapter = CatsAdapter(arrayListCats)
        binding.recycleView.adapter
    }
}