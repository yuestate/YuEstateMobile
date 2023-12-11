package com.yu.yi.nan.YuEstateMobile.android.presentation.signUp

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.yu.yi.nan.YuEstateMobile.android.MyApplicationTheme


@Composable
fun clientFillInfoScreen(navController: NavController, signupModel: signUpViewModel){
    var firstName by remember { mutableStateOf("") }
    var lastName by remember {  mutableStateOf("") }
    var age by remember {  mutableStateOf("") }
    var uniqueID by remember {  mutableStateOf("") }
    var email by remember {  mutableStateOf("") }
    var phoneNumber by remember {  mutableStateOf("") }
    var aptUnitID by remember {  mutableStateOf("") }
    var aptGroupID by remember {  mutableStateOf("") }
    var userName by remember {  mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
       OutlinedTextField(
           value = firstName,
           onValueChange = {firstName = it},
           label = { Text("First") },
           modifier = Modifier
               .fillMaxWidth()
               .padding(bottom = 16.dp)
       )

        OutlinedTextField(
            value = lastName,
            onValueChange = {lastName = it},
            label = { Text("Last") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = age,
            onValueChange = {age = it},
            label = { Text("Age") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = uniqueID,
            onValueChange = {uniqueID = it},
            label = { Text("uniqueID") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = phoneNumber,
            onValueChange = {phoneNumber = it},
            label = { Text("Phone#") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = aptUnitID,
            onValueChange = {aptUnitID = it},
            label = { Text("APT#") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = aptGroupID,
            onValueChange = {aptGroupID = it},
            label = { Text("BLDG#") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = userName,
            onValueChange = {userName = it},
            label = { Text("UserName") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(
                onClick = {
                    signupModel.firstName.value = firstName
                    signupModel.lastName.value = lastName
                    signupModel.age.value = age
                    signupModel.uniqueID.value = uniqueID
                    signupModel.email.value = email
                    signupModel.phoneNumber.value = phoneNumber
                    signupModel.aptUnitID.value = aptUnitID
                    signupModel.aptGroupID.value = aptGroupID
                    signupModel.userName.value = userName

//                    navController.navigate("screenDisplayInfo")
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)

            ) {
                Text("Submit")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun clientFillInfoScreenPreview(){
    MyApplicationTheme {
        val navController = rememberNavController()
        val signupModel = signUpViewModel()
        clientFillInfoScreen(navController, signupModel)
    }
}
