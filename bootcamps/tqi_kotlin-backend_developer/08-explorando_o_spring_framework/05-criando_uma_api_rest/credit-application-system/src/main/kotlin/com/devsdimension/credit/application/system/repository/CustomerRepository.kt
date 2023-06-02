package com.devsdimension.credit.application.system.repository

import com.devsdimension.credit.application.system.entity.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository: JpaRepository<Customer, Long>