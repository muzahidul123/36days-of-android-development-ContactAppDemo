package com.example.contactappdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {

    private List<Contact> contacts;
    private Context context;

    public ContactAdapter(List<Contact> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.user_model_design, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        final Contact contact = contacts.get(position);

        holder.nameTV.setText(contact.getName());
        holder.photoIV.setImageResource(contact.getPhoto());
        holder.callIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, contact.getName(), Toast.LENGTH_SHORT).show();
                
            }
        });

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContactDetailsActivity.class);
                intent.putExtra("name", contact.getName());
                intent.putExtra("phone", contact.getPhoneno());
                intent.putExtra("image", String.valueOf(contact.getPhoto()));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView photoIV, callIV;
        private TextView nameTV;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            photoIV = itemView.findViewById(R.id.photoIV);
            callIV = itemView.findViewById(R.id.callIV);
            nameTV = itemView.findViewById(R.id.nameTV);
        }
    }
}
