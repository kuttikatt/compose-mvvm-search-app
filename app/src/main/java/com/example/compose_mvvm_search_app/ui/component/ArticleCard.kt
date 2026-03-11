package com.example.compose_mvvm_search_app.ui.component

import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.compose_mvvm_search_app.model.Item

@Composable
fun ArticleCard(article: Item, navController: NavHostController) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable {
                navController.navigate(
                    "details/${Uri.encode(article.title)}/${Uri.encode(article.description)}")
            }
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                article.title, fontSize = 16.sp,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.titleMedium, textAlign = TextAlign.Start
            )
            Text(
                article.description,
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Start,
                maxLines = 1, overflow = TextOverflow.Ellipsis
            )
        }
    }

}