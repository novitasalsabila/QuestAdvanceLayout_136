package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource as painterResource

@Preview(showBackground = true)
@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize()
    ){
        HeaderSection()
        DetailMhs(
            param = "Nama",
            argu = "Novita Salsabila"
        )
        DetailMhs(
            param = "NIM",
            argu = "20220140136"
        )
        DetailMhs(
            param = "Prodi",
            argu = "Teknologi Informasi"
        )
        DetailMhs(
            param = "Fakultas",
            argu = "Teknik"
        )
        DetailMhs(
            param = "Universitas",
            argu = "Muhammadiyah"
        )
        DetailMhs(
            param = "Alamat",
            argu = "JL.Puntadewa"
        )
        DetailMhs(param = "Nim", argu = "20220140146")

    }
}

@Composable
fun HeaderSection(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ){
            Image(painter = painterResource(id = R.drawable.logo),
                contentDescription = null,
                modifier = Modifier.clip(CircleShape)
            )
            Icon(
                Icons.Filled.Check,
                contentDescription =null,
                modifier =Modifier.size(30.dp).background(color = Color.Blue)
            )
        }
        Column(
           modifier = Modifier.padding(14.dp)
        ){
            Text(text = "Teknologi Informasi")
            Text(text = "Universitas Muhammadiyah Yogyakarta")
        }



    }
}


@Composable
fun DetailMhs(
    param : String, argu : String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
            modifier = Modifier.weight(0.8f))
            Text(text = ":",
            modifier = Modifier.weight(0.2f))
            Text(text = argu,
            modifier = Modifier.weight(2f))
        }
    }
}