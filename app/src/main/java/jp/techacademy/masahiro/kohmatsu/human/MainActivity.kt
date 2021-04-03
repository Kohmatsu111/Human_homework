package jp.techacademy.masahiro.kohmatsu.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前を「幸松正浩」、年齢「43」歳、趣味「自転車」のHumanインスタンスを作る
        val human = Human("幸松正浩",43,"自転車")

        human.say()
        human.think()
    }
}