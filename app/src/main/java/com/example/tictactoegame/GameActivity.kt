package com.example.tictactoegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

    }
        fun buClick(view: View){
            var cellId=0
            val butSelected=view as Button

            when(butSelected.id){


                R.id.but1 ->
                    cellId=1
                R.id.but2 ->
                    cellId=2
                R.id.but3 ->
                    cellId=3
                R.id.but4 ->
                    cellId=4
                R.id.but5 ->
                    cellId=5
                R.id.but6 ->
                    cellId=6
                R.id.but7 ->
                    cellId=7
                R.id.but8 ->
                    cellId=8
                R.id.but9 ->
                    cellId=9



            }
            Log.d("buClick: ",butSelected.id.toString())
            Log.d("buClick: cellId ",butSelected.id.toString())

            playGame(cellId,butSelected)
        }


        var activePlayer=1
        var player1= ArrayList<Int>()
        var player2= ArrayList<Int>()


        fun playGame(cellId: Int, butSelected: Button){


            if(activePlayer==1){

                butSelected.text="X"
                butSelected.setBackgroundResource(R.color.red)
                player1.add(cellId)
                activePlayer=2
            }else{
                butSelected.text="O"
                butSelected.setBackgroundResource(R.color.green)
                player2.add(cellId)
                activePlayer=1


            }
            butSelected.isEnabled=false

            checkWinner()


        }

        fun checkWinner(){
            var winner = -1

            //Row 1 winner
            if(player1.contains(1) && player1.contains(2) &&player1.contains(3)){

                winner=1

            }
            if(player2.contains(1) && player2.contains(2) &&player2.contains(3)){

                winner=2

            }

            //Row 2 winner
            if(player1.contains(4) && player1.contains(5) &&player1.contains(6)){

                winner=1

            }
            if(player2.contains(4) && player2.contains(5) &&player2.contains(6)){

                winner=2

            }

            //row 3 winner
            if(player1.contains(7) && player1.contains(8) &&player1.contains(9)){

                winner=1

            }
            if(player2.contains(7) && player2.contains(8) &&player2.contains(9)){

                winner=2

            }

            //col1 winner
            if(player1.contains(1) && player1.contains(4) &&player1.contains(7)){

                winner=1

            }
            if(player2.contains(1) && player2.contains(4) &&player2.contains(7)){

                winner=2

            }
            //col2 winner
            if(player1.contains(2) && player1.contains(5) &&player1.contains(8)){

                winner=1

            }
            if(player2.contains(2) && player2.contains(5) &&player2.contains(8)){

                winner=2

            }
            //col3 winner

            if(player1.contains(3) && player1.contains(6) &&player1.contains(9)){

                winner=1

            }
            if(player2.contains(3) && player2.contains(6) &&player2.contains(9)){

                winner=2

            }

            //cross 1 winner

            if(player1.contains(1) && player1.contains(5) &&player1.contains(9)){

                winner=1

            }
            if(player2.contains(1) && player2.contains(5) &&player2.contains(9)){

                winner=2

            }

            //cross 2 winner

            if(player1.contains(3) && player1.contains(5) &&player1.contains(7)){

                winner=1

            }
            if(player2.contains(3) && player2.contains(5) &&player2.contains(7)){

                winner=2

            }



            if(winner==1){

                Toast.makeText(this," Player 1 win this match", Toast.LENGTH_LONG).show()


//
//                val dialog=Dialog(this)
//        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//        dialog.setCancelable(false)
//            dialog.setContentView(R.layout.result_alert)
//            dialog.result.text = "Player 1 win the Game"
//            dialog.plyBtn.setOnClickListener{
//
//                val intent = Intent(this,MainActivity::class.java)
//                finish()
//                startActivity(intent)
//
//            }
//            dialog.exitBtn.setOnClickListener{
//                val intent= Intent(this,GameActivity::class.java)
//                startActivity(intent)
//            }
//            dialog.show()



            }else if(winner==2){

                Toast.makeText(this,"Player 2 win this match", Toast.LENGTH_LONG).show()



//
//            val dialog=Dialog(this)
//            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
//            dialog.setCancelable(false)
//            dialog.setContentView(R.layout.result_alert)
//            dialog.result.text = "Player 2 win the Game"
//            dialog.plyBtn.setOnClickListener{
//
//                val intent = Intent(this,MainActivity::class.java)
//                finish()
//                startActivity(intent)
//
//            }
//            dialog.exitBtn.setOnClickListener{
//                val intent= Intent(this,GameActivity::class.java)
//                startActivity(intent)
//            }
//            dialog.show()


            }

        }



    }
