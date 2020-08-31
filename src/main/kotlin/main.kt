import react.dom.*
import kotlinx.browser.document
import kotlinx.css.*
import kotlinx.css.Color.Companion.pink
import kotlinx.css.Color.Companion.red
import kotlinx.html.InputType
import styled.*

data class Video(val id: Int, val title: String, val speaker: String, val videoUrl: String)

fun main() {
    render(document.getElementById("root")) {
        child(App::class) {}
    }
}