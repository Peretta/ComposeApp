package br.com.vinip.aluvery.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.vinip.aluvery.R
import br.com.vinip.aluvery.ui.theme.Purple40
import br.com.vinip.aluvery.ui.theme.PurpleGrey40

@Composable
private fun EXERCICIO_1() {
    Row(
        modifier = Modifier
            .width(300.dp)
            .height(120.dp)
    ) {
        Box(
            modifier = Modifier
                .width(90.dp)
                .fillMaxHeight()
                .background(Color.Blue)
        )
        Column {
            Text(
                text = "Texto 1", Modifier
                    .background(Color.Gray)
                    .fillMaxWidth()
                    .padding(10.dp)
            )
            Text(text = "Texto 2", Modifier.padding(10.dp))
        }

    }
}

@Composable
private fun EXERCICIO_2() {
    Surface(
        Modifier.padding(8.dp),
        shape = RoundedCornerShape(8.dp),
        shadowElevation = 4.dp
    ) {
        Row(
            Modifier
                .height(200.dp)
                .fillMaxWidth()
        ) {
            val imageSize = 100.dp
            Box(
                modifier = Modifier
                    .width(imageSize)
                    .fillMaxHeight()
                    .background(
                        Brush.horizontalGradient(
                            listOf(
                                Purple40,
                                PurpleGrey40
                            )
                        )
                    )
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "imagem",
                    Modifier
                        .size(imageSize)
                        .offset(x = (imageSize / 2))
                        .clip(shape = CircleShape)
                        .align(Alignment.Center)
                        .border(
                            BorderStroke(
                                2.dp, brush = Brush.verticalGradient(
                                    listOf(
                                        Purple40,
                                        PurpleGrey40
                                    )
                                )
                            ),
                            CircleShape
                        )

                )
            }
            Spacer(modifier = Modifier.width(imageSize / 2))
            Box(
                Modifier
                    .padding(16.dp)
                    .fillMaxHeight()
                    .padding(16.dp)
                    .align(Alignment.CenterVertically),
            ) {
                Column {
                    Text(
                        text = LoremIpsum(50).values.first(),
                        overflow = TextOverflow.Ellipsis,
                        lineHeight = 20.sp
                    )
                }
            }
        }
    }
}

@Composable
fun DescricaoItemProduto(modifier: Modifier = Modifier, descricao: String = "") {
    Surface(
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {

        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
                .verticalScroll(rememberScrollState())
        ) {

            val imageSize = 100.dp

            Box(
                modifier = Modifier
                    .height(imageSize)
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(
                                Purple40, PurpleGrey40
                            )
                        )
                    )
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = null,
                    Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(Alignment.BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))

            Column(Modifier.padding(16.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "R$ 20,00",
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 4))
            if (descricao.isNotBlank()) {
                Text(
                    text = descricao,
                    Modifier
                        .background(Purple40)
                        .padding(
                            start = 16.dp,
                            end = 16.dp,
                            bottom = 16.dp,
                            top = 8.dp
                        )
                        .fillMaxWidth(),
                    color = Color.White
                )
            }
        }


    }
}


@Preview(showBackground = true)
@Composable
private fun DescricaoItemProdutoPreview(modifier: Modifier = Modifier) {
    DescricaoItemProduto(descricao = LoremIpsum(10).values.first())
}
