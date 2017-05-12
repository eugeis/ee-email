package ee.email




open class EmailAddress {
    val address: String


    constructor(address: String = "") {
        this.address = address
    }

    companion object {
        val EMPTY = EmailAddress()
    }
}


open class EmailDomain {
    val name: String
    val accounts: MutableList<EmailAddress>
    val forwardings: MutableList<Forwarding>


    constructor(name: String = "", accounts: MutableList<EmailAddress> = arrayListOf(), 
                forwardings: MutableList<Forwarding> = arrayListOf()) {
        this.name = name
        this.accounts = accounts
        this.forwardings = forwardings
    }

    companion object {
        val EMPTY = EmailDomain()
    }
}


open class Forwarding {
    val from: EmailAddress
    val to: MutableList<EmailAddress>


    constructor(from: EmailAddress = EmailAddress.EMPTY, to: MutableList<EmailAddress> = arrayListOf()) {
        this.from = from
        this.to = to
    }

    companion object {
        val EMPTY = Forwarding()
    }
}



