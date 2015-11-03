package withSRP;

import java.lang.reflect.Method;

public class Teste2 {

	public static void main(String[] args) {
		Class c = MocoDeRedes.class;
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = MocoDoSuporte.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = MocodaTI.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = MeninaBaba.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = MocoDaLogistica.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = Motoqueiro.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = GarotoPropraganda.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = OsCaraDoRH.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = MocoDoComputador.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        c = Jose.class;
        m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].toString());
        
        
       
	}
}

//classes que implementão as interfaces Muahhahahahah
class MocoDeRedes implements AnalistaDeRedes {

	@Override
	public void ConfigurarRede() {
		// TODO Auto-generated method stub
		
	}
	
}

class MocoDoSuporte implements AnalistaDeSuporte {

	@Override
	public void SuporteUsuario() {
		// TODO Auto-generated method stub
		
	}
	
}

class MocodaTI implements AnalistaDeTI {

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
	
}

class MeninaBaba implements Baba {

	@Override
	public void buscarCriancaEscolaPatrao() {
		// TODO Auto-generated method stub
		
	}
	
}

class MocoDaLogistica implements Logistica {

	@Override
	public void FazerCompras() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarABSCarro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ProjetinhoEletrico() {
		// TODO Auto-generated method stub
		
	}
	
}

class Motoqueiro implements OfficeBoy {

	@Override
	public void EntregarCartas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FazerCobranca() {
		// TODO Auto-generated method stub
		
	}
	
}

class GarotoPropraganda implements Publicitario {

	@Override
	public void OrganizarCampanhas() {
		// TODO Auto-generated method stub
		
	}
	
}

class OsCaraDoRH implements RH {

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
	
}

class MocoDoComputador implements TecnicoInformatica {

	@Override
	public void InstalarRoteador() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PassarCabodeRede() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarImpressora() {
		// TODO Auto-generated method stub
		
	}
	
}

 class Jose implements TecnicoServicosGerais {

	@Override
	public void InstalarVentiladorTeto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void LimparArCondicionado() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarTorneiraCozinha() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ConsertarGeladeira() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TrocarLampadas() {
		// TODO Auto-generated method stub
		
	}
	 
 }
