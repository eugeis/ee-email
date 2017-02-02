package ee.email

import ee.design.*
import ee.lang.*

object EmailDesign : Model({ namespace("ee") }) {

    object Email : Comp() {
        object Shared : Module() {
            object EmailAddress : Basic() {
                val address = prop { replaceable(false) }
            }

            object Forwarding : Basic() {
                val from = prop { type(EmailAddress).replaceable(false) }
                val to = prop { type(n.List.GT(EmailAddress)).replaceable(false) }
            }

            object EmailDomain : Basic() {
                val name = prop { replaceable(false) }
                val accounts = prop { type(n.List.GT(EmailAddress)).replaceable(false) }
                val forwardings = prop { type(n.List.GT(Forwarding)).replaceable(false) }
            }
        }
    }
}

fun model() = EmailDesign.initObjectTree(true)