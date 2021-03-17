package ru.rodni_it.composelearning

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NewsStory() {
    // A surface container using the 'background' color from the theme
    Surface(
        shape = RoundedCornerShape(16.dp),
        color = MaterialTheme.colors.background,
        elevation = 8.dp,
        modifier = Modifier.padding(12.dp)
    ) {
        MaterialTheme {
            val typography = MaterialTheme.typography

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Surface(shape = RoundedCornerShape(16.dp), elevation = 8.dp) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = null,
                        modifier = Modifier
                            .height(180.dp)
                            .fillMaxWidth(),
                        //.clip(shape = RoundedCornerShape(16.dp)),
                        contentScale = ContentScale.Crop
                    )
                }

                Spacer(Modifier.height(16.dp))

                Text(
                    "A day wandering through the sandhills " +
                            "in Shark Fin Cove, and a few of the " +
                            "sights I saw",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Surface(color = Color.Yellow, contentColor = Color.Red, modifier = Modifier.padding(8.dp)) {
                    Text(
                        "Davenport, California",
                        style = typography.body2
                    )
                }

                Spacer(Modifier.height(8.dp))

                Divider(color = Color.Black, modifier = Modifier.width(160.dp))

                Spacer(Modifier.height(8.dp))

                Text(
                    "December 2018",
                    style = typography.body2
                )
            }
        }
    }
}

@Preview(showBackground = true, name = "Image and text item preview")
@Composable
fun NewsStoryPreview() {
    NewsStory()
}