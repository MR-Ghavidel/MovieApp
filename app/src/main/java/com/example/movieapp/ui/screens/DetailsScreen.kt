package com.example.movieapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.movieapp.R
import com.example.movieapp.common.getMovies

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, movieId: String?) {
    val newMovieList = getMovies().filter { movie ->
        movie.id == movieId
    }
    var selectedImage by remember { mutableStateOf<String?>(null) }
    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Movies") }, navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "back"
                )
            }
        }, colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background
        )
        )
    }) { innerPadding ->
        Surface(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            LazyColumn(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                contentPadding = PaddingValues(vertical = 12.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                item {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier
                            .padding(start = 12.dp, end = 12.dp)
                            .fillMaxSize()
                    ) {
                        Card(
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(8.dp))
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.Transparent
                            )
                        ) {
                            AsyncImage(
                                model = newMovieList[0].poster,
                                placeholder = painterResource(R.drawable.image_place_holder),
                                error = painterResource(R.drawable.ic_launcher_background),
                                contentDescription = "${newMovieList[0].title} Poster",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .aspectRatio(2f / 3f)
                            )
                        }
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 4.dp, bottom = 4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Star,
                                contentDescription = "Rating",
                                tint = Color(0xFFFFBF00),
                                //modifier = Modifier.alpha(alpha = 10f)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Rating: ${newMovieList[0].rating}",
                                style = MaterialTheme.typography.labelSmall,
                                color = MaterialTheme.colorScheme.onSecondary,
                                modifier = Modifier
                                    .background(
                                        color = Color(0xFFFFBF00), shape = RoundedCornerShape(5.dp)
                                    )
                                    .padding(horizontal = 6.dp, vertical = 2.dp)
                                    .alpha(alpha = 10f)
                            )
                        }
                        Text(
                            text = newMovieList[0].title,
                            style = MaterialTheme.typography.titleLarge
                        )
                        Text(
                            text = "Genre: ${newMovieList[0].genre}",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "Released: ${newMovieList[0].year}",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = buildAnnotatedString {
                                withStyle(
                                    style = SpanStyle(
                                        color = MaterialTheme.colorScheme.secondary,
                                        fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                        fontWeight = FontWeight.Bold
                                    )
                                ) {
                                    append("Plot: ")
                                }
                                withStyle(
                                    SpanStyle(
                                        color = MaterialTheme.colorScheme.secondary,
                                        fontSize = MaterialTheme.typography.titleMedium.fontSize,
                                        fontWeight = FontWeight.Light
                                    )
                                ) {
                                    append(newMovieList[0].plot)
                                }
                            }, modifier = Modifier.padding(6.dp)
                        )
                        Text(
                            text = "Director: ${newMovieList[0].director}",
                            style = MaterialTheme.typography.titleMedium
                        )
                        Text(
                            text = "Actors: ${newMovieList[0].actors}",
                            style = MaterialTheme.typography.titleMedium
                        )
                        HorizontalDivider(modifier = Modifier.padding(12.dp))
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                text = "Images", style = MaterialTheme.typography.titleMedium
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    LazyRow(
                        contentPadding = PaddingValues(horizontal = 12.dp),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        items(newMovieList[0].images) { imageUrl ->
                            Card(
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 4.dp, focusedElevation = 8.dp
                                ),
                                colors = CardDefaults.cardColors(
                                    containerColor = MaterialTheme.colorScheme.background,
                                    contentColor = MaterialTheme.colorScheme.onBackground
                                ),
                                modifier = Modifier
                                    .fillMaxSize()
                                    .heightIn(max = 130.dp)

                            ) {
                                AsyncImage(
                                    model = imageUrl,
                                    placeholder = painterResource(R.drawable.image_place_holder),
                                    error = painterResource(R.drawable.ic_launcher_background),
                                    contentDescription = "${newMovieList[0].title} imageUrl",
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .clip(shape = RoundedCornerShape(8.dp))
                                        .fillMaxSize()
                                        .aspectRatio(2f / 1f)
                                        .clickable { selectedImage = imageUrl }
                                )
                            }
                        }
                    }
                    if (selectedImage != null) {
                        Dialog(onDismissRequest = { selectedImage = null }) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(8.dp))
                                    .fillMaxWidth()
                                    .wrapContentHeight()
                                    .clickable { selectedImage = null },
                                contentAlignment = Alignment.Center
                            ) {
                                AsyncImage(
                                    model = selectedImage,
                                    contentDescription = "Full Image",
                                    contentScale = ContentScale.FillWidth,
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(8.dp))
                                        .fillMaxWidth()
                                )
                            }
                        }
                    }
                }
            }

        }
    }
}

