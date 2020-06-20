package com.example.android.scorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var scoreTeamA = 0
    var scoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayForTeamA(0)
        displayForTeamB(0)

        teamAthree.setOnClickListener {
            scoreTeamA += 3
            displayForTeamA(scoreTeamA)
        }

        teamAtwo.setOnClickListener {
            scoreTeamA += 2
            displayForTeamA(scoreTeamA)
        }

        freeThrowA.setOnClickListener {
            scoreTeamA += 1
            displayForTeamA(scoreTeamA)
        }

        teamBthree.setOnClickListener {
            scoreTeamB += 3
            displayForTeamB(scoreTeamB)
        }

        teamBtwo.setOnClickListener {
            scoreTeamB += 2
            displayForTeamB(scoreTeamB)
        }

        freeThrowB.setOnClickListener {
            scoreTeamB += 1
            displayForTeamB(scoreTeamB)
        }

        reset.setOnClickListener {
            scoreTeamA = 0
            scoreTeamB = 0
            displayForTeamA(scoreTeamA)
            displayForTeamB(scoreTeamB)
        }
    }

    private fun displayForTeamB(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_b_score)
        scoreView.text = score.toString()
    }

    private fun displayForTeamA(score: Int) {
        val scoreView = findViewById<TextView>(R.id.team_a_score)
        scoreView.text = score.toString()
    }
}