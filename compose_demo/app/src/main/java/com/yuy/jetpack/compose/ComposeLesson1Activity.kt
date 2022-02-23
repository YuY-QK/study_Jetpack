package com.yuy.jetpack.compose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.yuy.jetpack.R
import com.yuy.jetpack.ui.theme.ComposeTestTheme

/**
 * Created by yu on 2022/2/23.
 *
 */
class ComposeLesson1Activity : ComponentActivity()  {

    private var mContext: ComponentActivity? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mContext = this
        setContent {
            /* ①
             MessageCard(name = "Android Jetpack")
            */

            /* ②
             */
            ComposeTestTheme {
                MessageCard(
                    Message(
                        "Android",
                        "Jetpack Compose"
                    )
                )
            }

        }
    }
}

/*①
@Composable
fun MessageCard(name: String) {
    Text(text = "Hello $name！")
}

@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(name = "Android Jetpack")
}
*/


data class Message(var author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Column(modifier = Modifier.padding(all = 8.dp)) {
        Row(modifier = Modifier
            .background(color = Color.Green)
        ) {
            Image(
                painter = painterResource(id = R.drawable.image_nm),
                contentDescription = "Contact profile picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Column {
                Text(text = msg.author)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = msg.body)
            }
        }

        Box(Modifier
            .padding(top = 10.dp)
            .background(
                Brush.horizontalGradient(
                    listOf(Color.Red, Color.Yellow)
                ))
            .size(100.dp)
            .clickable {
                Log.e("TAG", "===========>点点点")
            }
        )


    }
}

/* ②
@Preview
@Composable
fun PreviewMessageCard() {
    MessageCard(
        msg = Message(
            "Colleague",
            "Hey, take a look at Jetpack Compose, it's great!"))
}
*/

/*@Preview
@Composable
fun PreviewMessageCard() {
    ComposeTestTheme {
        MessageCard(
            msg = Message(
                "Colleague",
                "Hey, take a look at Jetpack Compose, it's great!"))
    }
}*/

@Preview(showBackground = true, group = "name")
@Composable
fun PreviewMessageCard(
    @PreviewParameter(TextPreviewParamsProvider::class) name: String
) {
    ComposeTestTheme {
        MessageCard(
            msg = Message(
                name,
                "Hey, take a look at Jetpack Compose, it's great!"
            )
        )
    }
}

class TextPreviewParamsProvider : PreviewParameterProvider<String> {
    override val values: Sequence<String> = sequenceOf(
        "Julia"
    )

}

