package com.example.designer2.fragmentsdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
//import com.example.designer2.community.Activities.SinglePostActivity;
//import com.example.designer2.community.Model.Posts;
import com.example.designer2.fragmentsdemo.Model.Posts;
import com.example.designer2.fragmentsdemo.R;

import java.util.ArrayList;
import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<VerticalAdapter.MyViewHolder> {
    private Context mContext;
    private List<Posts> mData;

    RequestOptions option;

    public VerticalAdapter(Context mContext, List<Posts> mData) {
        this.mContext = mContext;
        this.mData = mData;




        ///Request option for glide


        option = new RequestOptions().centerCrop().placeholder(R.drawable.loadingshape).error(R.drawable.loadingshape);
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.vertical_row_item,viewGroup,false);
        final MyViewHolder viewHolder = new MyViewHolder(view);
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Intent i  =  new Intent(mContext,SinglePostActivity.class);
              //  i.putExtra("name",mData.get(viewHolder.getAdapterPosition()).getTitle());
               // i.putExtra("description",mData.get(viewHolder.getAdapterPosition()).getDescription());
              //  i.putExtra("username",mData.get(viewHolder.getAdapterPosition()).getUsername());
              //  i.putExtra("category_id",mData.get(viewHolder.getAdapterPosition()).getCategory_id());


              //  i.putExtra("date",mData.get(viewHolder.getAdapterPosition()).getCreatedat());
              //  i.putExtra("img",mData.get(viewHolder.getAdapterPosition()).getImgUrl());
               // mContext.startActivity(i);

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_title.setText(mData.get(i).getTitle());
        myViewHolder.tv_name.setText(mData.get(i).getUsername());
        myViewHolder.tv_date.setText(mData.get(i).getCreatedat());





        ///load image from internet by using glibe

        Glide.with(mContext).load(mData.get(i).getImgUrl()).apply(option).into(myViewHolder.img_thumbnail);

    }

    @Override
    public int getItemCount() {
        return mData.size();

    }



    public void setfilter(List<Posts> list)
    {
        mData=new ArrayList<>();
        mData.addAll(list);
        notifyDataSetChanged();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv_title;
        TextView tv_name;
        TextView tv_date;


        ImageView img_thumbnail;
        LinearLayout view_container;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            view_container = itemView.findViewById(R.id.container_vertical);
            tv_name = itemView.findViewById(R.id.author_name);
            tv_date = itemView.findViewById(R.id.date_id);
            tv_title = itemView.findViewById(R.id.post_list_title);

            img_thumbnail = itemView.findViewById(R.id.thumbnail_id);
        }
    }
}
