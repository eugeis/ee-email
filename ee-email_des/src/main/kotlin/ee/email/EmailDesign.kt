package ee.email

import ee.design.Basic
import ee.design.Comp
import ee.design.Module
import ee.lang.GT
import ee.lang.n

object Email : Comp({ artifact("ee-email").namespace("ee.email") }) {
    object Shared : Module() {
        object EmailAddress : Basic() {
            val address = prop { replaceable(false) }
        }

        object Forwarding : Basic() {
            val from = prop { type(EmailAddress) }
            val to = prop { type(n.List.GT(EmailAddress)) }
        }

        object EmailDomain : Basic() {
            val name = prop { replaceable(false) }
            val accounts = prop { type(n.List.GT(EmailAddress)) }
            val forwardings = prop { type(n.List.GT(Forwarding)) }
        }
    }
}