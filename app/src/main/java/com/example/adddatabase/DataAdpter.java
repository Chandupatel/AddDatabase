package com.example.adddatabase;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DataAdpter extends RecyclerView.Adapter<DataAdpter.DataViewHoldre> { @NonNull
    Context Conx;
    List<User> UserList;

    public DataAdpter(@NonNull Context conx, List<User> userList) {
        Conx = conx;
        UserList = userList;
    }

    @Override
    public DataViewHoldre onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(Conx).inflate(R.layout.data_layout,
                viewGroup,false);
        DataViewHoldre DvHolder = new DataViewHoldre(view);
        return DvHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHoldre dataViewHoldre, int i) {
        User Use = UserList.get(i);
        dataViewHoldre.Et1.setText(Use.getName());
        dataViewHoldre.Et2.setText(Use.getEmail());
        dataViewHoldre.Et3.setText(Use.getMobile_no());
        dataViewHoldre.Et4.setText(Use.getAdderss());
        dataViewHoldre.Et5.setText(Use.getPass());


    }

    @Override
    public int getItemCount() {
        return UserList.size();
    }

    class DataViewHoldre extends RecyclerView.ViewHolder{
            ImageView imgview;
            TextView Et1,Et2,Et3,Et4,Et5;
        public DataViewHoldre(@NonNull View itemView) {
            super(itemView);

            Et1 = itemView.findViewById(R.id.FName);
            Et2 = itemView.findViewById(R.id.FEmail);
            Et3 = itemView.findViewById(R.id.FMobil);
            Et4 = itemView.findViewById(R.id.FAddress);
            Et5 = itemView.findViewById(R.id.FPass);

        }
    }
}
