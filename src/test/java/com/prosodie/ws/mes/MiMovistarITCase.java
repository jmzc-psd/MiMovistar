package com.prosodie.ws.mes;

import javax.xml.namespace.QName;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



import es.telefonica.mimovistar.types.EventoContadorPromocionesResponseType;
import es.telefonica.mimovistar.types.EventoUmbralPromocionesResponseType;


public  class MiMovistarITCase
{

	
	static final Logger logger = LoggerFactory.getLogger(MiMovistarITCase.class);
	
	// Habilita/deshabilita el uso de WS-Addressing desde el cliente
	protected final boolean addressing = false;

	
	//fe08bkl-gs-tme
	
	/*
	protected final String host = "10.35.15.217";
	protected final String port = "8080";
	*/
	

	// pegaso1
	/*
	protected final String host = "10.35.27.21";
	protected final String port = "8080";
	*/
	
	//perseo5
	/*
	protected final String host = "perseo5";
	protected final String port = "9999";
	*/
	
	
	
	protected final String host = "localhost";
	protected final String port = "8080";
	
	
	
	
	
	QName serviceName = new QName("urn:es:telefonica:mimovistar", "MiMovistarService");
	QName portName    = new QName("urn:es:telefonica:mimovistar", "MiMovistarPortType");
	

	protected MiMovistarTest test;
	
	
	@Test
	public void eventoContadorPromocionesOKTest()
    {
		try
		{

				String msisdn 			= "34606958413";
				String indicador		= "1641";
				Long fechaEvento 		= 1400831101l;
				Integer puertoServidor	= 1024;
				Integer subindice		= 1;
				Integer idCombo			= 2;
				
				EventoContadorPromocionesResponseType  response = test.eventoContadorPromociones(msisdn,indicador,fechaEvento,puertoServidor,subindice,idCombo);
				
				Assert.assertTrue(response != null && "000".equals(response.getCodRetorno()) && msisdn.equals(response.getMsisdn()));


		}
		catch(Exception e)
		{
			
			Assert.fail(e.getMessage());
		}
				
    }
    
  
	
		
	@Test
	public void eventoUmbralPromocionesOKTest()
    {
		try
		{


			String msisdn 			= "34606958413";
			String indicador		= "1641";
			Long fechaEvento 		= 1400831101l;
			Integer puertoServidor	= 1024;
			Integer subindice		= 1;
			Integer idCombo			= 2;
			Integer umbralXN 		= 1000;
			Integer umbralPromo		= 2000;
			
			
			EventoUmbralPromocionesResponseType  response = test.eventoUmbralPromociones(msisdn,indicador,fechaEvento,puertoServidor,umbralXN,umbralPromo,subindice,idCombo);
			
			Assert.assertTrue(response != null && "000".equals(response.getCodRetorno()) && msisdn.equals(response.getMsisdn()));
			

		}
		catch(Exception e)
		{
			
			Assert.fail(e.getMessage());
		}
				
    }
	

	
		
	
}
