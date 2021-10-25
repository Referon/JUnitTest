import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateComission() {

        val resultVisa = calculateComission(
            cardType = VISA,
            amountPreviousTransfers = 9000,
            transferAmountNow = 7600000

        )
        assertEquals(57000,resultVisa)

        val resultMastercard = calculateComission(
            cardType = MASTER_CARD,
            amountPreviousTransfers = 9000,
            transferAmountNow = 7600000
        )
        assertEquals(0, resultMastercard)

        val resultMaestro = calculateComission(
            cardType = MAESTRO,
            amountPreviousTransfers = 80000,
            transferAmountNow = 7600000
        )
        assertEquals(47600, resultMaestro)

        val resultMir = calculateComission(
            cardType = MIR,
            amountPreviousTransfers = 0,
            transferAmountNow = 56000
        )
        assertEquals(3500, resultMir)

        val resultVkPay = calculateComission(
            cardType = VK_PAY,
            amountPreviousTransfers = 9000,
            transferAmountNow = 7600000
        )
        assertEquals(1, resultVkPay)
    }

    @Test
    fun procent() {
        val result = procent(
            integer = 56000,
            procent = 1.0
        )

        assertEquals(560.0, result, 0.1)
    }

    @Test
    fun comissionVisaAndMir() {
        val result = comissionVisaAndMir(
            3300
        )
        assertEquals(35001, result)
    }

    @Test
    fun comissionMasterCardAndMaestro() {
        val result = comissionMasterCardAndMaestro(
            74000,
            30000
        )
        assertEquals(0, result)
    }


}