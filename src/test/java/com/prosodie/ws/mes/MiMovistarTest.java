package com.prosodie.ws.mes;



import es.telefonica.mimovistar.MiMovistarPortType;
import es.telefonica.mimovistar.types.EventoContadorPromocionesResponseType;
import es.telefonica.mimovistar.types.EventoContadorPromocionesType;
import es.telefonica.mimovistar.types.EventoUmbralPromocionesResponseType;
import es.telefonica.mimovistar.types.EventoUmbralPromocionesType;
import es.telefonica.mimovistar.types.ObjectFactory;






public class MiMovistarTest
{

	
		private MiMovistarPortType client;
		
		private ObjectFactory factory = new ObjectFactory();
		
		
		
		public MiMovistarTest(MiMovistarPortType client)
		{
			super();
			this.client = client;
			
		}
	
		
		public EventoContadorPromocionesResponseType  eventoContadorPromociones(String msisdn, String indicador, Long fechaEvento, Integer puertoServidor, Integer subindice,Integer idCombo)
		throws Exception
		{
			EventoContadorPromocionesType request = factory.createEventoContadorPromocionesType();
			request.setMsisdn(msisdn);
			request.setIndicador(indicador);
			request.setFechaEvento(fechaEvento);
			request.setPuertoServidor(puertoServidor);
			request.setSubindice(subindice);
			request.setIdCombo(idCombo);
				
			return client.eventoContadorPromociones(request);

			
		}
		
		
	public EventoUmbralPromocionesResponseType eventoUmbralPromociones(String msisdn, String indicador, Long fechaEvento, Integer puertoServidor, Integer umbralXN, Integer umbralPromo,Integer subindice,Integer idCombo)
	throws Exception
	{
		EventoUmbralPromocionesType request = factory.createEventoUmbralPromocionesType();
		request.setMsisdn(msisdn);
		request.setIndicador(indicador);
		request.setFechaEvento(fechaEvento);
		request.setPuertoServidor(puertoServidor);
		request.setSubindice(subindice);
		request.setIdCombo(idCombo);
		request.setUmbralXN(umbralXN);
		request.setUmbralPromo(umbralPromo);


		return client.eventoUmbralPromociones(request);

	}
		
	
	
	
		
		
}
