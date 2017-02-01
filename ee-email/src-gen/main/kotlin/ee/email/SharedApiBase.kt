package ee.email

data class EmailAddress(var name: String = "", var address: String = "") {
    companion object {
        val EMPTY = EmailAddress("", "")
    }



}

fun EmailAddress?.orEmpty(): EmailAddress {
    return if (this != null) this else EmailAddress.EMPTY
}

data class Forwarding(var from: EmailAddress = EmailAddress.EMPTY, var to: MutableList<EmailAddress> = arrayListOf()) {
    companion object {
        val EMPTY = Forwarding(EmailAddress.EMPTY, arrayListOf())
    }



}

fun Forwarding?.orEmpty(): Forwarding {
    return if (this != null) this else Forwarding.EMPTY
}

data class EmailDomain(var name: String = "", var accounts: MutableList<EmailAddress> = arrayListOf(), 
                       var forwardings: MutableList<Forwarding> = arrayListOf()) {
    companion object {
        val EMPTY = EmailDomain("", arrayListOf(), arrayListOf())
    }



}

fun EmailDomain?.orEmpty(): EmailDomain {
    return if (this != null) this else EmailDomain.EMPTY
}


