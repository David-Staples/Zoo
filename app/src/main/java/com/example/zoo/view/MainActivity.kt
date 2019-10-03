package com.example.zoo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.zoo.R
import com.example.zoo.model.AnimalName
import com.example.zoo.model.ExhibitsName
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {


    lateinit var mediaPlayer: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        override fun onCreate( savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_exhibits)
            toExhibits.setOnClickListener(){
                val intent = Intent( this, Exihibits :: class.java)
            }
        }
    }


    fun animalView() {

        val goToAnimalName = AnimalName("", "", "", "")

        var animals = mutableListOf<Animal>()
        animals.add(("Tiger", "Predator", "medium", "Asia"())
        animals.add(("Orca", "Aquatic", "large", "Ocian"))
        animals.add(("Eagle", "Bird", "small", "America"))
    }

    fun exhibitsView{
        val toExhibitsList = ExhibitsName("")

        var exhibits = mutableListOf<Exihibits>()

        exhibits.add(("Birds"))
        exhibits.add (("Predators"))
        exhibits.add (("Aquatic"))
        exhibits.add (("Primates"))
    }
}


