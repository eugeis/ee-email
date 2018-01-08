package ee.email

import ee.excel.Excel
import ee.excel.get
import java.nio.file.Path
import java.util.*

class ReadForwardingsFromExcel(val filePath: Path, val sheets: List<String>) {

    fun load(): List<Forwarding> {

        val ret = ArrayList<Forwarding>()

        val excel = Excel.open(filePath)

        sheets.map { excel.getSheet(it) }.forEach { sheet ->
            var toOfLastForwarding = ArrayList<EmailAddress>()
            sheet.forEach { row ->
                val from = row[0].toString().trim()
                if (from.isNotEmpty()) {
                    //new forwarding
                    toOfLastForwarding = ArrayList()
                    ret.add(Forwarding(EmailAddress(from), toOfLastForwarding))
                }
                val to = row[1].toString().trim()
                if (to.isNotEmpty()) {
                    toOfLastForwarding.add(EmailAddress(to))
                }
            }
        }
        excel.close()
        return ret
    }

}