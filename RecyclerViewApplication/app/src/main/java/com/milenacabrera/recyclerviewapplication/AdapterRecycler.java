package com.milenacabrera.recyclerviewapplication;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mile on 15/06/17.
 */

public class AdapterRecycler extends RecyclerView.Adapter<AdapterRecycler.ContactViewHolder> {

    List<Contact> contactList = new ArrayList<Contact>();

    public AdapterRecycler (List<Contact> contactList) {
        this.contactList = contactList;
    }


    public static class ContactViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView textViewNombre;
        TextView textViewTelefono;
        ImageView imageView;

        public ContactViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView)itemView.findViewById(R.id.card_contacto);
            textViewNombre = (TextView)itemView.findViewById(R.id.txt_nombre);
            textViewTelefono = (TextView)itemView.findViewById(R.id.txt_telefono);
            imageView = (ImageView)itemView.findViewById(R.id.img_contacto);
        }
    }
    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        ContactViewHolder contactViewHolder = new ContactViewHolder(v);
        return contactViewHolder;

    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {
        holder.textViewNombre.setText(contactList.get(position).nombre);
        holder.textViewTelefono.setText(contactList.get(position).telefono);
        holder.imageView.setImageResource(contactList.get(position).foto);
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
