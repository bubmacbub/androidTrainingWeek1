package cto.its.ny.gov.bullseye

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cto.its.ny.gov.bullseye.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate((layoutInflater))
        val view = binding.root
        setContentView(view)

        binding.hitMe.setOnClickListener {
            Log.i("Button clicked", "Click listener msg")
            showResult()
        }
    }

    private fun showResult()
    {
        val dialogFactory = AlertDialog.Builder(this)
        dialogFactory.setTitle(getString(R.string.resultDialogTitle))
        dialogFactory.setPositiveButton(R.string.hitMe) {dialog, _ -> {
            dialog.dismiss()
        }}

        dialogFactory.create().show()
    }
}