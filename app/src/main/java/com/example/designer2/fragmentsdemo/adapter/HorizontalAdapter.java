package com.example.designer2.fragmentsdemo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
//import com.example.designer2.community.Model.Category;
//import com.example.designer2.community.Model.Posts;
import com.example.designer2.fragmentsdemo.Model.Category;
import com.example.designer2.fragmentsdemo.Model.Posts;
import com.example.designer2.fragmentsdemo.R;

import java.util.List;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.MyViewHolder> {
    private Context myContext;


    private List<Category> mCateg;
    private List<Posts>firstpost;
    RequestOptions option;

    public HorizontalAdapter(Context mContext, List<Category> mCateg) {
        this.myContext = mContext;
        this.mCateg = mCateg;

        option = new RequestOptions().centerCrop().placeholder(R.drawable.loadingshape).error(R.drawable.loadingshape);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, final int i) {
        final View view;
        LayoutInflater inflater = LayoutInflater.from(myContext);
        view = inflater.inflate(R.layout.horizontal_row_item,viewGroup,false);

        final MyViewHolder viewHolder = new MyViewHolder(view);


        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int cId = mCateg.get(viewHolder.getAdapterPosition()).getCategory_id();
                Log.d("CatID.", "onClick===========>: "+cId);
                //RandomData obj = new RandomData();
                //obj.jsonpostrequest(3);

//                if (mCateg.get(viewHolder.getAdapterPosition()).getCategory_name().contentEquals("Business")) {
                    //RandomData obj = new RandomData();




                    //obj.jsonpostrequest(3);




                    // i have to call API which give me result against category ID

                   // int categoryId = mCateg.get(viewHolder.getAdapterPosition()).getCategory_id();

               // Log.d("CATTTTTTTTTTTTTT", "onClick===============: "+categoryId);
                /*
                    PostsApi postApi = new PostsApi();
                    postApi.setCategoryId(categoryId);

                    RandomData randomData = new RandomData();
                    randomData.firstpost.add( postApi.apiGetPosts());
                    /*


                Log.d("Error", "1 ===================================================");
                    randomData.jsonpostrequest(categoryId);
                    Log.d("Error", "==================================================="+randomData.firstpost.toString());
                    //randomData.firstpost = new ArrayList<>();
                    //randomData.firstpost.clear();
                    randomData.firstpost.add((Posts) randomData.firstpost);
                    //randomData.jsonpostrequest();
                    notifyDataSetChanged();
                      */


                //}
            }
        });
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(mCateg.get(i).getCategory_name());




        ///load image from internet by using glibe

        Glide.with(myContext).load(mCateg.get(i).getCategory_image()).apply(option).into(myViewHolder.thumbnail);

    }

    @Override
    public int getItemCount() {
        return mCateg.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;



        ImageView thumbnail;
        RelativeLayout container;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            container = itemView.findViewById(R.id.horizontal_container);

            thumbnail = itemView.findViewById(R.id.image_view);

        }
    }

}
