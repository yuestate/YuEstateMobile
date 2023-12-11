package com.yu.yi.nan.YuEstateMobile.android.presentation.signUp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class signUpViewModel: ViewModel(){
    val firstName = MutableLiveData<String>()
    val lastName = MutableLiveData<String>()
    val age = MutableLiveData<String>()
    val uniqueID = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val phoneNumber = MutableLiveData<String>()
    val aptUnitID = MutableLiveData<String>()
    val aptGroupID = MutableLiveData<String>()
    val userName = MutableLiveData<String>()

}