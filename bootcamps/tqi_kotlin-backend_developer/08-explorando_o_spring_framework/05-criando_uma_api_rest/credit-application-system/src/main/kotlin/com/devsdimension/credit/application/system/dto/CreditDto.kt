package com.devsdimension.credit.application.system.dto

import com.devsdimension.credit.application.system.entity.Credit
import com.devsdimension.credit.application.system.entity.Customer
import jakarta.validation.constraints.Future
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Positive
import java.math.BigDecimal
import java.time.LocalDate

class CreditDto (
    @field:NotNull(message = "Invalid input")
    val creditValue: BigDecimal,
    @field:Future
    val dayFirstInstallment: LocalDate,
    @field:NotNull(message = "Invalid input")
    @field:Positive
    val numberOfInstallments: Int,
    @field:NotNull(message = "Invalid input")
    val customerId: Long
) {
    fun toEntity(): Credit = Credit (
        creditValue = this.creditValue,
        dayFirstInstallment = this.dayFirstInstallment,
        numberOfInstallments = this.numberOfInstallments,
        customer = Customer(id = this.customerId)
    )
}
