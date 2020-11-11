package ua.honchar.simpleretrofitapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {

    private List<Post> list = new ArrayList<>();
    private Post post;

    public MyRecyclerAdapter(List<Post> list) {
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_data, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView = holder.cv;
        post = list.get(position);

        TextView userId,
                id,
                title,
                body;

        userId = cardView.findViewById(R.id.user_id);
        id = cardView.findViewById(R.id.id);
        title = cardView.findViewById(R.id.title);
        body = cardView.findViewById(R.id.body);

        userId.setText(String.valueOf(post.getUserId()));
        id.setText(String.valueOf(post.getId()));
        title.setText(post.getTitle());
        body.setText(post.getBody());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cv;
        public ViewHolder(@NonNull CardView itemView) {
            super(itemView);
            cv = itemView;
        }
    }
}
