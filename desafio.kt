
class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60){

}
data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        var nome = usuario.nome
        if (usuario in inscritos){
            println("Esse usuário já está inscrito")
        }
        else{
            println("Usuário $nome adicionado a lista de inscritos")
        	inscritos.add(usuario)
        }       
    }
    
    fun matricular_usuarios(vararg users: Usuario){
        users.forEach{
            matricular(it)
        }
    }
    
    fun listarinscritos(){
        for (inscrito in inscritos){
            println(inscrito.nome)
            
        }
      }
    fun listarconteudos(){
        for (conteudo in conteudos){
            println(conteudo.nome)
        }
    }
    }


fun main() {
   
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    
   val usuario1 = Usuario("Roger")
   val usuario2 = Usuario("Luis")
   val usuario3 = Usuario("Marta")
   
   
   // criação dos conteúdos
   val oop = ConteudoEducacional("PROGRAMAÇÃO ORIENTADA A OBJETOS", 45)
   val logica_kt = ConteudoEducacional("Lógica de programação em kotlin", 55)
   
   // criação da lista de conteudos
   val conteudos_kt = mutableListOf<ConteudoEducacional>()
   conteudos_kt.add(oop)
   conteudos_kt.add(logica_kt)
   
   // inicialização da primeira formação
   val kotlin_iniciante = Formacao("Kotlin", conteudos_kt )
   
   
   //testes
   kotlin_iniciante.matricular(usuario1)
   kotlin_iniciante.matricular_usuarios(usuario1,usuario2,usuario3)
   kotlin_iniciante.matricular_usuarios(usuario1,usuario2,usuario3)
   
   
   kotlin_iniciante.listarinscritos()
   kotlin_iniciante.listarconteudos()