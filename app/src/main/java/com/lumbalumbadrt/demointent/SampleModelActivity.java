package com.lumbalumbadrt.demointent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.lumbalumbadrt.demointent.databinding.ActivitySampleModelBinding;
import com.lumbalumbadrt.demointent.model.SampleModel;
import com.lumbalumbadrt.demointent.util.AppConstant;

public class SampleModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySampleModelBinding binding =
                ActivitySampleModelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SampleModel sampleModel = null;
        if (getIntent() != null)
            sampleModel = getIntent().getParcelableExtra(AppConstant.SAMPLE_MODEL);

        if (sampleModel == null)
            sampleModel = new SampleModel();

        binding.tvSampleIntegerDetail.setText("Ini Sample Model Variable Integer dari Adapter : ".
                concat(String.valueOf(sampleModel.getSampleIntegerVariable())));
        binding.tvSampleStringDetail.setText("Ini Sample Model Variable String dari Adapter : ".
                concat(sampleModel.getSampleStringVariable()));
        binding.tvSampleBooleanDetail.setText("Ini Sample Model Variable Boolean dari Adapter : ".
                concat(String.valueOf(sampleModel.isSampleBooleanVariable())));
        binding.tvSampleFloatDetail.setText("Ini Sample Model Variable Float dari Adapter : ".
                concat(String.valueOf(sampleModel.getSampleFloatVariable())));
        binding.tvSampleDoubleDetail.setText("Ini Sample Model Variable Double dari Adapter : ".
                concat(String.valueOf(sampleModel.getSampleDoubleVariable())));
    }
}