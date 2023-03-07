package com.fredporciuncula.kinject.example

class Greeting {
  private val platform: Platform = getPlatform()

  fun greet(): String {
    return "Hello, ${platform.name}!"
  }
}
