package br.com.vinip.aluvery.model

import android.media.Image
import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product (
    val name: String,
    val price: BigDecimal,
    @DrawableRes val image: Int
)
