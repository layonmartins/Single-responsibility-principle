package withoutSRP;

import java.lang.reflect.Method;

public class MocoDoComputador implements AnalistaDeTI {


	//Na classe principal, são listados todos os metodos da classe no console.
	public static void main(String[] args) {
		Class<MocoDoComputador> c = MocoDoComputador.class;
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
         System.out.println(m[i].toString());
	}
	
	
	@Override
	public void DesenvolverSistemas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesenvolverSites() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesenvolverSisteminhas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesenvolverERP() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesenvolverDesktop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DesenvolverAndroid() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ManutencaoSistema() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConfigurarServidor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SuporteUsuario() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConfigurarRede() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InstalarRoteador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PassarCabodeRede() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InstalarVentiladorTeto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LimparArCondicionado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarImpressora() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EntregarCartas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FazerCobranca() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FazerCompras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarTorneiraCozinha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscarCriancaEscolaPatrao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarABSCarro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Pagamentos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Contratacao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Demicao() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CalculoHoraExtra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ProjetinhoEletrico() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarGeladeira() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OrganizarCampanhas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TrocarLampadas() {
		// TODO Auto-generated method stub
		
	}
}
