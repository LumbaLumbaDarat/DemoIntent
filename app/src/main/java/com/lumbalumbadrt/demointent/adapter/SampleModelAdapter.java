package com.lumbalumbadrt.demointent.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lumbalumbadrt.demointent.databinding.LayoutModelSampleBinding;
import com.lumbalumbadrt.demointent.model.SampleModel;

import java.util.ArrayList;

public class SampleModelAdapter extends RecyclerView.Adapter<SampleModelAdapter.HolderView> {

    private Context context;
    private final ArrayList<SampleModel> sampleModelArrayList = new ArrayList<>();

    private OnClickItemSampleModelAdapter onClickItemSampleModelAdapter;

    public SampleModelAdapter() {
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setSampleModelArrayList(ArrayList<SampleModel> sampleModelArrayList) {
        this.sampleModelArrayList.clear();
        this.sampleModelArrayList.addAll(sampleModelArrayList);
        notifyDataSetChanged();
    }

    public void setOnClickItemSampleModelAdapter(OnClickItemSampleModelAdapter onClickItemSampleModelAdapter) {
        this.onClickItemSampleModelAdapter = onClickItemSampleModelAdapter;
    }

    @NonNull
    @Override
    public SampleModelAdapter.HolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        setContext(parent.getContext());
        LayoutModelSampleBinding binding = LayoutModelSampleBinding.inflate(LayoutInflater.
                from(parent.getContext()), parent, false);
        return new SampleModelAdapter.HolderView(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SampleModelAdapter.HolderView holder, int position) {
        SampleModel sampleModel = sampleModelArrayList.get(position);
        holder.bind(context, sampleModel);
        if (onClickItemSampleModelAdapter != null)
            holder.itemView.setOnClickListener(view ->
                    onClickItemSampleModelAdapter.onClickItem(sampleModel));
    }

    @Override
    public int getItemCount() {
        return sampleModelArrayList.size();
    }

    public interface OnClickItemSampleModelAdapter {
        void onClickItem(SampleModel sampleModel);
    }

    public static class HolderView extends RecyclerView.ViewHolder {

        LayoutModelSampleBinding binding;
        public HolderView(LayoutModelSampleBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Context context, SampleModel sampleModel) {
            binding.tvSampleInteger.setText("Ini Data bertipe Integer : ".
                    concat(String.valueOf(sampleModel.getSampleIntegerVariable())));
            binding.tvSampleString.setText("Ini Data bertipe String : ".
                    concat(sampleModel.getSampleStringVariable()));
            binding.tvSampleBoolean.setText("Ini Data bertipe Boolean : ".
                    concat(String.valueOf(sampleModel.isSampleBooleanVariable())));
            binding.tvSampleFloat.setText("Ini Data bertipe Float : ".
                    concat(String.valueOf(sampleModel.getSampleFloatVariable())));
            binding.tvSampleDoube.setText("Ini Data bertipe Double : ".
                    concat(String.valueOf(sampleModel.getSampleDoubleVariable())));
        }
    }
}
