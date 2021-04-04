package jp.techacademy.masahiro.kohmatsu.human

import android.icu.text.StringSearch
import android.util.Log
// Animalクラスを継承したHumanクラスを宣言
    class Human : Animal {
    var hobby: String

    //引数付きコンストラクタをAnimalクラスから継承
    constructor(name: String, age: Int, hobby: String) : super(name, age) {

        this.hobby = hobby
    }


    // Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("human", "私の名前は" + this.name + "です。 年は" + this.age + "歳です。")
    }
        // Thinkable クラスのメソッドを実装
        fun think() {
            Log.d("human", "私は" + this.hobby + "について考える。")
        }
    }


