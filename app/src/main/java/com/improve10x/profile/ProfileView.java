package com.improve10x.profile;

public interface ProfileView {

    void showName(String name);
    void showPlace(String place);
    void showDob(String dob);
    void showPreferredCrop(String crop);
    void onEditClicked();
    String getName();
    String getPlace();
    String getDob();
    String getPreferredCrop();
    void onSaveClicked();
}
