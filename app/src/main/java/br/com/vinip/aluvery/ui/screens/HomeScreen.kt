package br.com.vinip.aluvery.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.vinip.aluvery.ui.components.ProductsSection
import br.com.vinip.aluvery.ui.components.SampleProducts

@Composable
    fun HomeScreen() {
        Column(
            Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier)
            ProductsSection("Promoções", SampleProducts)
            ProductsSection("Doces: ", SampleProducts)
            ProductsSection("Bebidas: ", SampleProducts)
            Spacer(modifier = Modifier)
        }
    }

    @Preview(showSystemUi = true)
    @Composable
    private fun HomeScreenPreview() {
        HomeScreen()
    }