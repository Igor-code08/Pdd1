package com.example.pdd

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val checkboxInfo = findViewById<CheckBox>(R.id.checkbox_info)
        val textInfo = findViewById<TextView>(R.id.text_info)
        val textRules = findViewById<TextView>(R.id.text_rules)

        checkboxInfo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                textInfo.text = "Правила дорожного движения"
                textRules.text = """
                    1. Соблюдайте скоростной режим.
                    2. Уступайте дорогу пешеходам.
                    3. Не используйте телефон за рулем.
                    4. Пристегивайтесь ремнями безопасности.
                """.trimIndent()
            } else {
                textInfo.text = ""
                textRules.text = ""
            }
        }
    }
}