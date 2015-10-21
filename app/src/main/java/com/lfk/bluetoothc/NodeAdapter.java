package com.lfk.bluetoothc;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by liufengkai on 15/10/6.
 */
public class NodeAdapter extends RecyclerView.Adapter<NodeAdapter.NodeViewHolder> {
    private ArrayList<NodeInfo> userList;
    private LayoutInflater inflater;
    private Context context;
    private ItemOnClick itemOnClick;

    public NodeAdapter(ArrayList<NodeInfo> arrayList, Context context) {
        this.userList = arrayList;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    public void setItemOnClick(ItemOnClick itemOnClick) {
        this.itemOnClick = itemOnClick;
    }

    @Override
    public NodeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View wrapper = inflater.inflate(R.layout.card_item,parent,false);
        return new NodeViewHolder(wrapper,
                (ImageView)wrapper.findViewById(R.id.img),
                (TextView)wrapper.findViewById(R.id.text),
                (TextView)wrapper.findViewById(R.id.code));
    }

    @Override
    public void onBindViewHolder(NodeViewHolder holder, int position) {
        NodeInfo nodeInfo = userList.get(position);
        holder.img.setImageResource(nodeInfo.getImg());
        holder.text.setText(nodeInfo.getText());
        holder.code.setText(nodeInfo.getCODE());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class NodeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private ImageView img;
        private TextView text;
        private TextView code;

        public NodeViewHolder(View itemView, ImageView img, TextView text, TextView code) {
            super(itemView);
            this.img = img;
            this.text = text;
            this.code = code;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            NodeInfo nodeInfo = userList.get(getAdapterPosition());
            itemOnClick.OnItemClick(view,nodeInfo.getText(),nodeInfo.getCODE());
            nodeInfo = null;
        }
    }
}
