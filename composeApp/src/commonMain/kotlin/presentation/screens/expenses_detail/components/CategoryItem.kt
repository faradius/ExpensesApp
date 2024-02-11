package presentation.screens.expenses_detail.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import domain.model.ExpenseCategory

@Composable
fun CategoryItem(category: ExpenseCategory, onCategorySelected: (ExpenseCategory) -> Unit){
    Column(modifier = Modifier.fillMaxWidth().padding(8.dp).clickable {
        onCategorySelected(category)
    }, verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Image(
            modifier = Modifier.size(40.dp).clip(CircleShape),
            imageVector = category.icon,
            contentDescription = "category icon",
            contentScale = ContentScale.Crop
        )
        Text(text = category.name)

    }
}