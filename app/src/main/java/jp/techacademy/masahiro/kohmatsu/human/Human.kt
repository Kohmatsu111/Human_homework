package jp.techacademy.masahiro.kohmatsu.human

import android.icu.text.StringSearch
import android.util.Log
// Animalクラスを継承したHumanクラスを宣言
    class Human : Animal{
        //引数付きコンストラクタをAnimalクラスから継承
        constructor(name: String, age: Int) : super(name, age)
//Human クラス内で、hobby を定義
    var hobby: String
        //引数付きコンストラクタ
        constructor(hobby: String) {
            this.hobby = hobby
        }

        // Animalクラスのメソッドをオーバーライド
        override fun say() {
            Log.d("human", "私の名前は" + this.name + "です。 年は" + this.age + "歳です。")

            // Thinkable クラスのメソッドをHumanクラスに実装
            fun think() {
                Log.d("human", "私は" + this.hobby + "について考える。")

            }
        }
    }
