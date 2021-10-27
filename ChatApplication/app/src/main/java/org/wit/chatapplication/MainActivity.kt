package org.wit.chatapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber.i
import android.widget.Toast
import org.wit.chatapplication.databinding.LoginscreenBinding
import org.wit.chatapplication.models.UserModel
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: LoginscreenBinding
    var user = UserModel()
    val users = ArrayList<UserModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "Welcome123", Toast.LENGTH_SHORT).show()
        Timber.plant(Timber.DebugTree())

        binding.loginbutton.setOnClickListener() {

             user.emailaddress = binding.editTextTextEmailAddress2.text.toString()
            user.password = binding.editTextTextPassword.text.toString()

            if (user.emailaddress.isNotEmpty() && user.password.isNotEmpty()) {
                for (i in users.indices) {
                    if (this.users[i].emailaddress == user.emailaddress)
                    {
                            // email address correct.
                        if (this.users[i].password == user.password)
                        {
                            // email address correct bring them to chat activity
                        }
                        else Toast.makeText(this, "PASSWORD INCORRECT", Toast.LENGTH_SHORT).show()
                    }
                    else Toast.makeText(this, "NO USER WITH THAT ADDRESS", Toast.LENGTH_SHORT).show()
                 //  i("Users[$i]:${this.users[i]}")
                 //   users.add(user.copy())
                }

            }

        }

        binding.registerbutton.setOnClickListener() {
            Toast.makeText(this, "$user.password", Toast.LENGTH_SHORT).show()
        }
    }
}