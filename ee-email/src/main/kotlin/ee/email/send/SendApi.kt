package ee.email.send

import ee.email.EmailAddress
import java.nio.file.Path

open class EmailSender : EmailSenderBase {
    companion object {
        val EMPTY = EmailSenderBase.EMPTY
    }

    constructor(account: String = "", password: String = "", properties: MailProps = MailProps.EMPTY): super(account, password, properties) {

    }

    override fun sendPersonalAttachments(text: String, from: EmailAddress, to: MutableList<EmailAddress>, attachments: Path) {
        throw IllegalAccessException("Not implemented yet.")
    }

}


