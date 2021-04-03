package jp.techacademy.masahiro.kohmatsu.human

abstract class Animal{
    //プロパティ
    var name: String
    var age: Int
    var hobby: String

    //コンストラクタ
    constructor(name:String, age: Int, hobby:String){
        this.name = name
        this.age = age
        this.hobby = hobby

    }

    abstract fun say()
    abstract fun think()

}