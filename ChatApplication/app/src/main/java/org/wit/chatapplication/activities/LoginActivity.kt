package org.wit.chatapplication.activities


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import org.wit.chatapplication.databinding.LoginscreenBinding
import org.wit.chatapplication.models.UserModel


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginscreenBinding
    var user = UserModel()
    var user1 = UserModel()
    var user2 = UserModel()
    var user3 = UserModel()
    val users = ArrayList<UserModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user1.username = "Monty"
        user2.username = "Chris"
        user3.username = "TJ"

         //   Toast.makeText(this, "Welcome123", Toast.LENGTH_SHORT).show()

        binding.loginbutton.setOnClickListener() {

            this.user.username = binding.editTextTextPassword.text.toString()


            val intent = Intent(this, MainActivity::class.java)

                when (this.user.username) {
                    user1.username -> startActivity(intent)
                    user2.username -> startActivity(intent)
                    user3.username -> startActivity(intent)
                    else -> Toast.makeText(this, "INCORRECT USERNAME", Toast.LENGTH_SHORT).show()
                }
        //    if(users.size > 0){
                // More than one user

              //  for (i in users.indices) {
                //    if (this.users[i].emailaddress.equals(user.emailaddress))
                   // {
                    //    val intent = Intent(this, MainActivity::class.java)
                     //   startActivity(intent)

                        // email address correct

                        //if (this.users[i].password.equals(user.password))
                       // {
                            // PASSWROD correct
                       //     Toast.makeText(this, "PASSWORD CORRECT", Toast.LENGTH_SHORT).show()
                     //   }
                       // else{
                       //     Toast.makeText(this, "PASSWORD INCORRECT", Toast.LENGTH_SHORT).show()
                        //    Toast.makeText(this, "this.$users[i].password", Toast.LENGTH_SHORT).show()
                      //  }
                  //  }
                   // else{
                    //    Toast.makeText(this, "NO ONE IS REGISTERED WITH THAT EMAIL ADDRESS", Toast.LENGTH_SHORT).show()
                  //  }

              //  }
          //  }
          //  else{
                //YOU MUST CREATE A NEW USER
             //   Toast.makeText(this, "PLEASE REGISTER A USER", Toast.LENGTH_SHORT).show()
          //  }
        }


      //  binding.registerbutton.setOnClickListener() {
        //    Toast.makeText(this, "REGISTER BUTTON PRESSED", Toast.LENGTH_SHORT).show()

         //   if ((user.emailaddress.isNotEmpty()) && (user.password.isNotEmpty())) {
            //    users.add(user.copy())
             //   Toast.makeText(this, "REGISTERING A NEW USER", Toast.LENGTH_SHORT).show()
          //  }

        }
    }
//}