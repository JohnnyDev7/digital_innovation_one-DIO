package com.devsdimension.credit.application.system.service.impl

import com.devsdimension.credit.application.system.entity.Credit
import com.devsdimension.credit.application.system.exception.BusinessException
import com.devsdimension.credit.application.system.repository.CreditRepository
import com.devsdimension.credit.application.system.service.ICreditService
import org.springframework.stereotype.Service
import java.lang.IllegalArgumentException
import java.lang.RuntimeException
import java.util.*

@Service
class CreditService (
    private val creditRepository: CreditRepository,
    private var customerService: CustomerService
): ICreditService {
    override fun save(credit: Credit): Credit {
        credit.apply {
            customer = customerService.findById(credit.customer?.id!!)
        }
        return this.creditRepository.save(credit)
    }

    override fun findAllByCustomer(customerId: Long): List<Credit> =
        this.creditRepository.findAllByCustomerId(customerId)

    override fun findByCreditCode(customerId: Long, creditCode: UUID): Credit {
        val credit: Credit = (this.creditRepository.findByCreditCode(creditCode)
            ?: throw BusinessException("Credit Code $creditCode not found"))
        return if (credit.customer?.id == customerId) credit else throw IllegalArgumentException("Contact admin")

        // Another way to write this code
        /*
        if (credit.customer?.id == customerId) {
            return credit
        } else {
            throw RuntimeException("Contact admin")
        }
        */
    }
}