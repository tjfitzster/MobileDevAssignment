package org.wit.chatapplication.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.wit.chatapplication.R
import org.wit.chatapplication.databinding.MessageItemBinding
import org.wit.chatapplication.models.Message
import org.wit.chatapplication.utils.Constants.RECIEVE_ID
import org.wit.chatapplication.utils.Constants.SEND_ID

class MessagingAdapter: RecyclerView.Adapter<MessagingAdapter.MessageViewHolder>() {

    private lateinit var binding: MessageItemBinding

    var messagesList = mutableListOf<Message>()

    inner class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                //Remove message on the item clicked
                //messagesList.removeAt(adapterPosition)
                messagesList.removeAt(getBindingAdapterPosition())
                notifyItemRemoved(getBindingAdapterPosition())
              //  notifyItemRemoved(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.message_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return messagesList.size
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {


        val currentMessage = messagesList[position]

        when (currentMessage.id) {
            SEND_ID -> {
              //  holder.itemView.tv_message.apply {
               //     text = currentMessage.message
                  //  visibility = View.VISIBLE
               // }
                binding.tvMessage.apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
             //   holder.itemView.tv_bot_message.visibility = View.GONE
                   binding.tvBotMessage.visibility = View.GONE
            }
            RECIEVE_ID -> {
               // holder.itemView.tv_bot_message.apply {
               //     text = currentMessage.message
                 //   visibility = View.VISIBLE
              //  }
                binding.tvBotMessage.apply {
                    text = currentMessage.message
                    visibility = View.VISIBLE
                }
               // holder.itemView.tv_message.visibility = View.GONE
                binding.tvMessage.visibility = View.GONE
            }
        }
    }

    fun insertMessage(message: Message) {
        this.messagesList.add(message)
        notifyItemInserted(messagesList.size)
    }




}