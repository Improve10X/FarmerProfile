package com.improve10x.profile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProfileController {

    ProfileRepo repo = new ProfileRepo();

    public boolean isValidName(String name) {
        String regex = "^[A-Za-z\\s.'-]+$"; // Updated regex to disallow empty names
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public void save(String name, String dob, String place, String preferredCrop) {
        ProfileInfo profile = new ProfileInfo(name, place, dob, preferredCrop);
        repo.save(profile);
    }
}
