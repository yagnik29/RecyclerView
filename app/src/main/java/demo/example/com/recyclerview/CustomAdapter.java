package demo.example.com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by admin on 2/24/2017.
 */
public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    Context context;
    ArrayList<HashMap<String,String>> list=new ArrayList<>();


    public CustomAdapter(Context context, ArrayList<HashMap<String, String>> arrayList) {
        this.context=context;
        this.list=arrayList;
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
        return new MyViewHolder(view);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView txtname,txtemail;
        public MyViewHolder(View itemView) {
            super(itemView);
            txtemail=(TextView)itemView.findViewById(R.id.txtemail);
            txtname=(TextView)itemView.findViewById(R.id.txtname);
        }
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {

        HashMap<String,String>hm=list.get(position);
        holder.txtname.setText(hm.get("name"));
        holder.txtemail.setText(hm.get("email"));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
