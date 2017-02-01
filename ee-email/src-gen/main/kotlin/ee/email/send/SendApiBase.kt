package ee.email.send

import ee.email.EmailAddress
import java.nio.file.Path
import java.nio.file.Paths

data class MailProps(var properties: Map<String, String> = hashMapOf()) {
    companion object {
        val EMPTY = MailProps(hashMapOf())
    }


}

fun MailProps?.orEmpty(): MailProps {
    return if (this != null) this else MailProps.EMPTY
}

abstract class EmailSenderBase {
    companion object {
        val EMPTY = EmailSender("", "", MailProps.EMPTY)
    }

    var account: String = ""
    var password: String = ""
    var properties: MailProps = MailProps.EMPTY

    constructor(account: String = "", password: String = "", properties: MailProps = MailProps.EMPTY) {
        this.account = account
        this.password = password
        this.properties = properties
    }

    abstract fun sendPersonalAttachments(text: String = "", from: EmailAddress = EmailAddress.EMPTY, to: MutableList<EmailAddress> = arrayListOf(),
                                         attachments: Path = Paths.get(""))

}

fun EmailSenderBase?.orEmpty(): EmailSender {
    return if (this != null) this as EmailSender else EmailSenderBase.EMPTY
}


