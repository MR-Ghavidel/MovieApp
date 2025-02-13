package com.example.movieapp.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.movieapp.R
import com.example.movieapp.common.getMovies
import com.example.movieapp.model.Movie

@Preview(showBackground = true)
@Composable
fun MovieRow(
    movie: Movie = getMovies()[1],
    onClickItem: (String) -> Unit = {}
) {
    var expanded by rememberSaveable {
        mutableStateOf(false)
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .clip(shape = RoundedCornerShape(12.dp))
            .fillMaxWidth()
            .clickable {
                onClickItem(movie.id)
            },
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp,
            focusedElevation = 8.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = MaterialTheme.colorScheme.onBackground
        )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
        ) {
            Surface(
                modifier = Modifier
                    .padding(12.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .width(100.dp)
                    .aspectRatio(2f / 3f),
                color = Color.Transparent
            ) {
                AsyncImage(
                    model = movie.poster,
                    placeholder = painterResource(R.drawable.image_place_holder),
                    error = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "${movie.title} Poster",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column(
                modifier = Modifier
                    .padding(4.dp)
                    .weight(1f)
            ) {
                Text(
                    text = movie.title,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "Genre: ${movie.genre}",
                    style = MaterialTheme.typography.labelMedium
                )
                Text(
                    text = "Released: ${movie.year}",
                    style = MaterialTheme.typography.labelMedium
                )
                AnimatedVisibility(visible = expanded) {
                    Column {
                        Text(
                            text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = MaterialTheme.colorScheme.secondary,
                                        fontSize = MaterialTheme.typography.labelMedium.fontSize
                                    )
                                ) {
                                    append("Plot: ")
                                }
                                withStyle(
                                    SpanStyle(
                                        color = MaterialTheme.colorScheme.secondary,
                                        fontSize = MaterialTheme.typography.labelMedium.fontSize,
                                        fontWeight = FontWeight.Light
                                    )
                                ) {
                                    append(movie.plot)
                                }
                            },
                            modifier = Modifier.padding(6.dp)
                        )
                        HorizontalDivider(
                            modifier = Modifier.padding(
                                bottom = 6.dp,
                                start = 3.dp,
                                end = 3.dp
                            )
                        )
                        Text(
                            text = "Director: ${movie.director}",
                            style = MaterialTheme.typography.labelMedium
                        )
                        Text(
                            text = "Actors: ${movie.actors}",
                            style = MaterialTheme.typography.labelMedium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = "Rating: ${movie.rating}",
                            style = MaterialTheme.typography.labelSmall,
                            color = MaterialTheme.colorScheme.onSecondary,
                            modifier = Modifier
                                .background(
                                    color = Color(0xFFF5C518),
                                    shape = RoundedCornerShape(5.dp)
                                )
                                .padding(horizontal = 6.dp, vertical = 2.dp)
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                    }
                }
                Icon(
                    imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = "Down Arrow",
                    modifier = Modifier
                        .clip(RoundedCornerShape(8.dp))
                        .size(25.dp)
                        .clickable {
                            expanded = !expanded
                        },
                    tint = MaterialTheme.colorScheme.secondary
                )
            }
        }
    }
}

