package com.example.android.miwok;

public class Word {
    final int NO_IMAGE_PROVIDED = -1;

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageSourceId = NO_IMAGE_PROVIDED;
    private int mAudioSourceId;


    public Word(String defaultTranslation, String miwokTranslation, int audioSourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioSourceId = audioSourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageSourceId, int audioSourceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageSourceId = imageSourceId;
        mAudioSourceId = audioSourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageSourceId;
    }

    public boolean hasImage(){return mImageSourceId != NO_IMAGE_PROVIDED;}

    public int getAudioResourceId() {
        return mAudioSourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "NO_IMAGE_PROVIDED=" + NO_IMAGE_PROVIDED +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mImageSourceId=" + mImageSourceId +
                ", mAudioSourceId=" + mAudioSourceId +
                '}';
    }
}
