// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val eMail: String, val senha: String, val nivelConhecimento: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivelDificuldade: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }

    fun getSubscribedByLevel(): List<Usuario> {
        return inscritos.sortedBy { it.nivelConhecimento }
    }

    fun isUsuarioInscrito(usuario: Usuario): Boolean {
        return usuario in inscritos
    }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    val user1 = Usuario("Mark", "fzuckerberg@gmail.com", "s1234", Nivel.INTERMEDIARIO)
    val user2 = Usuario("jeff", "awsbesos@gmail.com", "saws123", Nivel.AVANCADO)
    val user3 = Usuario("bill", "mgates@gmail.com", "sm1234", Nivel.BASICO)

    val conteudo1 = ConteudoEducacional("Introdução à Programação Kotlin")
    val conteúdo2 = ConteudoEducacional("Programação Orientada à Objetos Utilizando Kotlin", 120)
    val conteudo3 = ConteudoEducacional("Advanced Kotlin", 300)

    val formacao1 = Formacao("$conteudo1", Nivel.BASICO, listOf(conteudo1, conteúdo2, conteudo3))

    formacao1.matricular(user1)
    formacao1.matricular(user2)
    formacao1.matricular(user3)

    println("Usuários inscritos no ${formacao1.nome}:")
}