//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        LojaDeRoupa loja = new LojaDeRoupa();
        MeioAmbiente meioAmbiente = new MeioAmbiente();
        Mascaras mascaras = new Mascaras();

        loja.CadastrarVendedora();
        loja.DefinirPrecoProduto();
        loja.AtribuirVendedoraParaCliente();

        meioAmbiente.DefinirNomeDaArvore();
        meioAmbiente.DefinirQuantidadeDeFolhasPorArvore();
        meioAmbiente.DefinirTipoDeSolo();

        mascaras.DefinirConjuntoMascara();
        mascaras.BuscarTipoDeOlhoPorMascara();
        mascaras.EditarConjuntoMascara();
    }
}