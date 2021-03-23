package com.lumbalumbadrt.demointent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.lumbalumbadrt.demointent.adapter.SampleModelAdapter;
import com.lumbalumbadrt.demointent.batch.Batch;
import com.lumbalumbadrt.demointent.databinding.ActivityMainBinding;
import com.lumbalumbadrt.demointent.model.SampleModel;
import com.lumbalumbadrt.demointent.util.AppConstant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SampleModelAdapter sampleModelAdapter = new SampleModelAdapter();
        sampleModelAdapter.setSampleModelArrayList(Batch.sampleModels());
        sampleModelAdapter.notifyDataSetChanged();
        sampleModelAdapter.setOnClickItemSampleModelAdapter(sampleModel ->
        {
            Intent intent = new Intent(this, SampleModelActivity.class);
            intent.putExtra(AppConstant.SAMPLE_MODEL, sampleModel);
            startActivity(intent);
        });

        binding.rvSampleModel.setLayoutManager(
                new LinearLayoutManager(this,
                        LinearLayoutManager.VERTICAL,
                        false));
        binding.rvSampleModel.setAdapter(sampleModelAdapter);

    }
}