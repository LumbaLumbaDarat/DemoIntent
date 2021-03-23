package com.lumbalumbadrt.demointent.batch;

import com.lumbalumbadrt.demointent.model.SampleModel;

import java.util.ArrayList;

public class Batch {

    public static ArrayList<SampleModel> sampleModels() {
        ArrayList<SampleModel> sampleModelArrayList = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            boolean condition = false;
            if (i % 2 == 0)
                condition = true;

            float floatValue = i / 3;
            double doubleValue = i / 5;

            sampleModelArrayList.add(new SampleModel(i, "Nilai ".concat(String.valueOf(i)),
                    condition, floatValue, doubleValue));
        }

        return sampleModelArrayList;
    }
}
