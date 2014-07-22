package com.prosodie.ws.mes;



import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.ws.addressing.MAPAggregator;
import org.apache.cxf.ws.addressing.WSAddressingFeature;
import org.apache.cxf.ws.addressing.soap.MAPCodec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import es.telefonica.mimovistar.MiMovistarPortType;




public class MiMovistarSOAP11ITCase extends MiMovistarITCase
{

	static final Logger logger = LoggerFactory.getLogger(MiMovistarSOAP11ITCase.class);
	
	public MiMovistarSOAP11ITCase()
	{
		super();
		
		logger.info("Initializing SOAP 1.1 testing ...");

		Service service = Service.create(serviceName);
		service.addPort(portName,SOAPBinding.SOAP11HTTP_BINDING,"http://"+ host + ":"+ port+ "/MiMovistar/");

		MiMovistarPortType client = service.getPort(portName,MiMovistarPortType.class);

		// Logging
		Client c = ClientProxy.getClient(client);
		c.getInInterceptors().add(new LoggingInInterceptor());
		c.getOutInterceptors().add(new LoggingOutInterceptor());
		
				

		if (addressing)
		{
			
			
			Endpoint endPoint = c.getEndpoint();
			endPoint.getActiveFeatures().add(new WSAddressingFeature());
			
			
			c.getOutInterceptors().add(new MAPAggregator());
			c.getOutInterceptors().add(new MAPCodec());

			
		}
		
		this.test = new MiMovistarTest(client);

	}

	

	
	
	
}
