package com.denihilhamsyah.cookpedia.ui.screen

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.denihilhamsyah.cookpedia.R

@Composable
fun Onboarding() {

    val context = LocalContext.current

    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.bg_onboarding),
            contentDescription = "bg_onboarding",
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        listOf(
                            Color.Transparent,
                            Color.Black
                        )
                    )
                )
                .padding(16.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.premium_recipes),
                style = MaterialTheme.typography.body1,
                color = Color.White
            )
            Column(
                modifier = Modifier.padding(32.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.lets_cooking),
                    style = MaterialTheme.typography.h1,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(id = R.string.best_recipes),
                    style = MaterialTheme.typography.body1,
                    color = Color.White
                )
                
                Spacer(modifier = Modifier.height(16.dp))
                
                Button(
                    modifier = Modifier
                        .height(50.dp)
                        .width(200.dp),
                    shape = RoundedCornerShape(16.dp),
                    onClick = {
                        Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
                    }
                ) {
                    Text(
                        text = stringResource(id = R.string.start_cooking),
                        style = MaterialTheme.typography.button,
                        color = Color.White
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = "ic_arrow_right"
                    )
                }
            }
        }
    }
}