package com.example.cvgratis;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FaqAdapter extends RecyclerView.Adapter<FaqAdapter.FaqVH> {

    private static final String TAG = "MovieAdapter";
    List<Faq> faqList;

    public FaqAdapter(List<Faq> faqList) {
        this.faqList = faqList;
    }

    @NonNull
    @Override
    public FaqVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.faq_recycler, parent, false);
        return new FaqVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaqVH holder, int position) {

        Faq faq = faqList.get(position);
        holder.question.setText(faq.getQuestion());
        holder.answer.setText(faq.getAnswer());

        boolean isExpanded = faqList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);

    }

    @Override
    public int getItemCount() {
        return faqList.size();
    }

    class FaqVH extends RecyclerView.ViewHolder {

        private static final String TAG = "FaqVH";

        ConstraintLayout expandableLayout;
        TextView question, answer;

        public FaqVH(@NonNull final View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.question);
            answer = itemView.findViewById(R.id.answer);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);


            question.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Faq faq = faqList.get(getAdapterPosition());
                    faq.setExpanded(!faq.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });
        }
    }
}