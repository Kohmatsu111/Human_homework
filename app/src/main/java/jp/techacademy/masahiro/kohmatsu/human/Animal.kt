package jp.techacademy.masahiro.kohmatsu.human

//基底クラス
abstract class Animal{
    //プロパティ
    var name: String
    var age: Int

    //引数付きコンストラクタ
    constructor(name:String, age:Int){
        this.name = name
        this.age = age

    }

    abstract fun say()

}