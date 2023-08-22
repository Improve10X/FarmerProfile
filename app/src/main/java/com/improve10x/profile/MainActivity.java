package com.improve10x.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.improve10x.profile.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements ProfileView {

    ActivityMainBinding binding;
    ProfileController controller = new ProfileController();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onEditClicked();
    }

    @Override
    public void showName(String name) {
        binding.nameTxt.setText(name);
    }

    @Override
    public void showPlace(String place) {

    }

    @Override
    public void showDob(String dob) {

    }

    @Override
    public void showPreferredCrop(String crop) {

    }

    @Override
    public void onEditClicked() {
        binding.editBtn.setOnClickListener(v -> {
            binding.nameTxt.setVisibility(View.GONE);
            binding.nameEt.setVisibility(View.VISIBLE);
            binding.saveBtn.setVisibility(View.VISIBLE);
            binding.editBtn.setVisibility(View.GONE);
        });
    }

    @Override
    public String getName() {
        return binding.nameEt.getText().toString();
    }

    @Override
    public String getPlace() {
        return null;
    }

    @Override
    public String getDob() {
        return null;
    }

    @Override
    public String getPreferredCrop() {
        return null;
    }

    @Override
    public void onSaveClicked() {
        checkValidations();
        controller.save(getName(), getDob(), getPlace(), getPreferredCrop());
        updateUi();
    }

    private void checkValidations() {
        if(!controller.isValidName(getName())) {
            Toast.makeText(this, "Name is invalid", Toast.LENGTH_SHORT).show();
        }
    }

    private void updateUi() {

    }
}