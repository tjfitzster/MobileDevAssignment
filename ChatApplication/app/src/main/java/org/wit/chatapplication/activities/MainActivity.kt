package org.wit.chatapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import org.wit.chatapplication.databinding.ActivityChatBinding
import org.wit.chatapplication.utils.Time


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSend.setOnClickListener {
            sendMessage()
                                            }

       binding.etMessage.setOnClickListener {
         //   GlobalScope.launch {
            //    delay(100)

          //      withContext(Dispatchers.Main) {
              //      rv_messages.scrollToPosition(adapter.itemCount - 1)

                                        }
            }

    private fun sendMessage() {
        val message = binding.etMessage.text.toString()
        val timeStamp = Time.timeStamp()

        if (message.isNotEmpty()) {
            //Adds it to our local list
          //  messagesList.add(Message(message, SEND_ID, timeStamp))
          //  binding.etMessage.setText("")

           // adapter.insertMessage(Message(message, SEND_ID, timeStamp))
          //  binding.rvMessages.scrollToPosition(adapter.itemCount - 1)

        //    botResponse(message)
        }
    }
}
