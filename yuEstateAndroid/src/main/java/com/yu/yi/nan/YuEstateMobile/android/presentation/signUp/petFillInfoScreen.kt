package com.yu.yi.nan.YuEstateMobile.android.presentation.signUp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yu.yi.nan.YuEstateMobile.android.MyApplicationTheme

@Composable
fun petFillInfoScreen (navController: NavController){
    var pName by remember { mutableStateOf("") }
    var breed by remember { mutableStateOf("") }
    var rentFee by remember { mutableStateOf("") }
    var ESA by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = pName,
            onValueChange = { pName = it },
            label = { Text("Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = breed,
            onValueChange = { breed = it },
            label = { Text("Breed") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = rentFee,
            onValueChange = { rentFee = it },
            label = { Text("Rent") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )


        //boolean a checked box or something
        OutlinedTextField(
            value = ESA,
            onValueChange = { ESA = it },
            label = { Text("ESA") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )


    }
}

@Preview(showBackground = true)
@Composable
fun petFillInfoScreenPreview(){
    MyApplicationTheme {
//        val navController = rememberNavController()
//        val signupModel = signUpViewModel()
//        clientFillInfoScreen(navController, signupModel)
    }
}