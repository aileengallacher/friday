@file:JsModule("react-player")
@file:JsNonModule

import react.*

@JsName("default")
external val reactPlayer: RClass<ReactPlayerProps> // similar to JavaScript: require("react-player")

external interface ReactPlayerProps : RProps {
    var url: String
}