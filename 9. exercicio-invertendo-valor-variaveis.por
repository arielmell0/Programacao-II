programa
{
	
	funcao inicio()
	{
		inteiro x, y, auxiliar
		
		escreva("Digite o valor de x: ")
		leia(x)
		escreva("Digite o valor de y: ")
		leia(y)
		
		auxiliar = x
		x = y
		y = auxiliar
		
		escreva("x = ", x, "\n")
		escreva("y = ", y)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */