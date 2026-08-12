// calcula a nota final da disciplina
// media = P1*0.5 + E1*0.2 + E2*0.3 + X + SUB*0.15
// a SUB so e pedida quando o aluno nao fez a P1
// a API so entra se a media passar de 5.9
// quem nao fecha 6 vai para o exame final

algoritmo "calculo de nota"

var
   p1, e1, e2, x, sub, api, exf: real
   media, nota, notafinal: real
   resp: caractere

inicio

   escreva("O aluno fez a P1? (S/N): ")
   leia(resp)

   se (resp = "S") ou (resp = "s") entao
      escreva("Nota da P1: ")
      leia(p1)
      sub <- 0
   senao
      p1 <- 0
      escreva("Nota da SUB: ")
      leia(sub)
   fimse

   escreva("Nota da E1: ")
   leia(e1)
   escreva("Nota da E2: ")
   leia(e2)
   escreva("Atividades extras (X): ")
   leia(x)

   media <- p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + x + sub * 0.15

   se media > 5.9 entao
      escreva("Nota da API: ")
      leia(api)
      nota <- media * 0.5 + api * 0.5
   senao
      escreval("Media abaixo de 6, a API nao entra no calculo")
      nota <- media * 0.5
   fimse

   notafinal <- nota

   se nota < 6 entao
      escreval("")
      escreval("Nota parcial: ", nota:4:2)
      escreval("O aluno ficou de exame final")
      escreva("Nota do Exame Final: ")
      leia(exf)
      se exf > nota entao
         notafinal <- exf
      fimse
   fimse

   se notafinal > 10 entao
      notafinal <- 10
   fimse

   escreval("")
   escreval("Media das avaliacoes: ", media:4:2)
   escreval("Nota final: ", notafinal:4:2)

   se notafinal >= 6 entao
      escreval("Aprovado")
   senao
      escreval("Reprovado")
   fimse

fimalgoritmo