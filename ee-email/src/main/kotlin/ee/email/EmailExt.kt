package ee.email

fun EmailAddress.name(): String {
    return address.substringBefore("@")
}

fun EmailAddress.domain(): String {
    return address.substringAfter("@")
}