package fpoly.minhpt.bt5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fpoly.minhpt.bt5.ui.theme.BT5Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BT5Theme {
                ScaffoldExample()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldExample() {
    var presses by remember { mutableIntStateOf(0) }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = Color(0xFF262121),
                    titleContentColor = Color(0xFFffffff),
                ),
                title = {
                    Text("Thanh toán")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = Color.DarkGray,
                contentColor = MaterialTheme.colorScheme.primary,
                modifier = Modifier.height(80.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    IconButton(
                        onClick = { },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Default.Home,
                                contentDescription = "Trang chủ",
                                modifier = Modifier.size(24.dp),
                                tint = Color.White
                            )
                            Text(
                                "Trang chủ",
                                style = MaterialTheme.typography.bodySmall,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = Color.White,
                            )
                        }
                    }
                    IconButton(
                        onClick = { },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Default.List,
                                contentDescription = "Lịch sử",
                                modifier = Modifier.size(24.dp),
                                tint = Color.White

                            )
                            Text(
                                "Lịch sử",
                                style = MaterialTheme.typography.bodySmall,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = Color.White

                            )
                        }
                    }
                    IconButton(
                        onClick = { },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Rounded.ShoppingCart,
                                contentDescription = "Giỏ hàng",
                                modifier = Modifier.size(24.dp),
                                tint = Color.White

                            )
                            Text(
                                "Giỏ hàng",
                                style = MaterialTheme.typography.bodySmall,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = Color.White

                            )
                        }
                    }
                    IconButton(
                        onClick = { },
                        modifier = Modifier.size(80.dp)
                    ) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                Icons.Default.Person,
                                contentDescription = "Hồ sơ",
                                modifier = Modifier.size(24.dp),
                                tint = Color.White

                            )
                            Text(
                                "Hồ sơ",
                                style = MaterialTheme.typography.bodySmall,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color(0xFF262121))
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Divider(color = Color.Black, thickness = 1.dp)

            Text(
                modifier = Modifier.padding(start = 28.dp),
                text = "Địa chỉ nhận hàng",
                color = Color.White
            )
            Row {
                Icon(
                    modifier = Modifier.padding(20.dp),
                    tint = Color.White,
                    painter = painterResource(R.drawable.ic_location),
                    contentDescription = stringResource(id = R.string.bus_content_description)
                )
                Column(
                    modifier = Modifier
                        .background(Color(0xFF262121)),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    Text(
                        text = "Minh | 0822357xxx",
                        color = Color.White
                    )
                    Text(
                        text = "Mỹ Đình 2, Nam Từ Liêm, Hà Nội",
                        color = Color.White
                    )
                }
            }
            Text(
                modifier = Modifier.padding(start = 28.dp),
                text = "Vui lòng chọn 1 trong các phương thức sau",
                color = Color.White
            )
            val paypal = painterResource(id = R.drawable.paypal)
            val visa = painterResource(id = R.drawable.visa)
            val momo = painterResource(id = R.drawable.momo)
            val zalo = painterResource(id = R.drawable.zalopay)
            val trucTiep = painterResource(id = R.drawable.tructiep)

            RowChoose("PayPal", "Option 1", paypal, Color(0xFFFA8500))
            RowChoose("Visa", "Option 2", visa, Color.Green)
            RowChoose("Momo", "Option 3", momo, Color(0xFFE71384))
            RowChoose("Zalo Pay", "Option 4", zalo, Color(0xFF01ADE2))
            RowChoose("Thanh toán trực tiếp", "Option 5", trucTiep, Color(0xFF1BD7D6))

            Button(
                onClick = { },
                modifier = Modifier
                    .padding(start = 28.dp, end = 28.dp)
                    .background(Color(0xFFFE724C), shape = RoundedCornerShape(16.dp))
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFFD724C)
                )
            ) {
                Text("Tiếp theo")
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun RowChoose(text: String, option: String, painter: Painter, color: Color) {
    var selectedOption by remember { mutableStateOf("") }

    Row(
        modifier = Modifier
            .padding(start = 28.dp, end = 28.dp)
            .background(
                color,
                shape = RoundedCornerShape(16.dp)
            )
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Image(
            painter = painter,
            modifier = Modifier.padding(10.dp),
            contentDescription = stringResource(id = R.string.paypal)
        )
        Text(
            text = text,
            color = Color(0xFFFFFFFF)
        )
        RadioButton(
            selected = selectedOption == option,
            onClick = { selectedOption = option }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BT5Theme {
        ScaffoldExample()
    }
}