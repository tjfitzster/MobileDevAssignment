package org.wit.chatapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

         //   Toast.makeText(this, "Welcome123", Toast.LENGTH_SHORT).show()

        binding.loginbutton.setOnClickListener() {

            user.emailaddress = binding.editTextTextEmailAddress2.text.toString()
            user.password = binding.editTextTextPassword.text.toString()

            if(users.size > 0){
                // More than one user

                for (i in users.indices) {
                    if (this.users[i].emailaddress.equals(user.emailaddress))
                    {
                        // email address correct

                        if (this.users[i].password.equals(user.password))
                        {
                            // PASSWROD correct
                            Toast.makeText(this, "PASSWORD CORRECT", Toast.LENGTH_SHORT).show()
                        }
                        else{
                            Toast.makeText(this, "PASSWORD INCORRECT", Toast.LENGTH_SHORT).show()
                        }
                    }
                    else{
                        Toast.makeText(this, "NO ONE IS REGISTERED WITH THAT EMAIL ADDRESS", Toast.LENGTH_SHORT).show()
                    }

                }
            }
            else{
                //YOU MUST CREATE A NEW USER
                Toast.makeText(this, "PLEASE REGISTER A USER", Toast.LENGTH_SHORT).show()
            }
        }


        binding.registerbutton.setOnClickListener() {
            Toast.makeText(this, "REGISTER BUTTON PRESSED", Toast.LENGTH_SHORT).show()

            if ((user.emailaddress.isNotEmpty()) && (user.password.isNotEmpty())) {
                users.add(user.copy())
                Toast.makeText(this, "REGISTERING A NEW USER", Toast.LENGTH_SHORT).show()
            }

        }
    }
}