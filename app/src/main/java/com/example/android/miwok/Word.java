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

    public int getImageSourceId() {
        return mImageSourceId;
    }

    public boolean hasImage(){return mImageSourceId != NO_IMAGE_PROVIDED;}

    public int getAudioSourceId() {
        return mAudioSourceId;
    }

}
