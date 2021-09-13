package com.suleymancelik.movieclient.data.model


import com.squareup.moshi.Json

data class NowPlayingMovieListModel(
    @field:Json(name = "dates")
    val nowPlayingDateModel: NowPlayingDateModel,
    @field:Json(name = "page")
    val page: Int,
    @field:Json(name = "results")
    val nowPlayingMovieModels: List<NowPlayingMovieModel>,
    @field:Json(name = "total_pages")
    val totalPages: Int,
    @field:Json(name = "total_results")
    val totalResults: Int
)

data class NowPlayingDateModel(
    @field:Json(name = "maximum")
    val maximum: String,
    @field:Json(name = "minimum")
    val minimum: String
)

data class NowPlayingMovieModel(
    @field:Json(name = "adult")
    val adult: Boolean,
    @field:Json(name = "backdrop_path")
    val backdropPath: String,
    @field:Json(name = "genre_ids")
    val genreIds: List<Int>,
    @field:Json(name = "id")
    val id: Int,
    @field:Json(name = "original_language")
    val originalLanguage: String,
    @field:Json(name = "original_title")
    val originalTitle: String,
    @field:Json(name = "overview")
    val overview: String,
    @field:Json(name = "popularity")
    val popularity: Double,
    @field:Json(name = "poster_path")
    val posterPath: String,
    @field:Json(name = "release_date")
    val releaseDate: String,
    @field:Json(name = "title")
    val title: String,
    @field:Json(name = "video")
    val video: Boolean,
    @field:Json(name = "vote_average")
    val voteAverage: Int,
    @field:Json(name = "vote_count")
    val voteCount: Int
)