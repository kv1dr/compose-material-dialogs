package com.vanpra.composematerialdialogs

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.ui.core.setContent
import androidx.ui.foundation.Text
import androidx.ui.material.TextButton
import com.vanpra.composematerialdialogs.datetime.datepicker
import com.vanpra.composematerialdialogs.datetime.datetimepicker
import com.vanpra.composematerialdialogs.ui.ComposeMaterialDialogsTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeMaterialDialogsTheme {
                val dialog = MaterialDialog()

                dialog.build {
                    datetimepicker()
                }
                
                TextButton(onClick = { dialog.show() }) {
                    Text("SHOW")
                }
//
//                MaterialDialog(showing).draw {
//                    title("Use Google's Location")
//                    message(
//                        """Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum
//                    hendrerit risus eu sem aliquam rhoncus. Aliquam ullamcorper tincidunt elit,
//                    in aliquam sapien. Nunc a porttitor nulla, at semper orci. Etiam at orci in ante
//                    sagittis facilisis quis eget nisi. Praesent volutpat sem ac quam rutrum,
//                    sit amet hendrerit ligula tempor."""
//                    )
//                    negativeButton(text = "Disagree", onClick = { showing.value = false })
//                    positiveButton(text = "Agree", onClick = {})
//                }
            }
        }
    }
}