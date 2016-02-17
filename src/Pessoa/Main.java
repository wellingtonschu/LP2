package Pessoa;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Wellington","Rua do Bocó","123.454.321-99","Panaca");

		/*
		pf.setNome("Wellington");
		pf.setEstadoCivil("Solteiro");
		pf.setCpf("123.454.321-99");
		pf.setEndereco("Rua Principal, 1");
		*/

        System.out.println(pf);

        PessoaJuridica pj = new PessoaJuridica("IFC","Rua Sei Lá","123.4567.0001/98","MEI");

		/*
		pj.setNome("Empresa S/A");
		pj.setEndereco("Rua das Empresas");
		pj.setCnpj("123.4567.0001/98");
		pj.setTipoempresa("MEI");
		*/

        System.out.println(pj);

    }

}