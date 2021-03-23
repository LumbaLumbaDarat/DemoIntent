package com.lumbalumbadrt.demointent.model;

import android.os.Parcel;
import android.os.Parcelable;

public class SampleModel implements Parcelable {

    private int sampleIntegerVariable;
    private String sampleStringVariable;
    private boolean sampleBooleanVariable;
    private float sampleFloatVariable;
    private double sampleDoubleVariable;

    public SampleModel() {
    }

    public SampleModel(int sampleIntegerVariable, String sampleStringVariable, boolean sampleBooleanVariable, float sampleFloatVariable, double sampleDoubleVariable) {
        this.sampleIntegerVariable = sampleIntegerVariable;
        this.sampleStringVariable = sampleStringVariable;
        this.sampleBooleanVariable = sampleBooleanVariable;
        this.sampleFloatVariable = sampleFloatVariable;
        this.sampleDoubleVariable = sampleDoubleVariable;
    }

    protected SampleModel(Parcel in) {
        sampleIntegerVariable = in.readInt();
        sampleStringVariable = in.readString();
        sampleBooleanVariable = in.readByte() != 0;
        sampleFloatVariable = in.readFloat();
        sampleDoubleVariable = in.readDouble();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(sampleIntegerVariable);
        dest.writeString(sampleStringVariable);
        dest.writeByte((byte) (sampleBooleanVariable ? 1 : 0));
        dest.writeFloat(sampleFloatVariable);
        dest.writeDouble(sampleDoubleVariable);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SampleModel> CREATOR = new Creator<SampleModel>() {
        @Override
        public SampleModel createFromParcel(Parcel in) {
            return new SampleModel(in);
        }

        @Override
        public SampleModel[] newArray(int size) {
            return new SampleModel[size];
        }
    };

    public int getSampleIntegerVariable() {
        return sampleIntegerVariable;
    }

    public void setSampleIntegerVariable(int sampleIntegerVariable) {
        this.sampleIntegerVariable = sampleIntegerVariable;
    }

    public String getSampleStringVariable() {
        return sampleStringVariable;
    }

    public void setSampleStringVariable(String sampleStringVariable) {
        this.sampleStringVariable = sampleStringVariable;
    }

    public boolean isSampleBooleanVariable() {
        return sampleBooleanVariable;
    }

    public void setSampleBooleanVariable(boolean sampleBooleanVariable) {
        this.sampleBooleanVariable = sampleBooleanVariable;
    }

    public float getSampleFloatVariable() {
        return sampleFloatVariable;
    }

    public void setSampleFloatVariable(float sampleFloatVariable) {
        this.sampleFloatVariable = sampleFloatVariable;
    }

    public double getSampleDoubleVariable() {
        return sampleDoubleVariable;
    }

    public void setSampleDoubleVariable(double sampleDoubleVariable) {
        this.sampleDoubleVariable = sampleDoubleVariable;
    }

    @Override
    public String toString() {
        return "SampleModel{" +
                "sampleIntegerVariable=" + sampleIntegerVariable +
                ", sampleStringVariable='" + sampleStringVariable + '\'' +
                ", sampleBooleanVariable=" + sampleBooleanVariable +
                ", sampleFloatVariable=" + sampleFloatVariable +
                ", sampleDoubleVariable=" + sampleDoubleVariable +
                '}';
    }
}
