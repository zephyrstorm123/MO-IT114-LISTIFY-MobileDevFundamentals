package com.example.mo_it114_listify_mobiledevfundamentals

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import android.content.Intent
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mo_it114_listify_mobiledevfundamentals.ui.theme.MOIT114LISTIFYMobileDevFundamentalsTheme
import android.content.Context
import android.widget.EditText
import android.widget.Toast
import java.io.IOException

data class User(val username: String, val password: String)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createAccountBtn: Button = findViewById(R.id.createAcctBtn)
        val forgotPasswordBtn: TextView = findViewById<TextView>(R.id.forgotPassword)

        // Set an OnClickListener on the "Create Account" Button
        createAccountBtn.setOnClickListener {
            // Create an Intent to start the CreateAccountActivity
            val intent = Intent(this, CreateAccountActivity::class.java)
            startActivity(intent)
        }

        // Set an OnClickListener on the "Forgot Password" Button
        forgotPasswordBtn.setOnClickListener {
            // Create an Intent to start the ForgotPasswordActivity
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
    }



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MOIT114LISTIFYMobileDevFundamentalsTheme {
        Greeting("Android")
    }
}
}