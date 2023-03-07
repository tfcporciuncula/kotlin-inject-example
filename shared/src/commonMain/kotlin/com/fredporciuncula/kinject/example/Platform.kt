package com.fredporciuncula.kinject.example

interface Platform {
  val name: String
}

expect fun getPlatform(): Platform
