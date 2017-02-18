package ee.email

import java.nio.file.Path
import java.nio.file.Paths




open class EmailAddress {
    val address: String


    constructor(address: String = "") {
        this.address = address
    }

    companion object {
        val EMPTY = EmailAddress()
    }
}


open class Forwarding {
    val from: EmailAddress
    val to: MutableList<Forwarding>


    constructor(from: EmailAddress = EmailAddress.EMPTY, to: MutableList<Forwarding> = arrayListOf()) {
        this.from = from
        this.to = to
    }

    companion object {
        val EMPTY = Forwarding()
    }
}


open class EmailDomain {
    val name: String
    val accounts: MutableList<Forwarding>
    val forwardings: MutableList<Forwarding>
    val path: Path


    constructor(name: String = "", accounts: MutableList<Forwarding> = arrayListOf(), 
                forwardings: MutableList<Forwarding> = arrayListOf(), path: Path = Paths.get("")) {
        this.name = name
        this.accounts = accounts
        this.forwardings = forwardings
        this.path = path
    }

    companion object {
        val EMPTY = EmailDomain()
    }
}



