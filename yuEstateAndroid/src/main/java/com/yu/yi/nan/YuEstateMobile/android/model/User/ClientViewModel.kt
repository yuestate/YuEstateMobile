package com.yu.yi.nan.YuEstateMobile.android.model.User

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RegisterClientInfoViewModel : ViewModel(){
    private var firstName: String = "";
    private var lastName: String = "";
    private var age: Number =0;
    private var uniqueID: String = "";
    private var email: String = "";
    private var phoneNumber: Number = 0;
    private var aptUnitID: String = "";
    private var aptGroupID: String = "";


    val sharedData = MutableLiveData<String>()
}