package com.example.pair4.repositories;

import com.example.pair4.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository <Invoice, Integer> {
}
