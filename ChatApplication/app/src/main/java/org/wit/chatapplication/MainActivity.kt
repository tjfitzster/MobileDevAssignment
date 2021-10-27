package org.wit.chatapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber.i
import android.widget.Toast
import org.wit.chatapplication.databinding.LoginscreenBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LoginscreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()

        binding.loginbutton.setOnClickListener() {
            Toast.makeText(this, "LOGIN BUTTON PRESSED", Toast.LENGTH_SHORT).show()
        }

        binding.registerbutton.setOnClickListener() {
            Toast.makeText(this, "REGISTER BUTTON PRESSED", Toast.LENGTH_SHORT).show()
        }
    }
}