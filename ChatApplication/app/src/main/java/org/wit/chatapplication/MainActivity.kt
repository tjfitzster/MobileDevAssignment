package org.wit.chatapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber.i
import android.widget.Toast
import org.wit.chatapplication.databinding.LoginscreenBinding
import org.wit.chatapplication.models.UserModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LoginscreenBinding
    var user = UserModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show()

        binding.loginbutton.setOnClickListener() {

             user.emailaddress = binding.editTextTextEmailAddress2.text.toString()
            user.password = binding.editTextTextPassword.text.toString()

            Toast.makeText(this, "$user.emailaddress", Toast.LENGTH_SHORT).show()
        }

        binding.registerbutton.setOnClickListener() {
            Toast.makeText(this, "$user.password", Toast.LENGTH_SHORT).show()
        }
    }
}