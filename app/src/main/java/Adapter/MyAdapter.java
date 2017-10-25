package Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jtanuki.go.recyclerview6.Main2Activity;
import com.jtanuki.go.recyclerview6.R;

import java.util.List;

import Model.ListItem;

/**
 * Created by go on 10/25/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

    private Context context;
    private List<ListItem> listItems;

    public MyAdapter(Context context, List listItems){

        this.context = context;
        this.listItems = listItems;

    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_rw,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        ListItem item = listItems.get(position);

        holder.name.setText(item.getName());
        holder.description.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView name;
        public TextView description;


        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);

        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            ListItem item = listItems.get(position);

            Intent intent = new Intent(context, Main2Activity.class);

            intent.putExtra("a","apples");
            intent.putExtra("b","mangos");

            context.startActivity(intent);
        }
    }
}
