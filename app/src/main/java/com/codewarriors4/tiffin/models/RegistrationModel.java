package com.codewarriors4.tiffin.models;

import android.os.Parcel;
import android.os.Parcelable;

public class RegistrationModel implements Parcelable {
    String fullName;
    String emailID;
    String getMobileNumber;
    String password;

    public RegistrationModel(String fullName, String emailID, String getMobileNumber, String password) {
        this.fullName = fullName;
        this.emailID = emailID;
        this.getMobileNumber = getMobileNumber;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getGetMobileNumber() {
        return getMobileNumber;
    }

    public void setGetMobileNumber(String getMobileNumber) {
        this.getMobileNumber = getMobileNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.fullName);
        dest.writeString(this.emailID);
        dest.writeString(this.getMobileNumber);
        dest.writeString(this.password);
    }

    public RegistrationModel() {
    }

    protected RegistrationModel(Parcel in) {
        this.fullName = in.readString();
        this.emailID = in.readString();
        this.getMobileNumber = in.readString();
        this.password = in.readString();
    }

    public static final Parcelable.Creator<RegistrationModel> CREATOR = new Parcelable.Creator<RegistrationModel>() {
        @Override
        public RegistrationModel createFromParcel(Parcel source) {
            return new RegistrationModel(source);
        }

        @Override
        public RegistrationModel[] newArray(int size) {
            return new RegistrationModel[size];
        }
    };
}
