package jp.techacademy.masahiro.kohmatsu.human

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前を「幸松正浩」、「年齢43歳」のHumanインスタンスを作る
        val human = Human("幸松正浩",43, "自転車")

        human.say()//　自己紹介文

        human.think()// 趣味に関して

    }
}