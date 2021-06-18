package com.example.santandedevweek.data.local

import com.example.santandedevweek.data.Cartao
import com.example.santandedevweek.data.Cliente
import com.example.santandedevweek.data.Conta

class FakeData {

    fun getLocalData() : Conta {
        val cliente = Cliente("Igor")
        val cartao = Cartao("41111111111")

        return Conta(
            "445655-4",
            "6552-4",
            "R$ 2.450,80",
            "R$ 4.120,00",
            cliente,
            cartao
        );

    }
}