package es.telefonica.mimovistar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import es.telefonica.mimovistar.types.EventoContadorPromocionesResponseType;
import es.telefonica.mimovistar.types.EventoContadorPromocionesType;
import es.telefonica.mimovistar.types.EventoUmbralPromocionesResponseType;
import es.telefonica.mimovistar.types.EventoUmbralPromocionesType;
import es.telefonica.mimovistar.types.ObjectFactory;
import es.telefonica.mimovistar.util.Util;

@WebService(endpointInterface = "es.telefonica.mimovistar.MiMovistarPortType", serviceName = "MiMovistarService")
public class  MiMovistarService implements MiMovistarPortType
{

	Logger logger = LoggerFactory.getLogger(this.getClass().getName());

	
	
	ObjectFactory factory = new ObjectFactory();
	
	@Override
	@WebResult(name = "eventoContadorPromocionesResponse", targetNamespace = "urn:es:telefonica:mimovistar:types", partName = "parameters")
	@WebMethod(action = "eventoContadorPromociones")
	public EventoContadorPromocionesResponseType eventoContadorPromociones(@WebParam(partName = "parameters", name = "eventoContadorPromociones", targetNamespace = "urn:es:telefonica:mimovistar:types") EventoContadorPromocionesType request)
	{
		
		long start = System.currentTimeMillis();

		EventoContadorPromocionesResponseType response = this.factory.createEventoContadorPromocionesResponseType();

		String msisdn 			= request.getMsisdn();
		String indicador		= request.getIndicador();
		Long fechaEvento 		= request.getFechaEvento();
		Integer puertoServidor	= request.getPuertoServidor();
		Integer subindice		= request.getSubindice();
		Integer idCombo			= request.getIdCombo();
		
		try
		{
			
			logger.info("[START][MSISDN={}][INDICADOR={}][FECHA_EVENTO={}][PUERTO_SERVIDOR={}][SUBINDICE][ID_COMBO={}]", msisdn, indicador,fechaEvento,puertoServidor,subindice,idCombo);
		
			response.setCodRetorno(Util.ERROR_CODE.OK.code());
			response.setMsisdn(msisdn);
			
		}
		catch (Exception e)
		{

			logger.error("[EXCEPTION]", e);
			response.setCodRetorno(Util.ERROR_CODE.GENERAL.code());
			response.setMsisdn(msisdn);

		}
		finally
		{

			long end = System.currentTimeMillis();

			long time = end - start;

			logger.info("[FINISH][TIME_ELAPSED={}][MSISDN={}][INDICADOR={}][FECHA_EVENTO={}][PUERTO_SERVIDOR={}][SUBINDICE][ID_COMBO={}]", time, msisdn, indicador,fechaEvento,puertoServidor,subindice,idCombo);

		}
		
		return response;

	}



	@Override
	@WebResult(name = "eventoUmbralPromocionesResponse", targetNamespace = "urn:es:telefonica:mimovistar:types", partName = "parameters")
	@WebMethod(action = "eventoUmbralPromociones")
	public EventoUmbralPromocionesResponseType eventoUmbralPromociones(@WebParam(partName = "parameters", name = "eventoUmbralPromociones", targetNamespace = "urn:es:telefonica:mimovistar:types") EventoUmbralPromocionesType request)
	{
		long start = System.currentTimeMillis();

		EventoUmbralPromocionesResponseType response = this.factory.createEventoUmbralPromocionesResponseType();


		String msisdn 			= request.getMsisdn();
		String indicador		= request.getIndicador();
		Long fechaEvento 		= request.getFechaEvento();
		Integer puertoServidor	= request.getPuertoServidor();
		Integer umbralXN 		= request.getUmbralXN();
		Integer umbralPromo		= request.getUmbralPromo();
		Integer subindice		= request.getSubindice();
		Integer idCombo			= request.getIdCombo();
		
		try
		{
			
			logger.info("[START][MSISDN={}][INDICADOR={}][FECHA_EVENTO={}][PUERTO_SERVIDOR={}][UMBRAL_XN={}][UMBRAL_PROMO={}][SUBINDICE][ID_COMBO={}]", msisdn, indicador,fechaEvento,puertoServidor, umbralXN, umbralPromo, subindice,idCombo);
		
			response.setCodRetorno(Util.ERROR_CODE.OK.code());
			response.setMsisdn(msisdn);
			
		}
		catch (Exception e)
		{

			logger.error("[EXCEPTION]", e);
			response.setCodRetorno(Util.ERROR_CODE.GENERAL.code());
			response.setMsisdn(msisdn);

		}
		finally
		{

			long end = System.currentTimeMillis();

			long time = end - start;
			
			logger.info("[FINISH][TIME_ELAPSED={}][MSISDN={}][INDICADOR={}][FECHA_EVENTO={}][PUERTO_SERVIDOR={}][UMBRAL_XN={}][UMBRAL_PROMO={}][SUBINDICE][ID_COMBO={}]", time,msisdn, indicador,fechaEvento,puertoServidor, umbralXN, umbralPromo, subindice,idCombo);
			

		}
		
		return response;

	}

	

	
	
	



}
